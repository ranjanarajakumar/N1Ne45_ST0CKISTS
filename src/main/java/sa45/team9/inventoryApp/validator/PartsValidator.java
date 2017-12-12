package sa45.team9.inventoryApp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import sa45.team9.inventoryApp.model.Parts;

@Component
public class PartsValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> arg0) {
		
		return Parts.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartNumber","error.PartNumber","PartNumber  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartName","error.PartName","PartName  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartUnitPrice","error.PartUnitPrice","PartUnitPrice  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartDescription","error.PartDescription","PartDescription  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartColor","error.PartColor","PartColor  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartDimension","error.PartDimension","PartDimension  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartSupplierID","error.PartSupplierID","PartSupplierID  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartManufacturer","error.PartManufacturer","PartManufacturer  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartQuantityPerUnit","error.PartQuantityPerUnit","PartQuantityPerUnit  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartUnitInStock","error.PartUnitInStock","PartUnitInStock  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartUnitOnOrder","error.PartUnitOnOrder","PartUnitOnOrder  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartReorderLevel","error.PartReorderLevel","PartReorderLevel  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartMinimumReorderQuantity","error.PartMinimumReorderQuantity","PartMinimumReorderQuantity  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartShelfLocation","error.PartShelfLocation","PartShelfLocation  is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"PartDiscontinued","error.PartDiscontinued","PartDiscontinued  is required");
		
	}

}
