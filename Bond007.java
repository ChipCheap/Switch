
public class Bond007 {

	public static void main(String[] args) {
	//7.2	
//(a)
	/*	int i = 0 ;
		int j = 0 ;
		do 
		{
			j = j++;		//Postinkrement verhindert die Terminierung, j = 0; j = 0++ (=0)
			i = j + i ;
			System.out.println(i +"\t"+j);
		} while ( i < 200 ) ;
	*/
//(b)
	/*	double i = 0.5 ;
		double j = 0 ;
		while ( j < 1 ) 
		{
			j += i ;
			i *= 0.5 ;						//terminiert durch Rundung; Reihe 1/2^n n€N \{0} würde sonst gegen 1 konvergieren, ihn aber nie erreichen 
			System.out.println(i +"\t"+j);		
		}
	*/
//(c)
	/*
		char i ='a' ;
		short j = 0 ;
		while ( i != j ) 
		{
			i++;
			j = ( short ) ( i+i ) ;			//terminiert irgendwann, wenn j 0 ist; i wird nicht darstellbar in ASCII und gleicht anscheinend dem  Wert 0
			System.out.println(i +"\t"+j);	
		}
	*/
//(d)
	/*	
		long i = 26L ;
		long j = 24L ;
		for (long x=0L ; x < 1000L ; x++) 
		{
			i = i / 12 + 23*(--x) ;
			j = (x--) + j + 5 ;				//terminiert nicht(in absehbarer Zeit); x wird öfter dekrementiert als inkrementiert durch die Schleife, daher wird x immer kleiner
			//ADD: Schleife terminiert, sobald x den kleinsten darstellbaren Wert in long hat und dann auf den größten dekrementiert wird, was äußerst lange dauert
			System.out.println(i +"\t"+x);
		}
	*/
		
	//7.3
//(a)
	/*	
		int i = 0 ;
		int j = 42;
		i=j/2;			//<- Ersatz der while-Schleife
		j=i;				//Aufgabe ergibt nur dann Sinn, wenn j gerade ist, 
	*/						//bsp: j=3->i=1;j=2->i=2;j=1	Schleife endet, falls i==j
	/*	while (i<j|i>j)
		{
			i++;
			j--;
//test->	System.out.println(i +"\t"+j);
		}
	*/	
		
//(b)
	/*
	 	int i = 0;
		int j = 42;
		while ( i < j | i > j );			//aufgrund des Semikolons nach der Schleife wird ein leerer Ausdruck ausgeführt anstelle der in {} stehenden Befehle ->
		{									//dadurch wird die Endbedingung i==j nie getroffen und die Schleife terminiert nicht	-> ultra jam 		
			i++;
			j--;
		}
	*/

//(c)
	/*	
		int i = 0 ;
		int j = 42;
		i+=1;				//<-Ersatz der Schleife und der darunter stehenden Ausdrücke
		j-=1;	
		while ( i < j | i > j )				//die Schleife bewirkt nichts, da kein Ausdruck dahinter steht, ist also wegzulassen
		i++;
		j--;
//test->System.out.println(i +"\t"+j);
	*/

//(d)
	/*	Angabe
		int n=5;		//Test-Wert
		double x = 0.;
		double y = 1.;
		int i = 1 ;
	
		do 
		{
			x = x + y ;
			y = y / i ;
			System.out.println(x +"\t"+y);
		} while ( i++ <= n ) ;				//Erg. für n=5 x 2.708333333333333	y 0.008333333333333333
	*/	
		//while-Schleife
	/*	while ( i < n+1 )
	 *  {
			x = x + y ;
			y = y / i ;
			i++;
			System.out.println(x +"\t"+y);
		}
	*/	
		//for-Schleife
	/*	for(int j=1;j<=n;j++)
		{
			x = x + y ;
			y = y / j ;
			System.out.println(x +"\t"+y);
		}
	*/
	}
}
