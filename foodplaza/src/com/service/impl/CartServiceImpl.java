package com.service.impl;

import com.dao.impl.CartDaoImpl;
import com.dto.CartDTO;
import com.service.CartService;
import com.dao.*;
public class CartServiceImpl implements CartService {

	CartDao cartDao = new CartDaoImpl();
	
	@Override
	public boolean isAddedToCart(CartDTO cart) {
		return cartDao.isAddedtoCart(cart);
	}

	@Override
	public boolean isDeletedFromCart(CartDTO cart) {
		return cartDao.isDeletedFromCart(cart);
	}

}