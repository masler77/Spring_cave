package se.codeCave.SpringCave;

public class Person {

	private String name;
	private int id;

	private int taxId;
	
	private Address address;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public Person(){
		
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", taxId=" + taxId + ", address=" + address + "]";
	}
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void speak(){

		System.out.println("Hello im a person!");
	}
}
