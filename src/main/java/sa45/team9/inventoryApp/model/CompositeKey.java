package sa45.team9.inventoryApp.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompositeKey{
	@Column(name = "OrderID")
	private int OrderID;
	@Column(name = "PartNumber")
	private int PartNumber;
	public CompositeKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompositeKey(int orderID, int partNumber) {
		super();
		OrderID = orderID;
		PartNumber = partNumber;
	}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getPartNumber() {
		return PartNumber;
	}
	public void setPartNumber(int partNumber) {
		PartNumber = partNumber;
	}
	@Override
	public String toString() {
		return "CompositeKey [OrderID=" + OrderID + ", PartNumber=" + PartNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + OrderID;
		result = prime * result + PartNumber;
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
		CompositeKey other = (CompositeKey) obj;
		if (OrderID != other.OrderID)
			return false;
		if (PartNumber != other.PartNumber)
			return false;
		return true;
	}
	
	
	
}
