package sa45.team9.inventoryApp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import sa45.team9.inventoryApp.model.Suppliers;
@Component
public class SuppliersValidator implements Validator{
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Suppliers.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		Suppliers sup = (Suppliers) arg0;
		 
		// ONLY NUMERICS
	    String regex = "[0-9]+";
	    if(!sup.getSupplierID().matches(regex))
	    {
	    	arg1.reject("SupplierID", "Enter Only Numerics");
			arg1.rejectValue("SupplierID", "error.PartNumber", "Enter Only Positive  Number");
	    }
	  //PHONE NUMBER {NUMERICS 0-8 , 8 DIGITS LENGTH, Starts with 3,6,8,9
	    String phone="/^[0-9]{8}$/'";
	    if(!sup.getSupplierPhoneNumber().matches(phone))
	    {
	    	arg1.reject("SupplierPhoneNumber", "Invalid Phone Number");
			arg1.rejectValue("SupplierPhoneNumber", "error.SupplierPhoneNumber", "Invalid Phone Number");
	    }
	    String k = sup.getSupplierPhoneNumber().substring(0, 1);
	    if( k != "3" && k != "6" && k != "8" && k!= "9" && sup.getSupplierPhoneNumber().length() != 8 )
	    {
	    	arg1.reject("SupplierID", "Enter Only Numerics");
			arg1.rejectValue("SupplierID", "error.PartNumber", "Enter Only Positive  Number");
	    }
	    
	 // ONLY ALPHABETS
	    String expression = "^[a-zA-Z\\s]+"; 
	    if(!sup.getSupplierName().matches(expression))
	    {
	    	arg1.reject("SupplierName", "Enter a valid name");
			arg1.rejectValue("SupplierName", "error.SupplierName", "Enter a valid name,Only Alphabets");
	    }
	    if(!sup.getSupplierContactName().matches(expression))
	    {
	    	arg1.reject("SupplierContactName", "Enter a valid name");
			arg1.rejectValue("SupplierContactName", "error.SupplierContactName", "Enter a valid name,Only Alphabets");
	    }
	    if(!sup.getSupplierContactTitle().matches(expression))
	    {
	    	arg1.reject("SupplierContactTitle", "Enter a valid Title");
			arg1.rejectValue("SupplierContactTitle", "error.SupplierContactTitle", "Enter a valid Title");
	    }
	    
	    // ADRESS VALIDATION - ALPHA NUMERICS
	    String address = "^[a-zA-Z0-9]*$";
	    if(!sup.getSupplierAddress().matches(address))
	    {
	    	arg1.reject("SupplierAddress", "Enter a valid Address");
			arg1.rejectValue("SupplierAddress", "error.SupplierAddress", "Enter a valid Address");
	    }
	    
	    //POSTAL CODE VALIDATION
	    //FIRST TWO DIGITS {01,02,03......79,80}
	    String post = "[0-9]+";
	    if(sup.getSupplierPostalCode().matches(post) && sup.getSupplierPostalCode().length() == 6 )
	    {
	    	for(int i=10;i<= 80; i++)
	    	{
	    		Integer s1= Integer.parseInt(sup.getSupplierPostalCode().substring(0,2));
	    		if(s1 != i)
	    			{
	    			 arg1.reject("SupplierPostalCode", "Enter a valid Postal code");
				     arg1.rejectValue("SupplierPostalCode", "error.SupplierPostalCode", "Enter a valid Postal code");
	    			}
	    	}
	        String s2= sup.getSupplierPostalCode().substring(0,1);
	        String s3= sup.getSupplierPostalCode().substring(1,2);
	        Integer n =Integer.parseInt(s3);
	      for(int f=1; f<=9; f++)
	      {
	        if(s2 !="0" && n !=f )
	        {
	        	arg1.reject("SupplierPostalCode", "Enter a valid Postal code");
			     arg1.rejectValue("SupplierPostalCode", "error.SupplierPostalCode", "Enter a valid Postal code");	
	        }
	      }
	    }
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierID","error.SupplierID","SupplierID is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierName","error.SupplierName","SupplierName cannot be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierContactName","error.SupplierContactName","SupplierContactName is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierContactTitle","error.SupplierContactTitle","SupplierContactTitle is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierAddress","error.SupplierAddress","SupplierAddress is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierPhoneNumber","error.SupplierPhoneNumber","SupplierPhoneNumber is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"SupplierPostalCode","error.SupplierPostalCode","SupplierPostalcode is required");
	}
}
