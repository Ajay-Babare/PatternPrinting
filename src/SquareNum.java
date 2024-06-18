import java.util.Scanner;

public class SquareNum {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to to print square matrix: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for (int j=1; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********");
		
		for(int i=1;i<=n;i++) {
			for (int j=0; j<n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
