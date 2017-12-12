package sa45.team9.inventoryApp.model;

public class PartSearchCriteria {
	private String partNumber;
	private String partDescription;
	private String partColor;
	private String partManufacturer;
	public PartSearchCriteria() {
		super();
		
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public String getPartColor() {
		return partColor;
	}
	public void setPartColor(String partColor) {
		this.partColor = partColor;
	}
	public String getPartManufacturer() {
		return partManufacturer;
	}
	public void setPartManufacturer(String partManufacturer) {
		this.partManufacturer = partManufacturer;
	}
	
	

}
