////import java.util.Scanner;
////
////public class ALgoritmBradutMain2 {
////	public static void main(String[] args) {
////		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
////
////
////		int numarLinii = myObj.nextInt();  // Read user input
////		System.out.println("un patrat: " + numarLinii);  // Output user input
////		int n = numarLinii;
//////
//////		for (int i=1; i<=n; i++) {
//////			for (int j=1; j<=n; j++) {
//////				System.out.print("* ");
//////			}
//////			System.out.println();
//////		}
////
//////		System.out.println("un trunghi descrescator");
//////		for(int i=1; i<=n; i++) {
//////			for(int j=i; j<=n; j++){
//////				System.out.print("*");
//////			}
//////			System.out.println();
//////		}
////
//////		System.out.println("un trunghi crescator");
//////		for (int i=1; i<=n; i++) {
//////			for (int j=1; j<=i; j++) {
//////				System.out.print("* ");
//////			}
//////			System.out.println();
//////		}
////
////		/*for (int i=1; i<=n; i++) {
////			for (int j=i; j <= n; j++) {
////				System.out.print(" ");
////			}
////			for (int j = 1; j < i; j++) {
////				System.out.print("* ");
////			}
////			for (int j = i; j <= i; j++) {
////				System.out.print("* ");
////			}
////			for (int j = 1; j <= i; j++) {
////				System.out.print("");
////			}
////			System.out.println();
////		}
////		for (int i = 1; i <=2; i++) {
////			for (int j=1; j <= n; j++) {
////				System.out.print(" ");
////			}
////			System.out.println("*");
////		}
////		for(int i=0; i<= n; i++){
////			for (int j = i; j <= i; j++) {
////				System.out.print("* ");
////			}
////		}
////*/
////
////
////	/*	for (int i=0; i<=n; i++) {
////			for (int j=i; j <= n; j++) {
////				System.out.print(" ");
////			}
////
////			for (int j=1; j<=i; j++) {
////				System.out.print("#");
////			}
////			System.out.println();
////		}*/
////
////		for(int i=0;i<n;i++){
////
////			for(int j=n-1;j>i;j--){
////				System.out.print(" ");
////			}
////			for( int k=0;k<=i;k++) {
////				System.out.print(" #");
////			}
////			System.out.println();
////		}
////
////	}
////
////}
//
//
//import java.util.Scanner;
//
//public class ALgoritmBradutMain {
//	public static void main(String[] args) {
//
//		int[][] array = {{0, 1, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
//		checkArray(array);
//
//		for(int x= 0; x<2; x++){
//			if(x!=0){
//				x = 1;
//			}
//		}
//
//		//System.out.println(array.length)
//	}
//	public static void checkArray(int[][] array){
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.println(array[i][j]);
//			}
//		}
//	}
//}
//
//
//	int[][] array2 = array.clone();
//
//
//		for (int x = 0; x < array.length; x++) {
//			for (int y = 0; y < array.length; y++) {
//				if (array[x][y] == 0) {
//					{
//						if (checkArray(x, y, array) == 3) {
//							array[x][y] = 1;
//						}
//					}
//				} else {
//					if (checkArray(x, y, array) != 2 && checkArray(x, y, array) != 3) {
//						array[x][y] = 0;
//					}
//				}
//			}
//		}
//
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.print(array2[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//
//
//	public static int checkArray(int x, int y, int[][] array) {
//		int nrVecini = 0;
//		for (int i = -1; i < 2; i++) {
//			for (int j = -1; j < 2; j++) {
//
//				if (x + i >= 0 && y + j >= 0 && x + i < array.length && y + j < array.length) {
//					if (array[x + i][y + j] == 1 && (i != 0 || j != 0)) {
//						nrVecini++;
//					}
//				}
//			}
//		}
//		return nrVecini;
//	}
///