package com.regnant;

public class CarsTest {
	public static void main(String[] args) {
		
	
    Audi model= new Audi();
    model.Company = "Audi";
    model. Version = "A4";
    model. EngineCapacity = 1400 ;
    model. Price = 4000000;
    
    System.out.println("Brand Name     = "+model.Company);
    System.out.println("Model  num     = "+model.Version);
    System.out.println("Engine capacity= "+model.EngineCapacity);
    System.out.println("On road price  = "+model.Price);
    System.out.println("Type of Engine = "+model.Engine);
    System.out.println("Body material  = "+model.Body);
    System.out.println("Wheels type    = "+model.Wheels);
    
    Bmw model1 = new Bmw();
    model1.Company = "Bmw";
    model1.Version= "X1";
    model1.EngineCapacity = 2000;
    model1.Price = 3500000;
    System.out.println("********************************");
    System.out.println("Brand Name     = "+model1.Company);
    System.out.println("Model num      = "+model1.Version);
    System.out.println("Engine capacity= "+model1.EngineCapacity);
    System.out.println("On road price  = "+model1.Price);
    System.out.println("Type of Engine = "+model1.Engine);
    System.out.println("Body material  = "+model1.Body);
    System.out.println("Wheels type    = "+model1.Wheels);
    
    
   
	}  
    
}    		