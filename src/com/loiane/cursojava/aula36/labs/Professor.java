package com.loiane.cursojava.aula36.labs;

public class Professor {
	private String name;
	private String departament;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		String info = "Professor name: " + this.name + "\n" + "Departament: " + this.departament + "\n " + "email: " + this.email + "\n";
		return info;
	}

}
