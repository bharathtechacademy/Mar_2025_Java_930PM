package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapping {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 3, 9, 13, 37, 46, 58, 91, 94);

		List<Integer> squareList = list.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squareList);
				
	}

}
