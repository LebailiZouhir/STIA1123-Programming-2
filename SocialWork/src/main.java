public class main {
	
	public static void main (String[] args) {
		
		Biodata b = new Biodata();
		skills c = new skills();
		workexperiences d = new workexperiences();
		talents e = new talents();
		result f = new result();
		cgpa g = new cgpa();	

		b.printName(); b.printAge(); b.printAdd();
		b.printEmail(); b.printNum();
		c.printWorkskills();
		d.printWorkexperiences();
		e.DimArr();
		f.printResult();
		g.printCGPA(); g.printGPA();
		
		System.out.println("\n" + "Final CGPA : " +g.calculateCGPA());
				
	}

}