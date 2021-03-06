package assignment9.prob10C;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		IntStream myIntStream=IntStream.of(91,52,83,34,45,76,7,98,69);
//		
//		OptionalInt max = myIntStream.max();
//		
//		System.out.println(max);
		
		List<Integer> intList=Arrays.asList(91,52,83,34,45,76,7,98,69);
		
		IntSummaryStatistics summary =
				intList.stream().collect(Collectors.summarizingInt(/*Integer::intValue*/(Integer i)->i));
				int maxValue = summary.getMax();
				int MinValue = summary.getMin();
				
				System.out.println("Max and min value form list"+intList+" are:"+maxValue+ " and "+MinValue);

	}

}
