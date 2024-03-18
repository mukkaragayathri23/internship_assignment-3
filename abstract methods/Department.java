package com.javaAbstractMethods;

//abstract
public abstract class Department
{
	
	private int id;
	private int name;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int id, int name) {
		this.id = id;
		this.name = name;
	}

	//abstract method
	public abstract String getDetails();
	//This method requires a body instead of a semicolon
	
	@Override
	public String toString() 
	{
		return "Department [id=" + id + ", name=" + name + "]";
	}
	

}