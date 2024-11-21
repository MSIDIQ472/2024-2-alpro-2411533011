package pekan6;

import java.util.Scanner;

public class perulanganwhile1 {

	public static void main(String[] args) {
		int counter=0;
		String jawab;
		boolean running = true;
		//deklarasi Scanner
		Scanner scan = new Scanner (System.in);
		while (running) {
			counter++;
			System.out.println("jumlah = "+counter);
			System.out.println("Apakah lanjut (ya /tidak?)");
			jawab= scan.nextLine();
			//cek jawab = tidak ,perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
		}
	}
		System.out.println("anda sudah melakukan perulangan sebanyak "+counter+"kali");
	}
}
