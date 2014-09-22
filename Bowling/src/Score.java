
enum status { 
	STRIKE, SPARE, DEFAULT, GUTTER;
}

public class Score {
	status state;
	int point;
	
	Score(){
		state = status.DEFAULT;
		point = 0;
	}
}
