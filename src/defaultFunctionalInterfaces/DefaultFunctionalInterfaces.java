package defaultFunctionalInterfaces;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class DefaultFunctionalInterfaces {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bi = (a,b)->a+b;
		System.out.println(bi.apply(1, 2));
		
		Supplier<String> supplier = () -> {
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
			String uniqueId = sdf.format(Calendar.getInstance().getTime());
			return uniqueId;
		};
		
		System.out.println(supplier.get());

	}

}
