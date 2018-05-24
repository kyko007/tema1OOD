package tema1OOD;

import java.io.*;

public class tema1OOD {
	
	public static void main(String[] args) throws Exception
	{
	
		Persoana pers1 = new Persoana("Vasile", new NormalAge(18, 10, 10));
		Persoana pers2 = new Persoana("Ion", new NormalAge(20, 11, 12));
		Persoana pers3 = new Persoana("Xulescu", new NormalAge(18, 10, 10));

		Building build1 = new Building("Google", new NormalAge(18, 10, 10));
		Building build2 = new Building("Facebook", new NormalAge(20, 11, 12));
		Building build3 = new Building("Meh SRL", new NormalAge(18, 10, 10));
		
		Caine caine1 = new Caine("Google", new DogAge(18, 10, 10));
		Caine caine2 = new Caine("Facebook", new DogAge(20, 11, 12));
		Caine caine3 = new Caine("Meh SRL", new DogAge(18, 10, 10));
		
		EntityList myList = null;
		
		myList.add(pers1);
		myList.add(pers2);
		myList.add(pers3);
		myList.add(build1);
		myList.add(build2);
		myList.add(build3);
		myList.add(caine1);
		myList.add(caine2);
		myList.add(caine3);
		
	}
	
}
