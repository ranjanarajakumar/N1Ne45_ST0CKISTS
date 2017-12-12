package sa45.team9.inventoryApp.services;

import java.util.List;

import sa45.team9.inventoryApp.model.Suppliers;

public interface ISuppliersService {
	List<Suppliers> getSuppliers();
	Suppliers findSupplier(String did);
	Suppliers createSupplier(Suppliers sup);
	Suppliers changeSupplier(Suppliers sup);
	void removeSupplier(Suppliers sup);
}
