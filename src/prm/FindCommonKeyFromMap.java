package prm;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindCommonKeyFromMap {

	public static void main(String[] args) {	
	
   Map<String, Integer> map1 = new HashMap<String,Integer>();
   
   map1.put("abhay",12);
   
   map1.put("karan",10);
   
   map1.put("deepak",11);
   map1.put("kamlesh",13);
   
   Map<String, Integer> map2 = new HashMap<String,Integer>();
   
   map2.put("abhay",14);
   
   map2.put("rohit",15);
   
   map2.put("amit",16);
   map2.put("lokendra",1);
   
   Set<String> sets=map1.entrySet().stream().filter(entry->map2.containsKey(entry.getKey())).map(Map.Entry::getKey).collect(Collectors.toSet());

    System.out.println("Stream api of entrySet" +sets);
   
    Set<String> commonKeys = map1.keySet().stream()
            .filter(map2::containsKey)
            .collect(Collectors.toSet());
   
   System.out.println("Stream api of keySet" +commonKeys);

	

			
}
	
}
		
	
	    
	
	
	    



