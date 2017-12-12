package sa45.team9.inventoryApp.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.repository.CrudPartRepository;
@Service
public class RecordService {
	@Autowired
	private CrudPartRepository partRepository;
	
	public Collection<Parts>findAllPart(){
		java.util.List<Parts> parts=new ArrayList<Parts>();
		for (Parts part : partRepository.findAll()) {
			parts.add(part);
		}
		return parts;
	}
	
	public void save(Parts part) {
		partRepository.save(part);		
	}

}
