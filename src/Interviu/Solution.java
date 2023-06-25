package Interviu;

class Car {
String name;
int mileage;
public Car(String name, int mileage){
	this.name = name;
	this.mileage = mileage;
}
}

public class Solution {

    public static void main(String[] args) {
	Car car = new Car("Volkswagen", 100);
	int code = car.hashCode();
		System.out.println(code);
		System.out.println(car.name);
		System.out.println(car.mileage);

	Car B = car;

//		 B.mileage = 32 ;
//		 B.name = "Volks" ;
		System.out.println(B.name);
		System.out.println(B.mileage);
		code = B.hashCode();
		System.out.println(code);
		boolean equals = car.equals(B);
		System.out.println(equals);

	Object obj = new Object();

	}


}






