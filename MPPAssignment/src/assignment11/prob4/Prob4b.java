package assignment11.prob4;
import java.util.*;
public class Prob4b {

	public static void main(String[] args) {
		List<Object> objs = new ArrayList<Object>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(3);
		
//		double dbl = sum(ints); //compiler error

	}
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for(Number num: nums) s+= num.doubleValue();
		return s;
	}

}
