package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import top.ifenxiang.pojo.Product;

@SuppressWarnings("all")
public class PoiTest {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Administrator\\Downloads\\女装1-2018-02-02.xls");
			FileInputStream fileInputStream = new FileInputStream(file);
			HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);
			HSSFSheet sheet = wb.getSheetAt(0);
			List<Product> list = new ArrayList<Product>();
			for (Row row : sheet) {
				int i = row.getRowNum();
				if (i == 0) {
					continue;
				}
			    Long id 					= null;
			    String taobaoPid			= row.getCell(0).getStringCellValue();
			    String productName			= row.getCell(1).getStringCellValue();
			    String productIndexImage	= row.getCell(2).getStringCellValue();
			    Double shopPrice			= Double.valueOf(row.getCell(5).getStringCellValue());
			    Integer salesMonth			= Integer.valueOf(row.getCell(6).getStringCellValue());
				String tkUrl1				= row.getCell(16).getStringCellValue();
				String tkUrl2				= row.getCell(15).getStringCellValue();
				String tkToken				= row.getCell(17).getStringCellValue();
				Integer discountTotal		= Integer.valueOf(row.getCell(18).getStringCellValue());
				Integer discountResidue		= Integer.valueOf(row.getCell(19).getStringCellValue());
				String discountDetail		= row.getCell(20).getStringCellValue();
				SimpleDateFormat sdf 		= new SimpleDateFormat("yyyy-mm-dd");//2018-01-29
				Date discountStart			= StringUtils.isNotBlank(row.getCell(21).getStringCellValue()) ? sdf.parse(row.getCell(21).getStringCellValue()) : null;
				Date discountEnd			= StringUtils.isNotBlank(row.getCell(22).getStringCellValue()) ? sdf.parse(row.getCell(21).getStringCellValue()) : null;
				String discountUrl1			= row.getCell(23) != null ? row.getCell(23).getStringCellValue() : null;
				String discountUrl2			= row.getCell(25) != null ? row.getCell(25).getStringCellValue() : null;
				String discountToken		= row.getCell(24) != null ? row.getCell(24).getStringCellValue() : null;
				Date createTime				= new Date();
				Date updateTime				= new Date();
				// 0商品id 1商品名称 2商品主图 3商品详情页链接地址 4店铺名称 5商品价格(单位：元) 6商品月销量
				// 7通用收入比率(%) 8通用佣金 9活动状态 10活动收入比率(%) 11活动佣金 12活动开始时间 13活动结束时间
				// 14卖家旺旺 15淘宝客短链接(300天内有效) 16淘宝客链接 17淘口令(30天内有效) 18优惠券总量
				// 19优惠券剩余量 20优惠券面额 21优惠券开始时间 22优惠券结束时间 23优惠券链接 24优惠券淘口令(30天内有效)
				// 25优惠券短链接(300天内有效)
				Product product = new Product(id, taobaoPid, productName, productIndexImage, shopPrice, salesMonth, tkUrl1, tkUrl2, tkToken, discountTotal, discountResidue, discountDetail, discountStart, discountEnd, discountUrl1, discountUrl2, discountToken, createTime, updateTime ,"");
				list.add(product);
				System.out.println(product.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
