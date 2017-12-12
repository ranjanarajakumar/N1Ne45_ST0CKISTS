package sa45.team9.inventoryApp.repository;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//import org.springframework.util.Assert;
//import org.springframework.util.StringUtils;
//import sa45.team9.inventoryApp.model.PartSearchCriteria;
//import sa45.team9.inventoryApp.model.Parts;
//
//@Repository("partRepository")
//public class JpaPartRepository implements PartRepository {
//	@PersistenceContext
//    private EntityManager entityManager;
//	@Override
//	public ArrayList<Parts> findParts(PartSearchCriteria partSearchCriteria) {
//		Assert.notNull(bookSearchCriteria, "Search Criteria are required!");
//		
//		Query query=entityManager.createNativeQuery();
//		if(partSearchCriteria.getPartNumber()!= null && partSearchCriteria.getPartDescription()!=null)
//	}
//	
//}
