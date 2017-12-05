package sa45.team9.inventoryApp.model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Parts")
public class Parts {
	
//	@OneToOne
//	@JoinColumn(name="PartNumber")
//	private PartsDetails partDetails;
//	@ManyToOne
//	@JoinColumn(name="PartNumber")
//	private OrderDetails orederDetails;
//	@ManyToOne
//	@JoinColumn(name="PartSupplierID")
//	private Suppliers suppliers;
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PartNumber")
	private int partNumber;
	@Basic
	@Column(name = "PartName")
	private String partName;
	@Basic
	@Column(name = "PartSupplierID")
	private int partSupplierID;
	@Basic
	@Column(name = "PartQuantityPerUnit")
	private int partQuantityPerUnit;
	@Basic
	@Column(name = "PartUnitInStock")
	private int partUnitInStock;
	@Basic
	@Column(name = "PartUnitOnOrder")
	private int partUnitOnOrder;
	@Basic
	@Column(name = "PartReorderLevel")
	private int partReorderLevel;
	@Basic
	@Column(name = "PartMinimumReorderQuantity")
	private int partMinimumReorderQuantity;
	@Basic
	@Column(name = "PartShelfLocation")
	private String partShelfLocation;
	@Basic
	@Column(name = "PartDiscontinued")
	private String partDiscontinued;
	public Parts() {
		super();		
	}
	public Parts(int partNumber) {
		super();
		this.partNumber = partNumber;
	}
	public Parts(int partNumber, String partName, int partSupplierID, int partQuantityPerUnit, int partUnitInStock,
			int partUnitOnOrder, int partReorderLevel, int partMinimumReorderQuantity, String partShelfLocation,
			String partDiscontinued) {
		super();
		this.partNumber = partNumber;
		this.partName = partName;
		this.partSupplierID = partSupplierID;
		this.partQuantityPerUnit = partQuantityPerUnit;
		this.partUnitInStock = partUnitInStock;
		this.partUnitOnOrder = partUnitOnOrder;
		this.partReorderLevel = partReorderLevel;
		this.partMinimumReorderQuantity = partMinimumReorderQuantity;
		this.partShelfLocation = partShelfLocation;
		this.partDiscontinued = partDiscontinued;
	}
	public int getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public int getPartSupplierID() {
		return partSupplierID;
	}
	public void setPartSupplierID(int partSupplierID) {
		this.partSupplierID = partSupplierID;
	}
	public int getPartQuantityPerUnit() {
		return partQuantityPerUnit;
	}
	public void setPartQuantityPerUnit(int partQuantityPerUnit) {
		this.partQuantityPerUnit = partQuantityPerUnit;
	}
	public int getPartUnitInStock() {
		return partUnitInStock;
	}
	public void setPartUnitInStock(int partUnitInStock) {
		this.partUnitInStock = partUnitInStock;
	}
	public int getPartUnitOnOrder() {
		return partUnitOnOrder;
	}
	public void setPartUnitOnOrder(int partUnitOnOrder) {
		this.partUnitOnOrder = partUnitOnOrder;
	}
	public int getPartReorderLevel() {
		return partReorderLevel;
	}
	public void setPartReorderLevel(int partReorderLevel) {
		this.partReorderLevel = partReorderLevel;
	}
	public int getPartMinimumReorderQuantity() {
		return partMinimumReorderQuantity;
	}
	public void setPartMinimumReorderQuantity(int partMinimumReorderQuantity) {
		this.partMinimumReorderQuantity = partMinimumReorderQuantity;
	}
	public String getPartShelfLocation() {
		return partShelfLocation;
	}
	public void setPartShelfLocation(String partShelfLocation) {
		this.partShelfLocation = partShelfLocation;
	}
	public String getPartDiscontinued() {
		return partDiscontinued;
	}
	public void setPartDiscontinued(String partDiscontinued) {
		this.partDiscontinued = partDiscontinued;
	}
	@Override
	public String toString() {
		return "Parts [partNumber=" + partNumber + ", partName=" + partName + ", partSupplierID=" + partSupplierID
				+ ", partQuantityPerUnit=" + partQuantityPerUnit + ", partUnitInStock=" + partUnitInStock
				+ ", partUnitOnOrder=" + partUnitOnOrder + ", partReorderLevel=" + partReorderLevel
				+ ", partMinimumReorderQuantity=" + partMinimumReorderQuantity + ", partShelfLocation="
				+ partShelfLocation + ", partDiscontinued=" + partDiscontinued + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + partNumber;
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
		Parts other = (Parts) obj;
		if (partNumber != other.partNumber)
			return false;
		return true;
	}
}