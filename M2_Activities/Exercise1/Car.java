package Activity.M2_Activities.Exercise1;

import java.nio.file.FileSystemNotFoundException;

public class Car {
	// Attributes
	
	private String brandName;
	private String modelName;
	private String color;
	
	
	//constructor (no args)
	
	public  Car() 
	{
		this.brandName="";
		this.modelName="";
		this.color="";
		
	}
	
	//constructor w/ param
	
	public  Car (String brandname, String modelName,String color)
	
	{
		this.brandName=brandname;
		this.modelName=modelName;
		this.color=color;
		
		
		
		
	}
	
	//getters and setters
	
	public String getBrand()
	{
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		
		this.brandName=brandName;
	}
	
	public String getModel()
	{
		return modelName;
	}
	
	public void setModelName(String modelName) {
		
		this.modelName=modelName;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color) {
		
		this.color=color;
	}
	

	
	//Display info method
	public void displayInfo() {
		System.out.println("==================");
		System.out.println("Brand:"+getBrand());
		System.out.println("Model:"+getModel());
		System.out.println("color:"+getColor());
	
	}
	

	
	
	
}