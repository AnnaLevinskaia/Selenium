package GroupProject;

public class CarTask3 {
    /*Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
      Create 2 sub classes: Sedan and Truck.
      The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
in which returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
       The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount*/

int carPrice;
String color;

double calculateSalePrice(){
    double priceDiscount=carPrice*0.1;
    double totalPrice=carPrice-priceDiscount;
    return totalPrice;
}

    public static void main(String[] args) {
        Truck obj1=new Truck();
        obj1.calculateSalePrice();
    }
}

class Truck extends CarTask3{
    double weight;
    double calculateSalePrice() {

        if (weight>20){
            double priceDiscount=carPrice*0.05;
            double totalPrice=carPrice-priceDiscount;
            return totalPrice;
        } else{
            double priceDiscount=carPrice*0.1;
            double totalPrice=carPrice-priceDiscount;
            return totalPrice;
        }
    }
}

class Sedan extends CarTask3{
    double length;
    double calculateSalePrice() {

        if (length>2000){
            double priceDiscount=carPrice*0.1;
            double totalPrice=carPrice-priceDiscount;
            return totalPrice;
        } else{
            double priceDiscount=carPrice*0.2;
            double totalPrice=carPrice-priceDiscount;
            return totalPrice;
        }
    }
}