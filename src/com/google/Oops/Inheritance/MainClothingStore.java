package com.google.Oops.Inheritance;

public class MainClothingStore {

	public static void main(String[] args) {
		Cloth cloth=new Cloth("Woolen");
		cloth.clothMaterial();
		Brand brand=new Brand("Woolen", ClothMaterial.Woolen);
		brand.brandAvailable();
		
				

	}

}
