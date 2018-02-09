package top.ifenxiang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.ifenxiang.mapper.ProductMapper;
import top.ifenxiang.pojo.Product;
import top.ifenxiang.pojo.ProductExample;
import top.ifenxiang.pojo.ProductExample.Criteria;
import top.ifenxiang.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public void productAdd(List<Product> list) {
		for (Product product : list) {
			productMapper.insert(product);
		}
	}

	@Override
	public PageInfo<Product> selectProduct(Integer currentPage, Integer pageSize, ProductExample example) {
		PageHelper.startPage(currentPage, pageSize);
		List<Product> list = productMapper.selectByExample(example);
		PageInfo<Product> pageInfo = new PageInfo<>(list, pageSize);
		return pageInfo;
	}

}
