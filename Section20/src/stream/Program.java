package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x*10);
		Stream<String>  st2 = Stream.of("Maria", "Alex", "Bob");
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
		Stream<Long>    st4 = Stream.iterate(new Long[] {0L, 1L}, 
							  p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println(Arrays.toString(st2.toArray()));
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		System.out.println(Arrays.toString(st4.limit(10).toArray()));

	}

}
