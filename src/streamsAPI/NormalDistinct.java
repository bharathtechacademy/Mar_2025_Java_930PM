package streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class NormalDistinct {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 3, 9, 9, 13, 37, 46, 13, 58, 3, 1, 94, 91, 94);

		List<Integer> distinctList = new ArrayList<Integer>();

		for (int num : list) {
			
			if(!distinctList.contains(num)) {
				distinctList.add(num);
			}

		}

		System.out.println(distinctList);
	}

}
