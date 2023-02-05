import java.util.Scanner;


public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		
		//demande à l'utilisateur d'entrer un temps de travail pour executer une tache
		System.out.print("Enter the Time Taken by Worker : ");
		int tempsTravail = sc.nextInt();
		
		if(tempsTravail >= 2 && tempsTravail <= 3 ){
			System.out.print("the worker is said to be highly efficient ");
			
		}
		else if(tempsTravail >= 3 && tempsTravail <= 4 ){
			System.out.print("the worker is ordered to improve speed ");
			
		}
		else if(tempsTravail >= 4 && tempsTravail <= 5 ){
			System.out.print("the worker is given training to improve his speed ");
			
		}
		else if(tempsTravail > 5 ){
			System.out.print("the worker has to leave the company ");
			
		}
		

	}

}
