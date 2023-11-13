package ogr.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Random rdmCode = new Random();
		
		Product p1 = new Product(rdmCode.nextInt(10000001), "Pane", "pane appena sfornato", 20.50);
		
		System.out.println(p1);
	}

}
