package ogr.lessons.java.shop;

import java.util.Random;

public class Product {

	private int code;
	private String name;
	private String description;
	private double price;
	private int vat; // valore da calcolare in %
	
	
	// COSTRUTTORE
	
	public Product(String name, String description, double price, int vat) {
		
		genRandCode();
		setName(name);
		setDescription(description);
		setPrice(price);
		setVat(vat);
		
	}
	
	private void genRandCode() {
		
		Random rnd = new Random();
		
		setCode(rnd.nextInt(0, Integer.MAX_VALUE));
	}
	
	
	//GETTER
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getVat() {
		return vat;
	}
	
	
	// SETTER
	
	private void setCode(int code) {
		
		this.code = code;
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setDescription(String description) {
	
		this.description = description;
		
	}
	
	public void setPrice(double price) {
	
		this.price = price;
		
	}
	
	public void setVat(int vat) {
		
		this.vat = vat;
		
	}
	
	
	// METODI 
	
	public double getBasePrice() {
		
		return price;
		
	}
	
	public double getConsumerPrice() {
			
		double finalPrice = price + (price * vat / 100);
	
		return  finalPrice;
		
	}
	
	
	//METODO PER FORMATTARE LA STAMPA
	
	@Override
	public String toString() {
		
		return "Prodotto:\n"
				+ code + "-" + name + "\n"
				+ "prezzo base: " + getBasePrice() + "€" + "\n"
				+ "prezzo finale: " + String.format("%.2f", getConsumerPrice()) + "€";
	}
	
	
	
}
