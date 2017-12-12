package sa45.team9.inventoryApp.services;

import java.util.ArrayList;

import sa45.team9.inventoryApp.model.Parts;

public interface IReportService {
	ArrayList<Parts> findAllParts();
	ArrayList<Parts> findPendingProductByID(String eid);

}
