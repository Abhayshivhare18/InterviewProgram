package prm;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestAAA {

	public static void main(String[] args) {
	  
		String s ="abhaybanglore";
		
	Map<Character,Long> map=s.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	Character ch=map.entrySet().stream().filter(entry->entry.getValue()==1)
	.map(Map.Entry::getKey).skip(1).findFirst().orElseThrow();
	
	System.out.print(ch);
	
	
	//map.entrySet().stream().forEach((e)->System.out.println(e.getKey()+ "  "+e.getValue()));
	//[5,12,13,101,17]
	//[5O,12E,13O,101O,17O]

	  List<Integer> list = Arrays.asList(5,12,13,101,17);
	  
	 List<String> mm= list.stream().map(n->{
		if(n%2==0) {
			return n+"E";
		}else {
			return n+"0";
		}
	  }).collect(Collectors.toList());
	 
	// System.out.print(mm);
	
	}
  
	 
	
}
