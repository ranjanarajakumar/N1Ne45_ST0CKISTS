package sa45.team9.inventoryApp.pojo;

import java.util.List;
import sa45.team9.inventoryApp.model.Parts;

public class SearchPart {
	private String partNumber;
	private String description;
	private String color;
	private String manufacturer;
	private List<Parts> parts;
	private String errorMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<Parts> getParts() {
		return parts;
	}

	public void setParts(List<Parts> parts) {
		this.parts = parts;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
