package sa45.team9.inventoryApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sa45.team9.inventoryApp.model.Suppliers;
import sa45.team9.inventoryApp.repository.SuppliersRepository;

@Service
public class SuppliersServiceManager implements ISuppliersService{
	@Autowired
	private SuppliersRepository suppliersRepository;

	@Override
	public List<Suppliers> getSuppliers() {
		return suppliersRepository.findAll();
	}

	@Override
	public Suppliers findSupplier(String did) {
		// TODO Auto-generated method stub
		return suppliersRepository.findOne(did);
	}

	@Override
	public Suppliers createSupplier(Suppliers sup) {
		// TODO Auto-generated method stub
		return suppliersRepository.save(sup);
	}

	@Override
	public Suppliers changeSupplier(Suppliers sup) {
		// TODO Auto-generated method stub
		return suppliersRepository.save(sup);
	}

	@Override
	public void removeSupplier(Suppliers sup) {
		suppliersRepository.delete(sup);
	}
	


}
