package assignment11.prob1;

import java.util.List;
import java.util.ArrayList;

public class Prob1b {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
//		nums.add(3.14); // Put rule for ? extends wildcard
	}

}
