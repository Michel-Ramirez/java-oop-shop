package ogr.lessons.java.shop;

public class Product {

	private int code = 5258;
	private String name;
	private String description;
	private double price;
	private final int VAT = 22; // valore da calcolare in %
	
	
	// COSTRUTTORE
	
	public Product(int code, String name, String description, double price) {
		
		setCode(code);
		setName(name);
		setDescription(description);
		setPrice(price);
		
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
		return VAT;
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
	
	
	// METODI 
	
	public double getBasePrice() {
		
		return price;
		
	}
	
	public double getConsumerPrice() {
			
		double finalPrice = price + (price * VAT / 100);
	
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
