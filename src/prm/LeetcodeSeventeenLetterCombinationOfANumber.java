package prm;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeSeventeenLetterCombinationOfANumber {
	 public static List<String> anss = new ArrayList<String>();
		public static 	String [] keyPads = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] ars) {
		String s ="2";
		System.out.println(letterCombinations(s));
	
	}
	
	
	 
	    public static List<String> letterCombinations(String digits) {
	        
	       return leetCombination(digits,"");
	    }

	    public static List<String> leetCombination(String digit, String ans){
	        if(digit.length()==0){
	            anss.add(ans);
	            return anss;
	        }
	        String key = keyPads[digit.charAt(0)-48];
	        for(int i=0; i<key.length(); i++){
	            leetCombination(digit.substring(1),ans+key.charAt(i));
	        }
	        return anss;
	    }

	       
	}


