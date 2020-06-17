package HelloAccord;

public class Hello_Accord {
    
    public static void main(String[] args) {
		
		Accord blueAccord = new Accord("Honda", "Accord", 1998, "blue");
		Accord greenAccord = new Accord("Honda", "Accord", 1998, "green");
		Accord redAccord = new Accord("Honda", "Accord", 1998, "red");
		Accord taupeAccord = new Accord("Honda", "Accord", 1998, "taupe");
        Accord blackAccord = new Accord("Honda", "Accord", 1998, "black");
        
        System.out.println(blueAccord.toString());
        System.out.println(greenAccord.toString());
        System.out.println(redAccord.toString());
        System.out.println(taupeAccord.toString());
        System.out.println(blackAccord.toString());
        
		
    }

}