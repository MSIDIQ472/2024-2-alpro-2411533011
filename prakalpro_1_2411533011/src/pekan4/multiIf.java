package pekan4;

import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		int umur = 0;
		char sim;
		Scanner a= new Scanner(System.in);
		System.out.print("input umur anda: ");
		umur=a.nextInt();
		System.out.print("Apakah anda sudah punya sim C: ");
		sim=a.next().charAt(0);
		a.close();
			if((umur  >=17)&&(sim=='y')) {
				System.out.println("Anda Sudah dewasa dan boleh bawa motor");
			}
			if(( umur >=17)&&(sim!='y')) {
				System.out.println("Anda Sudah dewasa tetapi tidak boleh bawa motor");
			}
			if((umur < 17)&&(sim!='y')) {
				System.out.println("Anda Belum cukup umur bawa motor");
			}
			if((umur <17)&&(sim=='y')) {
				System.out.println("Anda Belum cukup umur punya SIM");
			}
}



	}


