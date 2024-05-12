package prm;

public class leetcodeTwelyIntegerToRoman {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int num=10;
		
		//MCMXCIV
		roman(sb,'*','M','*',num/1000);
		num=num%1000;
		
		roman(sb,'M','C','D',num/100);
		num=num%100;
		
		roman(sb,'C','X','L',num/10);
		num=num%10;
		
		roman(sb,'X','I','V',num);
		
	    System.out.println(sb.toString());
		
	}
	
	
	public static void  roman(StringBuilder bd, char major, char min, char middle, int value) {
		
		if(value<=3) {
			for(int i=1; i<=value; i++) {
				bd.append(min);
			}
		}else if(value==4) {
			bd.append(min);
			bd.append(middle);
		}else if(value==5) {
			bd.append(middle);
		}else if(value<=8) {
			bd.append(middle);
			for(int i=6; i<=value; i++) {
				bd.append(min);
			}
		}else if(value==9) {
			bd.append(min);
			bd.append(major);
		}
	}

}
