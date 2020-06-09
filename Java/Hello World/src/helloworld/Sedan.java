package helloworld;

public class Sedan extends Car {

    public Sedan (String model, String make, int year, String color) {
        super(model, make, year, color);

        this.publicStr = "pub";
        this.protectedStr = "pro";
        
    }

    @Override

	public void fuel() {
		//TODO 
	}
}