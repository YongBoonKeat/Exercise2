package Exercise2point2;

public class Computer {
	String brand;
	String model;
	String color;
	String core;
	int price;
	int ram;
	
	//Print specification
	void printSpec(String b, String m, String c, String core,int p,int r) {
		System.out.println("Brand: " + b);
		System.out.println("Model: " + m);
		System.out.println("Color: " + c);
		System.out.println("Core: " + core);
		System.out.println("Price: RM" + p);
		System.out.println("Ram: " + r + "gb");
	}
	
	void calculateprice(int p, int quantity) {
		int TP = p*quantity; 
		System.out.println("Price per unit: RM" + p);
		System.out.println("Total unit: " + quantity);
		System.out.println("Total price: RM" + TP);
	}
	
	void weight(double w, int quantity) {
		double TW = w*quantity;
		System.out.println("Weight per unit: " + w + "kg");
		System.out.println("Total unit: " + quantity);
		System.out.println("Total weight: RM" + TW +"kg");
	}
	void OperatingSystem(double OP1, double OP2) {
		System.out.println("Speed of operating system is " + OP1 +"GHZ to " + OP2 +"GHZ");
	}
	
}