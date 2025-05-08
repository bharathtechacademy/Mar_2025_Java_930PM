package streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDistinct {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 3, 9, 9, 13, 37, 46, 13, 58, 3, 1, 94, 91, 94);

		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);

	}

}
