package Encapsulation;

public class Inheritance {

	public static void main(String[] args) {
	       ProtonX70 x70 = new ProtonX70();
	       ProtonX50 x50 = new ProtonX50();
	       ProtonSaga saga = new ProtonSaga();
	       
	       
	       x70.setName("Proton X70");                                            //Encapsulation
	       System.out.println("Welcome to " + x70.getName());
	       x70.setColor("Lime Green");                                                //Encapsulation and Polymorphism
	       System.out.println("Color of vehcile: " + x70.getColor());
	       x70.accelerate();
	       x70.AI();
	       x70.rearCamera();
	       
	       System.out.println("");
	       
	       x50.setName("Proton X50");
	       System.out.println("Welcome to " + x50.getName());
	       x50.setColor("Red");
	       System.out.println("Color of vehcile: " + x50.getColor());
	       x50.panoramicOpen();
	       x50.panoramicClose();
	       x50.semiAutomaticDriving();
	       
	       System.out.println("");
	       
	       saga.setName("Proton SAGA");
	       System.out.println("Welcome to " + saga.getName());
	       saga.setColor("Black");
	       System.out.println("Color of vehcile: " + saga.getColor());
	       saga.accelerate();
	       saga.airbags();
	       saga.eco();
	       
	       
	    }

}
