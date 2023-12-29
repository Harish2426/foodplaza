package com.service;

import com.dto.OrderDTO;

public interface OrderService {
	boolean isOrderPlaced(OrderDTO order);
	boolean isOrderCancelled(OrderDTO order);
}