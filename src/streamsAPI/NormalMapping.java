package streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class NormalMapping {

	// 1,3,9,13,37,46,58,91,94 ==> Create List of Squares

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);

		List<Integer> squareList = new ArrayList<Integer>();

		for (int num : list) {

			squareList.add(num * num);
		}
		
		System.out.println(squareList);
	}

}
