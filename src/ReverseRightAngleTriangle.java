import java.util.Scanner;

public class ReverseRightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0)
					System.out.print((char)(j+65)+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
