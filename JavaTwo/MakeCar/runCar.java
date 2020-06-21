package MakeCar;

public class runCar {
    
    public static void main (String[] args) {
    	Car fastCar = new Car("Nissan", "Sentra", 2014, "red");
    	
    	
    	int Speed = fastCar.getSpeed();
    	int Mileage = fastCar.getMileage();
    	
    	System.out.println("Your car is a " + fastCar.toString());
    	System.out.println("Speed: " + Speed + " Mileage: " + Mileage);
    	
    	System.out.println("Speeding up... ");
    	fastCar.speedUp(60);
    	fastCar.runFor(3);
    	
    	Speed = fastCar.getSpeed();
    	Mileage = fastCar.getMileage();
    	
    	System.out.println("Speed: " + Speed + " Mileage: " + Mileage);
    	
    	fastCar.speedDown(35);
    	System.out.println("Slowing down now...");
    	
    	Speed = fastCar.getSpeed();
    	Mileage = fastCar.getMileage();
    	
    	System.out.println("Speed: " + Speed + " Mileage: " + Mileage);

        
    }
}