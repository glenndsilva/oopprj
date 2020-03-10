package dtos;

public class Car {
   private String model;
   private String price;
   
   public Car(String model, String price) {
	   this.model = model;
	   this.price = price;
   }
   
   public String model() {
	   return this.model;
   }
   
   public String price() {
	   return this.price;
   }
}
