package ch.hslu.mvcdemo.model;

public class Person {
	
	private String name;
	private String vorname;
	
	public Person(){
		this.name= null;
		this.vorname = null;
	}
	
	public Person(String name, String vorname){
		this.name= name;
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Override
	public String toString(){
		return "Nachname: " + this.name + "\n" + "Vorname: " + this.vorname;
	}
}
