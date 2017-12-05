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
	
//	@OneToMany(targetEntity=Parts.class, mappedBy="suppliers")
//	private List<Parts> parts;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SupplierID")
	private int SupplierID;
	@Basic
	@Column(name = "SupplierName")
	private String SupplierName;
	@Basic
	@Column(name = "SupplierContactName")
	private String SupplierContactName;
	@Basic
	@Column(name = "SupplierContactTitle")
	private String SupplierContactTitle;
	@Basic
	@Column(name = "SupplierAddress")
	private String SupplierAddress;
	@Basic
	@Column(name = "SupplierPostalCode")
	private String SupplierPostalCode;
	@Basic
	@Column(name = "SupplierPhoneNumber")
	private String SupplierPhoneNumber;
	@Basic
	@Column(name = "SupplierFax")
	private String SupplierFax;
	public Suppliers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suppliers(int supplierID) {
		super();
		SupplierID = supplierID;
	}
	public Suppliers(int supplierID, String supplierName, String supplierContactName, String supplierContactTitle,
			String supplierAddress, String supplierPostalCode, String supplierPhoneNumber, String supplierFax) {
		super();
		SupplierID = supplierID;
		SupplierName = supplierName;
		SupplierContactName = supplierContactName;
		SupplierContactTitle = supplierContactTitle;
		SupplierAddress = supplierAddress;
		SupplierPostalCode = supplierPostalCode;
		SupplierPhoneNumber = supplierPhoneNumber;
		SupplierFax = supplierFax;
	}
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupplierContactName() {
		return SupplierContactName;
	}
	public void setSupplierContactName(String supplierContactName) {
		SupplierContactName = supplierContactName;
	}
	public String getSupplierContactTitle() {
		return SupplierContactTitle;
	}
	public void setSupplierContactTitle(String supplierContactTitle) {
		SupplierContactTitle = supplierContactTitle;
	}
	public String getSupplierAddress() {
		return SupplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		SupplierAddress = supplierAddress;
	}
	public String getSupplierPostalCode() {
		return SupplierPostalCode;
	}
	public void setSupplierPostalCode(String supplierPostalCode) {
		SupplierPostalCode = supplierPostalCode;
	}
	public String getSupplierPhoneNumber() {
		return SupplierPhoneNumber;
	}
	public void setSupplierPhoneNumber(String supplierPhoneNumber) {
		SupplierPhoneNumber = supplierPhoneNumber;
	}
	public String getSupplierFax() {
		return SupplierFax;
	}
	public void setSupplierFax(String supplierFax) {
		SupplierFax = supplierFax;
	}
	@Override
	public String toString() {
		return "Suppliers [SupplierID=" + SupplierID + ", SupplierName=" + SupplierName + ", SupplierContactName="
				+ SupplierContactName + ", SupplierContactTitle=" + SupplierContactTitle + ", SupplierAddress="
				+ SupplierAddress + ", SupplierPostalCode=" + SupplierPostalCode + ", SupplierPhoneNumber="
				+ SupplierPhoneNumber + ", SupplierFax=" + SupplierFax + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + SupplierID;
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
		if (SupplierID != other.SupplierID)
			return false;
		return true;
	}
}