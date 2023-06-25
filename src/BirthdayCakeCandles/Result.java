package BirthdayCakeCandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Result {
	public static int birthdayCakeCandles(List<Integer> candles) {

		int count = 0;

		List<Integer> sortedlist;
		sortedlist = candles;

		Integer maxValue = 0;
		for (Integer candle : sortedlist) {
			if(candle >= maxValue){
				maxValue =  candle;
			}
		}

		List<Integer> listOfBiggestCandles = new ArrayList<>();
		for (Integer maxCandle: sortedlist ) {
			if(Objects.equals(maxCandle, maxValue)){
				listOfBiggestCandles.add(maxCandle);
			}
		}

		count = listOfBiggestCandles.size();


		return count;
	}
}
