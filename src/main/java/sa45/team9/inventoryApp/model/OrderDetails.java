//package sa45.team9.inventoryApp.model;
//import java.util.List;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="OrderDeatails")
//public class OrderDetails {
//	
//	@OneToOne(mappedBy="orderDetails")
//	private Orders orders;
//	
////	@OneToMany(targetEntity=Parts.class, mappedBy="orderDetails")
////	private List<Parts> parts;
//	
//	@EmbeddedId
//	private CompositeKey key;
////	@Id
////	@GeneratedValue(strategy = GenerationType.IDENTITY)
////	@Column(name = "OrderID")
//	//private int OrderID;
////	@Id
////	@GeneratedValue(strategy = GenerationType.IDENTITY)
////	@Column(name = "PartNumber")
//	//private int PartNumber;
//	@Basic
//	@Column(name = "PartUnitPrice")
//	private double PartUnitPrice;
//	@Basic
//	@Column(name = "PartQuantity")
//	private int PartQuantity;
//	@Basic
//	@Column(name = "PartDiscount")
//	private double PartDiscount;
//	@Basic
//	@Column(name = "ReasonDescription")
//	private String ReasonDescription;
//	@Basic
//	@Column(name = "Reason")
//	private String Reason;
//	
//	public OrderDetails() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public OrderDetails(CompositeKey key) {
//		super();
//		this.key = key;
//	}
//
//	public OrderDetails(CompositeKey key, double partUnitPrice, int partQuantity, double partDiscount,
//			String reasonDescription, String reason) {
//		super();
//		this.key = key;
//		PartUnitPrice = partUnitPrice;
//		PartQuantity = partQuantity;
//		PartDiscount = partDiscount;
//		ReasonDescription = reasonDescription;
//		Reason = reason;
//	}
//
//	public Orders getOrders() {
//		return orders;
//	}
//
//	public void setOrders(Orders orders) {
//		this.orders = orders;
//	}
//
//	public CompositeKey getKey() {
//		return key;
//	}
//
//	public void setKey(CompositeKey key) {
//		this.key = key;
//	}
//
//	public double getPartUnitPrice() {
//		return PartUnitPrice;
//	}
//
//	public void setPartUnitPrice(double partUnitPrice) {
//		PartUnitPrice = partUnitPrice;
//	}
//
//	public int getPartQuantity() {
//		return PartQuantity;
//	}
//
//	public void setPartQuantity(int partQuantity) {
//		PartQuantity = partQuantity;
//	}
//
//	public double getPartDiscount() {
//		return PartDiscount;
//	}
//
//	public void setPartDiscount(double partDiscount) {
//		PartDiscount = partDiscount;
//	}
//
//	public String getReasonDescription() {
//		return ReasonDescription;
//	}
//
//	public void setReasonDescription(String reasonDescription) {
//		ReasonDescription = reasonDescription;
//	}
//
//	public String getReason() {
//		return Reason;
//	}
//
//	public void setReason(String reason) {
//		Reason = reason;
//	}
//
//	@Override
//	public String toString() {
//		return "OrderDetails [orders=" + orders + ", key=" + key + ", PartUnitPrice=" + PartUnitPrice
//				+ ", PartQuantity=" + PartQuantity + ", PartDiscount=" + PartDiscount + ", ReasonDescription="
//				+ ReasonDescription + ", Reason=" + Reason + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((key == null) ? 0 : key.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		OrderDetails other = (OrderDetails) obj;
//		if (key == null) {
//			if (other.key != null)
//				return false;
//		} else if (!key.equals(other.key))
//			return false;
//		return true;
//	}
//	
//	
//}
