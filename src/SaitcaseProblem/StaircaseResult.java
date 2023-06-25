package SaitcaseProblem;

public class StaircaseResult {
	public static void staircase(int n) {

		for(int i=0;i<n;i++){
			for(int j=n-1;j>i;j--){
				System.out.print(" ");
			}
			for( int k=0;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
			/*	for (int i=0; i<=n; i++) {
			for (int j=i; j <= n; j++) {
				System.out.print(" ");
			}

			for (int j=1; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}*/

	}
}
