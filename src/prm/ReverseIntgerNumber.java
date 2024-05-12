package prm;

public class ReverseIntgerNumber {
	
	public static void main(String[] args) {
		int number =11112234;
    	int newNumber=0;
    	
    	while(number>0) {
    		newNumber=newNumber*10+number%10;
    		number=number/10;
    	}
    	System.out.println("Reverse nunber" +newNumber);	                    			

	}
	

}
