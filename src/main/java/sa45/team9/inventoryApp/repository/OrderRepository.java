package sa45.team9.inventoryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sa45.team9.inventoryApp.model.Orders;

public interface OrderRepository  extends JpaRepository<Orders,String> {

}
