package prm;

public class LeetcodeSixZigZag {

	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",3));
		
	}
	
   public static String convert(String s, int numRows) {
	   if(numRows==1){
           return s;
       }
	   StringBuilder result=new StringBuilder();
	    
	   for(int i=0; i<numRows; i++) {
		   int idx=i;
		  int southIndx=2*(numRows-1-i);
		  int northIndex=2*i; 
		  boolean goingSouth=true;
		  
		 while(idx<s.length()) {
			 result.append(s.charAt(idx));
			 if(i==0) {
				 idx+=southIndx;
			 }else if(i==numRows-1) {
				 idx+=northIndex;
			 }else {
				 if(goingSouth) {
					 idx+=southIndx;
				 }else {
					 idx+=northIndex;
				 }
				 goingSouth=!goingSouth;
			 }
		 }
		   
	   }
	   
	   return result.toString();
        
    }
}
