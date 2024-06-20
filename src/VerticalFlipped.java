import java.util.Scanner;

public class VerticalFlipped {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if((i+j)>n)
//					System.out.print("*"+" ");
//				else
//					System.out.print(" "+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("***************");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
	}

}
