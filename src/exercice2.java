import java.util.Scanner;



public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int x0;
		int x1;
		int x2;
		// vleur de a
		Scanner sc = new Scanner(System.in);
		System.out.print("entrer un nombre : ");
		 a = sc.nextInt();
		 
		 //valeur de b
		 System.out.print("entrer un nombre : ");
		 b = sc.nextInt();
		 
		//valeur de c
		 System.out.print("entrer un nombre : ");
		 c = sc.nextInt();
		 
		 //equation
		 
			 System.out.print(" votre equation est :" + a + "*x² + " + b+ "*x " +  c + " = " + 0 + "  ");
			
			 int delta;
			 delta = b*b - 4 * a* c;
			 if(delta == 0){
				 System.out.print("il y a une solution double : x0 = " + (-1*b) / 2*a);
				 
			 }
			 else if(delta > 0){
				 double racine = Math.sqrt(delta);
				 System.out.print("il y a deux solutions distincte  : x1 = " + (-1*b - racine) / 2*a + "\n"
						 + " et " + "x2 = " + (-1*b + racine) / 2*a + "\n");
				 
			 }
			 else{
				 System.out.print("il n' y a pas de dolution");
				 
			 }
			 
		 
		 

	}

}
