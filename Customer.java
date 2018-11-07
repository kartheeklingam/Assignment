

public class Customer{

	
	private int id;
	private String name;
	private String email;
	//private LocalDate dob;
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	

	public Customer(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		//this.dob = dob;
		this.city = city;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public LocalDate getDob() {
//		return dob;
//	}

//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

@Override
public String toString() {
	
	return "Customer[Id : "+ id + "Name : " + name + " Email : " + email + " City " + city + "]";
}

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
}
