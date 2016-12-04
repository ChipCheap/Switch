import java.util.Random;

public class Switch {
	
	private static boolean test = true;
	
	public static void main(String[] args){
		
		for(int i = 0; i < 10; i++) {
			int x,y,z;
			Random random = new Random();
			x = random.nextInt()%50+50;
			y = random.nextInt()%50+50;
			z = random.nextInt()%50+50;
			System.out.println(x + " " + y + " " + z);
			sortiere(x,y,z);
		}
		
		if(test)
			System.out.println("--------------------\nAlles gut!");
		else
			System.out.println("--------------------\nLeider gab es Fehler!");
	}
	
	public static void sortiere(int x, int y, int z){
		int a = 0;
		a += (x > y ? 1 : 0);
		a += (x > z ? 2 : 0);
		a += (y > z ? 4 : 0);
		
		//hier werden die Fälle ausgewertet und dementsprechend die Variablen sortiert (links nach rechts absteigend)
		switch(a)
		{
		case 0:	//x<y; x<z; y<z
			System.out.println("z >y >x--\n"+z+" "+y+" "+x);
			ausgabe(x,y,z);
			break;
		case 1:	//x>y; x<z; y<z
			System.out.println("z >y >x--\n"+z+" "+x+" "+y);
			ausgabe(y,x,z);
			break;
	/*	case 2:	//x>z; x<y; y<z		geht nicht	y>x>z und z>y
			System.out.println("---\n"+y+" "+x+" "+z);
			break;
			*/
		case 4:	//x<y; x<z; y>z
			System.out.println("y >z >x--\n"+y+" "+z+" "+x);
			ausgabe(x,z,y);
			break;
		case 3:	//x>y; x>z; y<z
			System.out.println("x >z >y--\n"+x+" "+z+" "+y);
			ausgabe(y,z,x);
			break;
	/*	case 5:	//x>y; x<z; y>z		geht nicht		z>x>y und y>z
			System.out.println("---\n"+z+" "+x+" "+y);
			break;
			*/
		case 6:	//x<y; x>z; y>z
			System.out.println("y >x >z--\n"+y+" "+x+" "+z);
			ausgabe(z,x,y);
			break;
		case 7:	//x>y; x>z; y>z
			System.out.println("x >y >z--\n"+x+" "+y+" "+z);
			ausgabe(z,y,x);
			break;
		}
		
	}
	
	public static void ausgabe(int a, int b, int c) {
		if(a > b || a > c || b > c) {
			System.out.println("Da stimmt etwas nicht!");
			test = false;
		}	
		System.out.println("Es gilt: " + a + " <= " + b + " <= " + c);
	}
}