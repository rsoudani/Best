package pl.bestapartment.best.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apartment")
public class Apartment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="apartment_id")
	private int id;
	
	@Column(name="booking_com_id")
	private int bookingComId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="alias")
	private String alias;
	
	@Column(name="address")
	private String address;

	public Apartment() {
	}

	public Apartment(int bookingComId, String name, String alias, String address) {
		this.bookingComId = bookingComId;
		this.name = name;
		this.alias = alias;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookingComId() {
		return bookingComId;
	}

	public void setBookingComId(int bookingComId) {
		this.bookingComId = bookingComId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Apartment [id=" + id + ", bookingComId=" + bookingComId + ", name=" + name + ", alias=" + alias
				+ ", address=" + address + "]";
	}
	
	

	
	
	
}
