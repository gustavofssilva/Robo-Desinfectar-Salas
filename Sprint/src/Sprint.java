import java.util.Scanner;
import java.lang.Math;

public class Sprint {

	public static void main(String[] args) throws InterruptedException {
		int [] salas = new int[5];
		int [] salas2 = new int[5];
		int [] salas3 = new int[5];
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem vindo!");
		 Thread.sleep(2000);
		System.out.println("Insira a primeira lista de salas para desinfecção");
		 Thread.sleep(2000);
		for (int i=0;i<5;i++) {
			
			salas[i] = leitor.nextInt();
			System.out.println("Próxima!");
			 Thread.sleep(1000);
		}
		
		System.out.println("Insira a segunda lista de salas para desinfecção");
		 Thread.sleep(2000);
		for (int i=0;i<5;i++) {
			
			salas2[i] = leitor.nextInt();
			System.out.println("Próxima!");
			 Thread.sleep(1000);
		}
		System.out.println("Insira a terceira lista de salas para desinfecção");
		 Thread.sleep(2000);
		for (int i=0;i<5;i++) {
			salas3[i] = leitor.nextInt();
			System.out.println("Próxima!");
			 Thread.sleep(1000);
		}
		
		System.out.println("Está é a lista de salas que devem ser desinfectada!");
		 Thread.sleep(1000);
		
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas[1] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas3[4] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas3[2] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas2[2] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas2[3] + " " + " " + "deve ser desinfectada em" + " : " +  "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas[4] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas[2] + " " + " " + "deve ser desinfectada em" + " : " + " 00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas3[1] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas2[4] + " " + " " + "deve ser desinfectada em" + " : " + "00 horas :" + numAleatorio + "min");
				}
		 for (int i = 0; i < 1; i++) {
		        int numAleatorio = (int)(Math.random() * 15 ) + 1;
		        Thread.sleep(2000);
				System.out.println("A sala" + " " + " " + salas[0] + " " + " " + "deve ser desinfectada em" + " : " +  "00 horas :" + numAleatorio + "min");
				}
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		//Thread.sleep(3);
		//System.out.println(salas[4]);
		//Thread.sleep(3);
		//System.out.println(salas[2]);
		//Thread.sleep(3);
	//	System.out.println(salas3[1]);
		//Thread.sleep(3);
	//	System.out.println(salas2[4]);
		//Thread.sleep(3);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
