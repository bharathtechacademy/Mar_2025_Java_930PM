package streamsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOrder {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1, 3,2, 9, 9, 18, 13, 37, 46, 13, 58, 3, 1, 94, 91, 94);
		
		List<Integer> distinctOrderedList = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distinctOrderedList);
		
		List<Integer> distinctReverseOrderedList = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(distinctReverseOrderedList);

	}

}
