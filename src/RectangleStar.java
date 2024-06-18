import java.util.Scanner;

public class RectangleStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print star m * n matrix ");
		
		System.out.println("Enter m : ");
		int m = sc.nextInt();
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
