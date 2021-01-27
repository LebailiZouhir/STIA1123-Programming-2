package assignment2;

public class Clubs {
String club1, club2, club3;
String newclub;

Clubs(String c1, String c2, String c3){	//Setter 
	this.club1=c1;
	this.club2=c2;
	this.club3=c3;
}

public void setClub(String newclub) { //Setter
	this.newclub=newclub;
}

public String getClub() { //Getter
	if(newclub.equals(club1) || newclub.equals(club2) || newclub.equals(club3)) {
		return newclub;
	}
	else System.out.println();
	return null;
}

public void printTop3() {
	System.out.println("1)"+club1+"\n2)"+club2+"\n3)"+club3);
}

}