package sa45.team9.inventoryApp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sa45.team9.inventoryApp.model.OrderDetails;
import sa45.team9.inventoryApp.model.PartSearchCriteria;
import sa45.team9.inventoryApp.model.Parts;

public interface PartRepository extends JpaRepository<Parts,String>{
	
	//@Query("SELECT p FROM Parts p where p.partNumber like %:pn% AND p.partDescription like %:pd% AND p.partColor like %:pc% AND p.partManufacturer like %:pm%")
	//ArrayList<Parts> findParts(@Param("pn") String pn, @Param("pd") String pd, @Param("pc") String pc, @Param("pm") String pm);
	
	@Query("SELECT DISTINCT p.partNumber FROM Parts p")
	ArrayList<String> findAllPartNumbers();
		
	@Query("SELECT p FROM Parts p where p.partNumber = :id")
	Parts viewPartDetails(@Param("id") String id);
		
	//1
	@Query("SELECT p FROM Parts p where p.partNumber = :pn")
	ArrayList<Parts> findPartByNumber(@Param("pn") String pn);
	//2
	@Query("SELECT p FROM Parts p where p.partDescription like '%:pd%'")
	ArrayList<Parts> findPartByDescription(@Param("pd") String pd);
	//3
	@Query("SELECT p FROM Parts p where p.partColor like '%:pc%'")
	ArrayList<Parts> findPartByColor(@Param("pc") String pc);
	//4
	@Query("SELECT p FROM Parts p where p.partManufacturer like '%:pm%'")
	ArrayList<Parts> findPartByManufacturer(@Param("pm") String pm);
	//5
	@Query("SELECT p FROM Parts p where p.partNumber like '%:pn%' AND p.partDescription like '%:pd%'")
	ArrayList<Parts> findPartByNumberAndDescription(@Param("pn") String pn, @Param("pd") String pd);
	//6
	@Query("SELECT p FROM Parts p where p.partNumber like '%:pn%' AND p.partColor like '%:pc%'")
	ArrayList<Parts> findPartByNumberAndColor(@Param("pn") String pn, @Param("pc") String pd);
	//7
	@Query("SELECT p FROM Parts p where p.partNumber like '%:pn%' AND p.partManufacturer like '%:pm%'")
	ArrayList<Parts> findPartByNumberAndManufacturer(@Param("pn") String pn, @Param("pm") String pm);
	//8
	@Query("SELECT p FROM Parts p where p.partDescription like '%:pd%' AND p.partColor like '%:pc%'")
	ArrayList<Parts> findPartByDescriptionAndColor(@Param("pd") String pd, @Param("pc") String pc);
	//9
	@Query("SELECT p FROM Parts p where p.partDescription like '%:pd%' AND p.partManufacturer like '%:pm%'")
	ArrayList<Parts> findPartByDescriptionAndManufacturer(@Param("pd") String pd, @Param("pm") String pm);
	//10
	@Query("SELECT p FROM Parts p where p.partColor like '%:pc%' AND p.partManufacturer like '%:pm%'")
	ArrayList<Parts> findPartByColorAndManufacturer(@Param("pc") String pc, @Param("pm") String pm);
	//11
	@Query("SELECT p FROM Parts p where p.partNumber like '%:pn%' AND p.partDescription like '%:pd%' AND p.partColor like '%:pc%'")
	ArrayList<Parts> findPartByNumberAndDescriptionAndColor(@Param("pn") String pn, @Param("pd") String pd, @Param("pc") String pc);
	//12
	@Query("SELECT p FROM Parts p where p.partNumber like '%:pn%' AND p.partDescription like '%:pd%' AND p.partManufacturer like '%:pm%'")
	ArrayList<Parts> findPartByNumberAndDescriptionAndManufacturer(@Param("pn") String pn, @Param("pd") String pd, @Param("pm") String pm);
	//13
	@Query("SELECT p FROM Parts p where p.partDescription like '%:pd%' AND p.partColor like '%:pc%' AND p.partManufacturer like '%:pm%'")
	ArrayList<Parts> findPartByDescriptionAndColorAndManufacturer(@Param("pd") String pd, @Param("pc") String pc, @Param("pm") String pm);
	//14
	@Query("SELECT p FROM Parts p where p.partNumber like %:pn% OR p.partDescription like %:pd% OR p.partColor like %:pc% OR p.partManufacturer like %:pm%")
	ArrayList<Parts> findPartByNumberAndDescriptionAndColorAndManufacturer(@Param("pn") String pn, @Param("pd") String pd, @Param("pc") String pc, @Param("pm") String pm);
	//15
	@Query("SELECT o FROM Parts p JOIN p.orderDetails o WHERE p.partNumber=:pn")
	ArrayList<OrderDetails> findAllOrders(@Param("pn") String pn);

}
