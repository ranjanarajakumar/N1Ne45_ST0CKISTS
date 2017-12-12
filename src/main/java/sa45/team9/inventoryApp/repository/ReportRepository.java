package sa45.team9.inventoryApp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sa45.team9.inventoryApp.model.Parts;

public interface ReportRepository extends JpaRepository<Parts, String>{
	@Query("SELECT p from Parts p WHERE p.partSupplierID= :eid")
	  ArrayList<Parts> findPendingProductByID(@Param("eid") String eid);
}
