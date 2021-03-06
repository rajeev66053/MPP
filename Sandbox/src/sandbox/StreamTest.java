package sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Stream<String> randoms =Stream.generate(() -> "Echo").limit(10);
		Stream<Double> randoms =Stream.generate(Math::random).skip(5).limit(10);
		randoms.forEach(System.out::println);
		
		Stream<Character> combined =Stream.concat(characterStream("Hello"),characterStream("World"));
		
		List combined1=combined.collect(Collectors.toList());
		
		combined1.forEach(System.out::println);
		
		Function<char[],String> myFunc=String::new;
		char[] charArray= {'H','e','l','l','o'};
		System.out.println(myFunc.apply(charArray));
		System.out.println(new String(charArray));
		
		
		List<String> strings= Arrays.asList("Eleven","One","Two","Three");
		
		Stream<String> stringStream =strings.stream();
		
		String[] stringArrays = stringStream.toArray(String[]::new);
		System.out.println(Arrays.toString(stringArrays));
		
		List<Integer> ints=Arrays.asList(3,2,5,4,6);
		List<int[]> intArrs=ints.stream().map(int[]::new).collect(Collectors.toList());
		
		List<String> intArrsStr=intArrs.stream().map(Arrays::toString).collect(Collectors.toList());
		System.out.println(intArrsStr);
		
		List<String> list = Arrays.asList("Joe", "Tom", "Abe");
//		Stream<Stream<Character>> result = list.stream().map(s -> characterStream(s));
//		System.out.println(result.collect(Collectors.toList()));
		
		Stream<Character> flatResult= list.stream().flatMap(s -> characterStream(s));
		System.out.println(flatResult.collect(Collectors.toList()));
		
		Stream<String> uniqueWords= Stream.of("merrily", "merrily", "merrily","gently").distinct();
		
		System.out.println(uniqueWords.collect(Collectors.toList()));
		
		//sort by decreasing lengths of words
		List<String> words	= Arrays.asList("Tom", "Joseph", "Richard");
		Stream<String> longestFirst	= words.stream().sorted((String x, String y) -> y.length()-x.length());
		System.out.println(longestFirst.collect(Collectors.toList()));
		
		Stream<String> longestFirst1 =words.stream().sorted(Comparator.comparing(String::length).reversed());
		System.out.println(longestFirst1.collect(Collectors.toList()));
		
		
		Function<String, Integer> byLength = x -> x.length();
		Stream<String> longestFirst2= words.stream().sorted(Comparator.comparing(byLength).reversed());
		System.out.println(longestFirst2.collect(Collectors.toList()));
		
	}
	
	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray())
		result.add(c);
		return result.stream();
		}


}
