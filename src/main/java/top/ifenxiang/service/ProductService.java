package top.ifenxiang.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import top.ifenxiang.pojo.Product;
import top.ifenxiang.pojo.ProductExample;

public interface ProductService {

	void productAdd(List<Product> list);

	PageInfo<Product> selectProduct(Integer currentPage, Integer pageSize, ProductExample example);

}
