package sa45.team9.inventoryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sa45.team9.inventoryApp.model.Suppliers;

@Repository("suppliersRepository")
public interface SuppliersRepository extends JpaRepository<Suppliers, String>{

}
