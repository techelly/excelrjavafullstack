package daytwo.classes;

public class Address {
	private int addressId;
	private int houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	/**
	 * 
	 */
	public Address() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param addressId
	 * @param houseNo
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(int addressId, int houseNo, String street, String city, String state, String country) {
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	
}
