package com.google.Oops.Inheritance;

public class Brand extends Cloth
{
	private ClothMaterial ClothMaterial;

	public Brand(String cloth_type,ClothMaterial ClothMaterial) {
		super(cloth_type);
		this.ClothMaterial =ClothMaterial;
		}
	
	
	public void brandAvailable()
	{
		switch (ClothMaterial) {
		case Woolen:
			System.out.println("Brand available are: Monte Carlo, Provogue");
		    break;
		case Silk:
			System.out.println("Brand available are: Fabindia");
			break;
		case Cotton:
			System.out.println("Brand available are: Van Hussen, Only, H&M");
			break;
		case Polyster:
			System.out.println("Brand available are: H&M");
			break;
		default:
			System.out.println("Enter some valid materisl!");
		}
	}

}
