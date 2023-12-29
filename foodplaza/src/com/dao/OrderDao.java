package com.dao;

import com.dto.OrderDTO;

public interface OrderDao {
	boolean isOrderPlaced(OrderDTO order);
	boolean isOrderCancelled(OrderDTO order);
}