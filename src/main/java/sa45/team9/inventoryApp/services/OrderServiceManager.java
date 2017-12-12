package sa45.team9.inventoryApp.services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sa45.team9.inventoryApp.model.Orders;
import sa45.team9.inventoryApp.repository.OrderRepository;

@Service
public class OrderServiceManager implements IOrderService {
	@Resource
	private OrderRepository orderRepository;
	
	@Override
	@Transactional
	public ArrayList<Orders> findAllOrders() {
		ArrayList<Orders> orderList = (ArrayList<Orders>)orderRepository.findAll();
		return orderList;
	}
}
