
public class BowlingGame {
	private Frame[] frame = new Frame[11];
	
	//각 프레임당 점수 입
	void inputFramePoint(int order, Score firstScore, Score secondScore){
		frame[order].firstScore = firstScore;
		frame[order].secondScore = secondScore;
	}
	
	//각 프레임별 점수의 상태 정하
	void setFrameFirstScoreStatus(int order){
		if(frame[order].firstScore.point == 10){
			frame[order].firstScore.state = status.STRIKE;
		}
		else if(frame[order].firstScore.point != 0){
			frame[order].firstScore.state = status.DEFAULT;
		}
		else{
			frame[order].firstScore.state = status.GUTTER;
		}
	}
	
	void setFrameSecondScoreStatus(int order){
		if(frame[order].secondScore.point + frame[order].secondScore.point == 10){
			frame[order].secondScore.state = status.SPARE;
		}
		else if(frame[order].secondScore.point != 0){
			frame[order].secondScore.state = status.DEFAULT;
		}
		else{
			frame[order].secondScore.state = status.GUTTER;
		}
	}
	
	
	public static void main(String[] args) {
		BowlingGame bowling = new BowlingGame();
		System.out.println("11");
		
	}
}