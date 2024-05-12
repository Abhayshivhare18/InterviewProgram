package prm;

public class LeetcodeEightStringToInteger {

	public static void main(String[] args) {
       
		String s = "   -91283472332";
		System.out.print(extracted(s));
		
		  
	}

	private static int extracted(String s) {
		if(s.length()==0) return s.length();
		s=s.trim();
		long result =0;
		int current=0;
		boolean neg=false;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(i==0) {
				if(ch =='-') {
					neg=true;
					continue;
				}else if(ch=='+') {
					neg=false;
		          continue;
				}
			}
			if(ch>='0' && ch<='9') {
				current= ch-'0';
				result=result*10 +current;
				
				if(neg) {
					long check = -result;
					if(check<Integer.MIN_VALUE) {
						return Integer.MIN_VALUE;
					}
				}else {
					if(result>Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					}
					
				}
				
			}else {
				break;
			}
			
		}
		
		if(neg) {
			result=-result;
		}
		return (int)result;
		
		  
	}

}
