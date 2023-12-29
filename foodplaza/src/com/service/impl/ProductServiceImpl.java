package com.service.impl;

import java.util.List;

import com.dto.ProductDTO;
import com.dao.*;
import com.dao.impl.ProductDaoImpl;
import com.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public boolean saveProduct(ProductDTO product) {
		return productDao.saveProduct(product);
	}

	@Override
	public boolean updateProduct(ProductDTO product) {
		return productDao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(ProductDTO product) {
		return productDao.deleteProduct(product);
	}

	@Override
	public ProductDTO searchProduct(String productName) {
		return productDao.searchProduct(productName);
	}

	@Override
	public List<ProductDTO> showAllProduct() {
		return productDao.showAllProduct();
	}

}