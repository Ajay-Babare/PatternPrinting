import java.util.Scanner;

public class SquareAlpha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to to print square matrix: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for (int j=0; j<n; j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********");
		
		for(int i=0;i<n;i++) {
			for (int j=0; j<n; j++) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********");	
		
		for(int i=0;i<n;i++) {
			for (int j=0; j<n; j++) {
				System.out.print((char)(j+97)+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********");
		
		for(int i=0;i<n;i++) {
			for (int j=0; j<n; j++) {
				System.out.print((char)(i+97)+" ");
			}
			System.out.println();
		}
	}

}
