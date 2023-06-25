package AbsolutDiagonalDifference;

import java.util.List;

public class ResultDiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arrList) {



		int[][] arr = arrList.stream()
				.map(l -> l.stream().mapToInt(Integer::intValue).toArray())
				.toArray(int[][]::new);

		int diagonal1 = 0;
		int diagonal2 = 0;

			for(int i = 0; i<= arrList.size() -1; i++){
				for(int j = 0; j <= arrList.size() -1; j++){
					if(i==j)
						diagonal1 += arr[i][j];
					if(i == arrList.size() - j -1)
						diagonal2 += arr[i][j];				}
			}


		return Math.abs(diagonal1 - diagonal2);
	}
}
