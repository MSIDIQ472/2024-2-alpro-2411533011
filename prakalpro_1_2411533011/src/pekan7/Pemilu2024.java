package pekan7;
import java.util.Scanner;
public class Pemilu2024 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Nama:");
		String nama=in.nextLine();
		System.out.println("Umur:");
		int umur = in.nextInt();
		System.out.println("Input kan pilhan anda (1-3): ");
		int n =in.nextInt();
		System.out.println();
		System.out.println("Nama: "+ nama);
		System.out.println("Umur:"+umur);
		System.out.println("pilihan: "+n);
		switch(n) {
		case 1:
			System.out.println("anda memilih  Anies");
			break;
		case 2:
			System.out.println("Anda memilh prabowo");
		case 3:
			System.out.println("anda memilih ganjar");
			break;
			default:
				System.out.println("pilihan anda bukan nomor 1 sampai 3");
		}
		System.out.println("Terimakasih sudah memilih");
	}

}
