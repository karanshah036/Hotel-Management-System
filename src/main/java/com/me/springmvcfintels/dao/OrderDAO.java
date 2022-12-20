package com.me.springmvcfintels.dao;

import java.util.List;

import com.me.springmvcfintels.model.CartInfo;
import com.me.springmvcfintels.model.OrderDetailInfo;
import com.me.springmvcfintels.model.OrderInfo;
import com.me.springmvcfintels.model.PaginationResult;

public interface OrderDAO {

	public void saveOrder(CartInfo cartInfo);

	public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);

	public OrderInfo getOrderInfo(String orderId);

	public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
