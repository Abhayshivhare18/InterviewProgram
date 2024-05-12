package prm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Hcl {

	public static void main(String[] args) {
    
		List<Employee> emp = Arrays.asList(new Employee(10, "abhay"),
				                          (new Employee(45,"amna")),
				                          new Employee(30,"amnas"));
		
	String emp1=emp.stream().map(e->e.getName()).collect(Collectors.joining(","));
	System.out.print(emp1);
	
	//abhay,amna,amnas
	//==================================
	
	List<Employee> emp2=emp.stream().
			sorted(Comparator.comparingInt(Employee::getAge).reversed()).
			collect(Collectors.toList());
	
	//The comparingInt method is a static method in the Comparator interface introduced in Java 8.
	//It takes a function that extracts an integer key from the elements being compared.
	
	//Employee [age=45, name=amna]
	//Employee [age=30, name=amnas]
    //Employee [age=10, name=abhay]
	
	for(Employee e: emp2) {
		System.out.println(e);
	}
	
	//===============================================
	Map<String,Employee> map = emp.stream().collect(Collectors.toMap(Employee::getName,e->e));
	System.out.println(map);

	 //     amna=Employee [age=45, name=amna], 
   	//	    abhay=Employee [age=10, name=abhay], 
	//		amnas=Employee [age=30, name=amnas]
	//========================================== (Merging of two sort)
	
	
	//=================================
	                 int arr1[] = {1, 3, 5, 7};

                     int arr2[] = {2, 4, 6, 8};


                     int arr3[] = mergeArrays(arr1, arr2);

                 System.out.println("Array after merging - " + Arrays.toString(arr3));
    
                 
               //	===========================================================  
                			List<Candidat>  candidat = Arrays.asList(new Candidat(1, "abhay","java","M"),
                	                (new Candidat(1, "neeraj","java","M")),
                	                new Candidat(1, "kiran","Pythan","F"),
                	                new Candidat(1, "kamlesh","Cplus plus","F"));
                			
                			
                			Map<Object, List<Candidat>> mm=candidat.stream().collect(Collectors.groupingBy(e->e.getSkill()));
                			
                             System.out.print(mm);
                			List<String> l=candidat.stream().map(e->{
                				if(e.getAge().equals("M")) {
                					return "Mr " +e.getName();	
                				}else if(e.getAge().equals("F")) {
                					return "Mrs " +e.getName();
                				}else {
                					return e.getName();
                				}
                				 
                			}).collect(Collectors.toList());
                			
                			System.out.print("Candidat" +l);
                			
                			//
                			List<Candidat> m=candidat.stream().map(e->{
                				if(e.getAge().equals("M")) {
                					e.setName("Mr " +e.getName());
                				}else if(e.getAge().equals("F")) {
                					 e.setName("Mrs " +e.getName());
                				}else {
                					 e.getName();
                				}
                				return new Candidat(e.getId(), e.getName(), e.getSkill(), e.getAge());
                				
                			}).collect(Collectors.toList());
                			
	
	                    System.out.print(m);
	                    
	                    //==========================================================
	                    		  // find second non repated charachter
	                    				String s ="abhaybanglore";
	                    				
	                    			Map<Character,Long> mapm=s.chars().mapToObj(c->(char)c)
	                    				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	                    			
	                    			Character ch=mapm.entrySet().stream().filter(entry->entry.getValue()==1)
	                    			.map(Map.Entry::getKey).skip(1).findFirst().orElseThrow();
	                    			
	                    			System.out.print(ch);
	                    			
	                    			//Output =Y;
	                    			
	         // =================================================================
	                    			
	                    			//[5,12,13,101,17]
	                    			//[5O,12E,13O,101O,17O]
	                    			
	                    			
	                    			List<Integer> list = Arrays.asList(5,12,13,101,17);
	                    			  
	                    			 List<String> mmm= list.stream().map(n->{
	                    				if(n%2==0) {
	                    					return n+"E";
	                    				}else {
	                    					return n+"0";
	                    				}
	                    			  }).collect(Collectors.toList());
	                    			 
	                    			System.out.print(mmm);
	                    			
	    // ================================================   
	        //  itrate over the map in java          			
//
	           
            mapm.entrySet().stream().forEach((e)->{System.out.println(e.getKey()+ "  "+e.getValue());});  
            
            
   //  =============================================       
         // how to reverse integer 1112234
        	
            int number =11112234;
        	int newNumber=0;
        	
        	while(number>0) {
        		newNumber=newNumber*10+number%10;
        		number=number/10;
        	}
        	System.out.println("Reverse nunber" +newNumber);		                    			
	
	
	
	//=========================================
		//	find common key
	
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
	
	
	
//	====================================================
	
	  public static int[] mergeArrays(int[] arr1, int[] arr2) {
	        
		 int length1=arr1.length;
		 int length2= arr1.length;
		 int count=0;
		
		 int [] arr3 = new int[arr1.length+arr2.length];
		 int j=0;
		 for(int i=0; i<arr1.length; i++) {
			   if(arr1[i]<arr2[j]) {
				   arr3[count]=arr1[i];
				 
			   }else {
				   arr3[count]=arr2[j];
				   
				   j++;
				   i--;
			   }
			   count++;
		 }
		  
		  return arr3;
	    }
	    
	//
	  


   
}

 