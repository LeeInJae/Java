
public class MiniCalc {
	int add(int i, int j){
		return i + j;
	}
	
	int mul(int i, int j){
		return i * j;
	}
	
	int div(int i, int j){
		if( j != 0 ){
			return i / j;
		}
		return -1;
	}
	
	int sub(int i, int j){
		return i - j;
	}
	
	public static void main(String[] args){
		MiniCalc cal = new MiniCalc();
		System.out.println(cal.add(5, 7));
		System.out.println(cal.sub(10,5));
		System.out.println(cal.div(9,3));
		System.out.println(cal.mul(3,5));
	}
}
