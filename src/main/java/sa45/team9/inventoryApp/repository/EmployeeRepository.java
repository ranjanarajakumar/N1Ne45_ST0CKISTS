package sa45.team9.inventoryApp.repository;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sa45.team9.inventoryApp.model.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer>{
	
//	@Query("SELECT e FROM Employees e where e.employeeID = :id")
//	Employees findEmployeeById(@Param("id") Integer id);
//	
//	@Query("SELECT DISTINCT e.EmployeeId FROM Employees e")
//	ArrayList<Integer> findAllEmployeeIDs();
//	
//	@Query("SELECT DISTINCT e FROM Employees e")
//	ArrayList<Employees> findAllEmployees();
}
