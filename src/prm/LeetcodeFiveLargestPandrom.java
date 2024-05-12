package prm;


public class LeetcodeFiveLargestPandrom {
	
	public static void main(String[] args) {
		// cbeereed
		System.out.print(longestPalindrome("ac"));
		
	}
	
	
	public static String longestPalindrome(String str) {
		if(str.length()<=1) {
			return str;
		}
		String LPS ="";
		
		for(int i=1;i<str.length();i++) {
			int low =i;
			int high=i;
			while(str.charAt(low)==str.charAt(high)) {
				low--;
				high++;
				if(low==-1||high==str.length()) break;
				}
			String palindrome = str.substring(low+1,high);
			if(palindrome.length()>LPS.length()) {
				LPS=palindrome;
			}
			low=i-1;
			high=i;
			while(str.charAt(low)==str.charAt(high)) {
			 low--;
			 high++;
			 if(low==-1||high==str.length()) 
				break; 
			
			}
			 String  palindrom =str.substring(low+1,high);
			 if(palindrom.length()>LPS.length()) {
				 LPS=palindrom;
			 }	
		}
		return LPS;
		}
		
		
		
		
	

}
