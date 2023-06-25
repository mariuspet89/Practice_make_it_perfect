import java.util.Arrays;

public class ALgoritmBradutMain {
	
	public static int[][] array = {
			{0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0}
	};
	
	public static void main(String[] args) {
		
//		for (int i = 0; i < 1000000; i++) {
//			setState();
//		}
		
//		bubbleSort();




		
	}
	
	public static void setState() {
		int[][] newArray = new int[array.length][];
		for (int i = 0; i < array.length; i++) {
			int[] arrayRow = new int[array.length];
			
			for (int j = 0; j < array.length; j++) {
				//	System.out.print(checkNeighbours(i,j)+ " ");
				int tempNeighbours = checkNeighbours(i, j);
				
				if (tempNeighbours == 3 && array[i][j] == 0) {
					arrayRow[j] = 1;
				} else if ((tempNeighbours < 2 || tempNeighbours > 3) && array[i][j] == 1) {
					arrayRow[j] = 0;
				} else
					arrayRow[j] = array[i][j];
			}
			newArray[i] = arrayRow;
				System.out.println(Arrays.deepHashCode(newArray));
		}
		array = newArray.clone();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static int checkNeighbours(int x, int y) {
		int nrVecini = 0;
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				
				if (x + i >= 0 && y + j >= 0 && x + i < array.length && y + j < array.length) {
					if (array[x + i][y + j] == 1 && (i != 0 || j != 0)) {
						nrVecini++;
					}
				}
			}
		}
		return nrVecini;
	}

	public static void bubbleSort(){
	int next = 0;
	int actual = 0;
		
		int[] arrayBubble={6,5,4,3,2,1};
		//int[] arrayBubble = {9,6,4,8,32,43,5,1,76,6,2};
		for(int i = 0; i<arrayBubble.length-1; i++){
		next = arrayBubble[i+1];
		actual = arrayBubble[i];
			
			if(actual > next){
				arrayBubble[i+1] = actual;
				arrayBubble[i] = next;
			}
			//System.out.println(Arrays.toString(arrayBubble));
			for(int j= 0; j<arrayBubble.length-1; j++ ){
				System.out.println(Arrays.toString(arrayBubble));
				next = arrayBubble[j+1];
				actual = arrayBubble[j];
				if(actual > next){
					arrayBubble[j+1] = actual;
					arrayBubble[j] = next;
					
				}
			}
	}
		//System.out.println(Arrays.toString(arrayBubble));
		
	}
	
}

