package com.dao;

import com.dto.CartDTO;

public interface CartDao {
	boolean isAddedtoCart(CartDTO cart);
    boolean isDeletedFromCart(CartDTO cart);
}