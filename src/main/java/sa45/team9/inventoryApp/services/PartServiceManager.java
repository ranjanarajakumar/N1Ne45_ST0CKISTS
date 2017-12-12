package sa45.team9.inventoryApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;


import sa45.team9.inventoryApp.model.OrderDetails;
import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.pojo.SearchPart;
import sa45.team9.inventoryApp.repository.PartRepository;

@Service("partService")
public class PartServiceManager implements IPartsService{
	@Resource
	private PartRepository partRepository;
	@Autowired
	private PartRepository CrudpartRepository;
	//Manage Products	
	@Override
	@Transactional
	public ArrayList<Parts> findAllParts() {
		List<Parts> partList = partRepository.findAll();
		return (ArrayList<Parts>) partList;
	}
	@Override
	public Parts createParts(Parts parts) {
		return partRepository.saveAndFlush(parts);
	}
	@Override
	public ArrayList<String> findAllPartNumbers() {
		return partRepository.findAllPartNumbers();
	}
	@Override
	public Parts findParts(String id) {
		return partRepository.findOne(id);
	}
	@Override
	public void removeParts(Parts parts) {
		partRepository.delete(parts);
	}
	//Search
	@Override
	@Transactional
	public ArrayList<String> returnAllPartNumbers(){
		return partRepository.findAllPartNumbers();
	}
	@Override
	@Transactional
	public Parts viewDetails(String i) {
		return partRepository.viewPartDetails(i);
		}
		//1
		@Override
		@Transactional
		public ArrayList<Parts> findByNumber(String pn) {
			return partRepository.findPartByNumber(pn);
	}
		//2
		@Override
		@Transactional
		public ArrayList<Parts> findByDescription(String pd) {
			return partRepository.findPartByDescription(pd);
}
		//3
		@Override
		@Transactional
		public ArrayList<Parts> findByColor(String pc) {
			return partRepository.findPartByColor(pc);
}
		//4
		@Override
		@Transactional
		public ArrayList<Parts> findByManufacturer(String pm) {
			return partRepository.findPartByManufacturer(pm);
}
		//5
		@Override
		@Transactional
		public ArrayList<Parts> findByNumberAndDescription(String pn, String pd) {
			return partRepository.findPartByNumberAndDescription(pn,pd);
}
		//6
		@Override
		@Transactional
		public ArrayList<Parts> findByNumberAndColor(String pn, String pc) {
			return partRepository.findPartByNumberAndColor(pn,pc);
}
		//7
		@Override
		@Transactional
		public ArrayList<Parts> findByNumberAndManufacturer(String pn, String pm) {
			return partRepository.findPartByNumberAndManufacturer(pn,pm);
}
		//8
		@Override
		@Transactional
		public ArrayList<Parts> findByDescriptionAndColor(String pd, String pc) {
			return partRepository.findPartByDescriptionAndColor(pd,pc);
}
		//9
		@Override
		@Transactional
		public ArrayList<Parts> findByDescriptionAndManufacturer(String pd, String pm) {
			return partRepository.findPartByDescriptionAndManufacturer(pd,pm);
}
		//10
		@Override
		@Transactional
		public ArrayList<Parts> findByColorAndManufacturer(String pc, String pm) {
			return partRepository.findPartByColorAndManufacturer(pc,pm);
}
		//11
		@Override
		@Transactional
		public ArrayList<Parts> findByNumberAndDescriptionAndColor(String pn, String pd, String pc) {
			return partRepository.findPartByNumberAndDescriptionAndColor(pn,pd,pc);
}
		//12
		@Override
		@Transactional
		public ArrayList<Parts> findByNumberAndDescriptionAndManufacturer(String pn, String pd, String pm) {
			return partRepository.findPartByNumberAndDescriptionAndManufacturer(pn,pd,pm);
}
		//13
		@Override
		@Transactional
		public ArrayList<Parts> findByDescriptionAndColorAndManufacturer(String pd, String pc, String pm) {
			return partRepository.findPartByDescriptionAndColorAndManufacturer(pd,pc,pm);
}
		//14
		@Override
		@Transactional
		public ArrayList<Parts> findByNumberAndDescriptionAndColorAndManufacturer(String pn, String pd, String pc, String pm) {
			return partRepository.findPartByNumberAndDescriptionAndColorAndManufacturer(pn,pd,pc,pm);		   
}
		@Override
		@Transactional
			public ArrayList<OrderDetails>findAllOrders(String pn ){
			return partRepository.findAllOrders(pn);
			}
		@Override
		public Parts changeParts(Parts parts) {
			return  partRepository.saveAndFlush(parts);
			
		}
		@Override
		public List<Parts> search(SearchPart searchPart) {

			String partNumber = searchPart.getPartNumber();
			String description = searchPart.getDescription();
			String color = searchPart.getColor();
			String manufacturer = searchPart.getManufacturer();
			if (StringUtils.isEmpty(partNumber) && StringUtils.isEmpty(description) && StringUtils.isEmpty(color)
					&& StringUtils.isEmpty(manufacturer))
				return null;
			List<Parts> result = partRepository.findAll();
			if (!StringUtils.isEmpty(partNumber)) {
				result = result.stream().filter(p -> p.getPartNumber().equals(partNumber)).collect(Collectors.toList());
			}

			if (!StringUtils.isEmpty(description)) {
				result = result.stream().filter(p -> p.getPartDescription().equals(description))
						.collect(Collectors.toList());
			}

			if (!StringUtils.isEmpty(color)) {
				result = result.stream().filter(p -> p.getPartColor().equals(color)).collect(Collectors.toList());
			}

			if (!StringUtils.isEmpty(manufacturer)) {
				result = result.stream().filter(p -> p.getPartManufacturer().equals(manufacturer)).collect(Collectors.toList());
			}
			return result;
		}

}
