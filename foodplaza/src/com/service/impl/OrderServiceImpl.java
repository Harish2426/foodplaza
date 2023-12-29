package com.service.impl;
import com.dao.impl.*;
import com.service.*;
import com.dto.OrderDTO;
import com.dto.ProductDTO;
import com.dao.*;
public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao = new OrderDaoImpl();
	
	@Override
	public boolean isOrderPlaced(OrderDTO order) {
		return orderDao.isOrderPlaced(order);
	}

	@Override
	public boolean isOrderCancelled(OrderDTO order) {
		return orderDao.isOrderCancelled(order);
	}

}