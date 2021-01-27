package assignment2;

abstract class Players {//abstract class with both abstract and non abstrat methods
String p1, p2, p3, p4, p5, p6;
int playerNum;

abstract void rank();//abstract method

public void setPlayers(int number) {//non-abstract method
	this.playerNum=number;
}

public void getClub() {//non-abstract method
	switch(playerNum) {
	case 6:
		System.out.println("1)"+p1+"\n2)"+p2+"\n3)"+p3+"\n4)"+p4+"\n5)"+p5+"\n6)"+p6);
		break;
	case 5:
		System.out.println("1)"+p1+"\n2)"+p2+"\n3)"+p3+"\n4)"+p4+"+\n5)"+p5);
		break;
	case 4:
		System.out.println("1)"+p1+"\n2)"+p2+"\n3)"+p3+"\n4)"+p4);
		break;
	case 3:
		System.out.println("1)"+p1+"\n2)"+p2+"\n3)"+p3);
		break;
	case 2:
		System.out.println("1)"+p1+"\n2)"+p2);
		break;
	case 1:
		System.out.println("1)"+p1);
		break;
	default:
		System.out.println("Please enter a number!");;
	}
	
}
void printClubName() {//Polymorphism
	System.out.println("The UCL first started in 1955");
}

}