package sa45.team9.inventoryApp.services;

import java.util.ArrayList;
import java.util.List;

import sa45.team9.inventoryApp.model.OrderDetails;
import sa45.team9.inventoryApp.model.PartSearchCriteria;
import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.pojo.SearchPart;

public interface IPartsService {

//Manage Products
	ArrayList<Parts> findAllParts();
	Parts createParts(Parts parts);
	ArrayList<String> findAllPartNumbers();
	Parts findParts(String id);
	void removeParts(Parts parts);
//Search	
	public Parts viewDetails(String i);

	ArrayList<Parts> findByNumber(String pn);

	ArrayList<Parts> findByDescription(String pd);

	ArrayList<Parts> findByColor(String pc);

	ArrayList<Parts> findByManufacturer(String pm);

	ArrayList<Parts> findByNumberAndDescription(String pn, String pd);

	ArrayList<Parts> findByNumberAndColor(String pn, String pc);

	ArrayList<Parts> findByNumberAndManufacturer(String pn, String pm);

	ArrayList<Parts> findByDescriptionAndColor(String pd, String pc);

	ArrayList<Parts> findByDescriptionAndManufacturer(String pd, String pm);

	ArrayList<Parts> findByColorAndManufacturer(String pc, String pm);

	ArrayList<Parts> findByNumberAndDescriptionAndColor(String pn, String pd, String pc);

	ArrayList<Parts> findByNumberAndDescriptionAndManufacturer(String pn, String pd, String pm);

	ArrayList<Parts> findByDescriptionAndColorAndManufacturer(String pd, String pc, String pm);

	ArrayList<Parts> findByNumberAndDescriptionAndColorAndManufacturer(String pn, String pd, String pc, String pm);

	ArrayList<String> returnAllPartNumbers();
	
	ArrayList<OrderDetails>findAllOrders(String pn );
	
	Parts changeParts(Parts parts);

	List<Parts> search(SearchPart searchPart);

}
