package pl.bestapartment.best.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private int id;
	
	@Column(name="booking_com_id")
	private int bookingComId;
	
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="apartment_id")
	private Apartment apartment;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="client_id")
	private Client client;
		
	@Column(name="reservation_date")
	private Date reservationDate;

	@Column(name="arrival_date")
	private Date arrivalDate;
	
	@Column(name="departure_date")
	private Date departureDate;
	
	@Column(name="status")
	private String status;
	
	@Column(name="total_price")
	private double totalPrice;
	
	@Column(name="commision")
	private double commision;
	
}
