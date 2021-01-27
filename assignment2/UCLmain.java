package assignment2;

import java.util.Scanner;

public class UCLmain {

public static void main(String[] args) {
	int number;
	String name;
	Scanner scan=new Scanner(System.in);
	
	Clubs ucl = new Clubs("Barcelona", "Real Madrid", "Atletico Madrid");
	Barcelona bar = new Barcelona();
	
	ucl.setClub("Barcelona");
	
	String a=ucl.getClub();
	if(a==null) {
		System.out.println(a+" is not in the top 3 of the Champions League");
	}
	else System.out.println(a+" is in the top 3 of the Champions League");
	ucl.printTop3();
	
	System.out.println("Please input team");
	name= scan.nextLine();
	
	if(name.equals("barcelona")) {
		
	
		System.out.println("Please enter the number of players you want to see (1-6)");
		number=scan.nextInt();
		bar.setPlayers(number);	//inheritance
		bar.printClubName();	//inheritance
		bar.getClub();	//inheritance
		bar.rank();	//inherit an abstract method named rank();
		
	}
		else{
			System.out.println("The team you entered is not available.");
		}
		
			
	
	
}

}