package prm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiFindDuplicateFromString {

	public static void main(String[] args) {
      
		String name= "kkkrrtyuuuuj";
		
//		Map<Character,Long> map=name.chars().mapToObj(c->(char) c)
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		//map.entrySet().forEach(System.out::println);
//		
//		
//		Character c=map.entrySet().stream()
//		.filter(m->m.getValue()==1)
//		.map(Entry::getKey)
//		.findFirst()
//		.get();
//		
//		System.out.println(c);
		
		
		int [] nums = {2,3,4,1,3,4,6,8};
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(45);
		list.add(22);
	        
//		
//		 Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		 System.out.print("===================");
//		 list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		 
//		 int l=Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
//		 System.out.print("===================");
//		 System.out.println(l);
		
		int k=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		
		System.out.print(k);
		 
	         
	}

}
