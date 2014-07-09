//2014 07 09 
//문자열 계산기 코
public class sense5 {
	
	static int SplitandSum(String str) {
		
		if( str.isEmpty() == true )
			return 0;
		
		String number = "";
	
		int sum = 0;
		
		for (int i = 0; i < str.length(); ++i){
			if( str.charAt(i) == ',' || str.charAt(i) == '\n' ){
				sum +=  Integer.valueOf(number);
				number = "";
			}
			else{
				number += str.charAt(i);
			}	
		}
		return sum + Integer.valueOf(number);
	}

	public static void main(String[] args) {
		String calc = "1,2\n30,4\n5";
		System.out.format("sum = %d", sense5.SplitandSum(calc));
	}
}