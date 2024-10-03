package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {

	void main(String[] args) {
		// TODO Auto-generated method stub
			int A1;
			int A2;
			Scanner keyboard =new Scanner(System.in);
			System.out.print("Input angka-i: ");
			A1 = keyboard.nextInt();
			System.out.print("Input angka-2: ");
			A2 = keyboard.nextInt();
			keyboard.close();
			System.out.println("operator Penjumlahan");
			A1+= A2; // penambahan, sekarang A1 = 15
			System.out.println("Penambahan : " + A1);
			System.out.println("Assignment pengurangan ");
			A1-=A2;//pengurangan, sekarang Al = 10
			System.out.println("Pengurangan: " + A1); 
			System.out.println("Assignment perkalian ");
			A1 *= A2;// perkalian, sekarang Al = 50
			System.out.println("Perkalian:"+ A1);
			System.out.println("Assignment hasıl bagi");
			A1 /=A2;// hasil bagi, sekarang Al = 10
			System.out.println("Pembagian: " + A1);
			System.out.println("Assignment sisa bagi ");
			A1 %=A2;// sisa bagi, sekarang Al 0
			System.out.println("Sisa Bagi: " + A1); }
}
