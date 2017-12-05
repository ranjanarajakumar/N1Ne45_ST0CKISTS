package sa45.team9.inventoryApp.model;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Orders")
public class Orders {
	
//	@OneToOne
//	@JoinColumn(name="OrderID")
//	private OrderDetails orderDetails;
	
//	@ManyToOne
//	@JoinColumn(name="OrderEmployeeID")
//	private Employees employee;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private int orderID;
	@Basic
	@Column(name = "OrderEmployeeID")
	private int orderEmployeeID;
	@Basic
	@Column(name = "OrderSupplierID")
	private int orderSupplierID;
	@Basic
	@Column(name = "OrderDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderDate;
	@Basic
	@Column(name = "OrderRequiredDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderRequiredDate;
	@Basic
	@Column(name = "OrderArrivedDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderArrivedDate;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderID) {
		super();
		this.orderID = orderID;
	}
	public Orders(int orderID, int orderEmployeeID, int orderSupplierID, Date orderDate, Date orderRequiredDate,
			Date orderArrivedDate) {
		super();
		this.orderID = orderID;
		this.orderEmployeeID = orderEmployeeID;
		this.orderSupplierID = orderSupplierID;
		this.orderDate = orderDate;
		this.orderRequiredDate = orderRequiredDate;
		this.orderArrivedDate = orderArrivedDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getOrderEmployeeID() {
		return orderEmployeeID;
	}
	public void setOrderEmployeeID(int orderEmployeeID) {
		this.orderEmployeeID = orderEmployeeID;
	}
	public int getOrderSupplierID() {
		return orderSupplierID;
	}
	public void setOrderSupplierID(int orderSupplierID) {
		this.orderSupplierID = orderSupplierID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderRequiredDate() {
		return orderRequiredDate;
	}
	public void setOrderRequiredDate(Date orderRequiredDate) {
		this.orderRequiredDate = orderRequiredDate;
	}
	public Date getOrderArrivedDate() {
		return orderArrivedDate;
	}
	public void setOrderArrivedDate(Date orderArrivedDate) {
		this.orderArrivedDate = orderArrivedDate;
	}
	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", orderEmployeeID=" + orderEmployeeID + ", orderSupplierID="
				+ orderSupplierID + ", orderDate=" + orderDate + ", orderRequiredDate=" + orderRequiredDate
				+ ", orderArrivedDate=" + orderArrivedDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderID;
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
		Orders other = (Orders) obj;
		if (orderID != other.orderID)
			return false;
		return true;
	}
}
