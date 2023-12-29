package com.service;

import com.dto.CartDTO;

public interface CartService {
	boolean isAddedToCart(CartDTO cart);
	boolean isDeletedFromCart(CartDTO cart);
}