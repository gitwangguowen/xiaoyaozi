package top.ifenxiang.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.ifenxiang.pojo.Product;
import top.ifenxiang.pojo.ProductExample;
import top.ifenxiang.pojo.ProductExample.Criteria;
import top.ifenxiang.pojo.vo.DataResult;
import top.ifenxiang.service.ProductService;

@Controller
@SuppressWarnings("all")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product/getProductList/{currentPage}/{pageSize}")
	@ResponseBody
	public DataResult<PageInfo<Product>> getProductList(HttpServletRequest request, @PathVariable Integer currentPage,@PathVariable Integer pageSize) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		ProductExample example = new ProductExample();
		Criteria createCriteria = example.createCriteria();
		if (StringUtils.isNotBlank(type)) {
			createCriteria.andTypeEqualTo(type);
		}
		example.setOrderByClause(" id DESC");
		PageInfo<Product> pageInfo = productService.selectProduct(currentPage,pageSize,example);
		DataResult<PageInfo<Product>> dataResult = new DataResult<PageInfo<Product>>();
		dataResult.setCode(200);
		dataResult.setMessage("查询成功！");
		dataResult.setData(pageInfo);
		return dataResult;
	}

	@RequestMapping("/product/productAdd/{type}/{path}")
	@ResponseBody
	public DataResult<Product> productAdd(@PathVariable String type,@PathVariable String path) {
		try {
			File file = new File("C:\\Users\\Administrator\\Downloads\\"+path+".xls");
			FileInputStream fileInputStream = new FileInputStream(file);
			HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);
			HSSFSheet sheet = wb.getSheetAt(0);
			List<Product> list = new ArrayList<Product>();
			for (Row row : sheet) {
				int i = row.getRowNum();
				if (i == 0) {
					continue;
				}
				Long id = null;
				String taobaoPid = row.getCell(0).getStringCellValue();
				String productName = row.getCell(1).getStringCellValue();
				String productIndexImage = row.getCell(2).getStringCellValue();
				Double shopPrice = Double.valueOf(row.getCell(5).getStringCellValue());
				Integer salesMonth = Integer.valueOf(row.getCell(6).getStringCellValue());
				String tkUrl1 = row.getCell(16).getStringCellValue();
				String tkUrl2 = row.getCell(15).getStringCellValue();
				String tkToken = row.getCell(17).getStringCellValue();
				Integer discountTotal = Integer.valueOf(row.getCell(18).getStringCellValue());
				Integer discountResidue = Integer.valueOf(row.getCell(19).getStringCellValue());
				String discountDetail = row.getCell(20).getStringCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");// 2018-01-29
				Date discountStart = StringUtils.isNotBlank(row.getCell(21).getStringCellValue())
						? sdf.parse(row.getCell(21).getStringCellValue()) : null;
				Date discountEnd = StringUtils.isNotBlank(row.getCell(22).getStringCellValue())
						? sdf.parse(row.getCell(21).getStringCellValue()) : null;
				String discountUrl1 = row.getCell(23) != null ? row.getCell(23).getStringCellValue() : null;
				String discountUrl2 = row.getCell(25) != null ? row.getCell(25).getStringCellValue() : null;
				String discountToken = row.getCell(24) != null ? row.getCell(24).getStringCellValue() : null;
				Date createTime = new Date();
				Date updateTime = new Date();
				// 0商品id 1商品名称 2商品主图 3商品详情页链接地址 4店铺名称 5商品价格(单位：元) 6商品月销量
				// 7通用收入比率(%) 8通用佣金 9活动状态 10活动收入比率(%) 11活动佣金 12活动开始时间 13活动结束时间
				// 14卖家旺旺 15淘宝客短链接(300天内有效) 16淘宝客链接 17淘口令(30天内有效) 18优惠券总量
				// 19优惠券剩余量 20优惠券面额 21优惠券开始时间 22优惠券结束时间 23优惠券链接 24优惠券淘口令(30天内有效)
				// 25优惠券短链接(300天内有效)
				Product product = new Product(id, taobaoPid, productName, productIndexImage, shopPrice, salesMonth,
						tkUrl1, tkUrl2, tkToken, discountTotal, discountResidue, discountDetail, discountStart,
						discountEnd, discountUrl1, discountUrl2, discountToken, createTime, updateTime, type);
				list.add(product);
				System.out.println(product.toString());
			}
			productService.productAdd(list);
		} catch (Exception e) {
			e.printStackTrace();
			DataResult<Product> dataResult = new DataResult<Product>();
			dataResult.setCode(500);
			dataResult.setMessage("添加失败！");
			return dataResult;
		}
		DataResult<Product> dataResult = new DataResult<Product>();
		dataResult.setCode(200);
		dataResult.setMessage("添加成功！");
		return dataResult;
	}

	/*
	 * 通过流的方式上传文件
	 * 
	 * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
	 */
	@RequestMapping("fileUpload")
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws Exception {

		// 用来检测程序运行时间
		long startTime = System.currentTimeMillis();
		System.out.println("fileName：" + file.getOriginalFilename());

		try {
			// 获取输出流
			OutputStream os = new FileOutputStream("E:/" + new Date().getTime() + file.getOriginalFilename());
			// 获取输入流 CommonsMultipartFile 中可以直接得到文件的流
			InputStream is = file.getInputStream();
			int temp;
			// 一个一个字节的读取并写入
			while ((temp = is.read()) != (-1)) {
				os.write(temp);
			}
			os.flush();
			os.close();
			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法一的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "/success";
	}

	/*
	 * 采用file.Transto 来保存上传的文件
	 */
	@RequestMapping("fileUpload2")
	public String fileUpload2(@RequestParam("file") CommonsMultipartFile file) throws Exception {
		long startTime = System.currentTimeMillis();
		System.out.println("fileName：" + file.getOriginalFilename());
		String path = "E:/" + new Date().getTime() + file.getOriginalFilename();

		File newFile = new File(path);
		// 通过CommonsMultipartFile的方法直接写文件（注意这个时候）
		file.transferTo(newFile);
		long endTime = System.currentTimeMillis();
		System.out.println("方法二的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "/success";
	}

	/*
	 * 采用spring提供的上传文件的方法
	 */
	@RequestMapping("springUpload")
	public String springUpload(HttpServletRequest request) throws Exception {
		long startTime = System.currentTimeMillis();
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					String path = "E:/springUpload" + file.getOriginalFilename();
					// 上传
					file.transferTo(new File(path));
				}

			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "/success";
	}
}
