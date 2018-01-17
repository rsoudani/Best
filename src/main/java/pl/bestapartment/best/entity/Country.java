package pl.bestapartment.best.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="country",
				cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Client> clients;

	public void add(Client client) {
		
		if (clients == null) {
			clients = new ArrayList<>();
		}
		
		clients.add(client);
		
		client.setCountry(this);	
		
	}
	
	
	public Country() {
	}

	public Country(int id, String name, List<Client> clients) {
		this.id = id;
		this.name = name;
		this.clients = clients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", clients=" + clients + "]";
	}

	
	
	
	

}
