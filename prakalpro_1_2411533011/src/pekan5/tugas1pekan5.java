package pekan5;

public class tugas1pekan5 {

	public static void main(String[] args) {
		int row = 10;
		int col = 18;
		int rowCount = 1;
		int star1 = (col / 2);
		int star2 = star1 + 1;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || i == row) {
					if (j == 1 || j == col) {
						System.out.print("#");
					} else {
						System.out.print("=");
					}
				} else if (i > 1 || i < row) {
					if (j == 1 || j == col) {
						System.out.print("|");
					} else if (j == star1) {
							System.out.print(">");
						} else if (j == star1 - 1) {
							System.out.print("<");
						} else if (j == (star2)) {
							System.out.print("<");
						} else if (j == (star2 + 1)) {
							System.out.print(">");
						} else if (j > (star1 ) && j < (star2)) {
							System.out.print(".");
						} else {
							System.out.print(" ");
						}
				}
			}
			
			System.out.println("");
		
			if (rowCount > 1) {
				if (rowCount <= (row /2)) {
					star1 -= 2;
					star2 +=2;
				}
				if (rowCount >= (row / 2)) {
					star1 +=2;
					star2 -=2; 
					
				}
			}
			
			rowCount++;			
		}		

	}
}

	


