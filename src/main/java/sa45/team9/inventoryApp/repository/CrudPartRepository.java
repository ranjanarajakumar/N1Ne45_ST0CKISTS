package sa45.team9.inventoryApp.repository;

import org.springframework.data.repository.CrudRepository;

import sa45.team9.inventoryApp.model.Parts;

public interface CrudPartRepository extends CrudRepository<Parts, String>{

}
