package sa45.team9.inventoryApp.services;

import java.util.ArrayList;

import sa45.team9.inventoryApp.model.Orders;

public interface IOrderService {
	ArrayList<Orders> findAllOrders();
}
