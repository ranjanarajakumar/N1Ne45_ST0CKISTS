package sa45.team9.inventoryApp.model;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Suppliers")
public class Suppliers {
	
	@OneToMany(targetEntity=Parts.class, mappedBy="suppliers")
	private List<Parts> parts;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SupplierID")
	private String supplierID;
	@Basic
	@Column(name = "SupplierName")
	private String supplierName;
	@Basic
	@Column(name = "SupplierContactName")
	private String supplierContactName;
	@Basic
	@Column(name = "SupplierContactTitle")
	private String supplierContactTitle;
	@Basic
	@Column(name = "SupplierAddress")
	private String supplierAddress;
	@Basic
	@Column(name = "SupplierPostalCode")
	private String supplierPostalCode;
	@Basic
	@Column(name = "SupplierPhoneNumber")
	private String supplierPhoneNumber;
	@Basic
	@Column(name = "SupplierFax")
	private String supplierFax;
	public Suppliers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suppliers(String supplierID) {
		super();
		this.supplierID = supplierID;
	}
	public Suppliers(List<Parts> parts, String supplierID, String supplierName, String supplierContactName,
			String supplierContactTitle, String supplierAddress, String supplierPostalCode, String supplierPhoneNumber,
			String supplierFax) {
		super();
		this.parts = parts;
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.supplierContactName = supplierContactName;
		this.supplierContactTitle = supplierContactTitle;
		this.supplierAddress = supplierAddress;
		this.supplierPostalCode = supplierPostalCode;
		this.supplierPhoneNumber = supplierPhoneNumber;
		this.supplierFax = supplierFax;
	}
	public List<Parts> getParts() {
		return parts;
	}
	public void setParts(List<Parts> parts) {
		this.parts = parts;
	}
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierContactName() {
		return supplierContactName;
	}
	public void setSupplierContactName(String supplierContactName) {
		this.supplierContactName = supplierContactName;
	}
	public String getSupplierContactTitle() {
		return supplierContactTitle;
	}
	public void setSupplierContactTitle(String supplierContactTitle) {
		this.supplierContactTitle = supplierContactTitle;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public String getSupplierPostalCode() {
		return supplierPostalCode;
	}
	public void setSupplierPostalCode(String supplierPostalCode) {
		this.supplierPostalCode = supplierPostalCode;
	}
	public String getSupplierPhoneNumber() {
		return supplierPhoneNumber;
	}
	public void setSupplierPhoneNumber(String supplierPhoneNumber) {
		this.supplierPhoneNumber = supplierPhoneNumber;
	}
	public String getSupplierFax() {
		return supplierFax;
	}
	public void setSupplierFax(String supplierFax) {
		this.supplierFax = supplierFax;
	}
	@Override
	public String toString() {
		return "Suppliers [parts=" + parts + ", supplierID=" + supplierID + ", supplierName=" + supplierName
				+ ", supplierContactName=" + supplierContactName + ", supplierContactTitle=" + supplierContactTitle
				+ ", supplierAddress=" + supplierAddress + ", supplierPostalCode=" + supplierPostalCode
				+ ", supplierPhoneNumber=" + supplierPhoneNumber + ", supplierFax=" + supplierFax + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((supplierID == null) ? 0 : supplierID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suppliers other = (Suppliers) obj;
		if (supplierID == null) {
			if (other.supplierID != null)
				return false;
		} else if (!supplierID.equals(other.supplierID))
			return false;
		return true;
	}



	public Parts addPart(Parts part) {
		getParts().add(part);
		part.setSupplier(this);

		return part;
	}

	public Parts removePart(Parts part) {
		getParts().remove(part);
		part.setSupplier(null);

		return part;
	}
	
}