package assignment2;

public class Barcelona extends Players{//Instance of Inheritance

Barcelona(){
	this.p1="Salah";
	this.p2="Mane";
	this.p3="Firmino";
	this.p4="Fabinho";
	this.p5="Henderson";
	this.p6="Origi";
}
void rank() {//Inheritance of abstract method
	System.out.println("Barcelona rank: 1");
	
}

void printClubName() {// Instance of Polymorphism
	System.out.println("This is FC Barcelona");
}

}