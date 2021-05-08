package model;

public class ScoreSaver {

	WinerPlayer wp;
	
	public ScoreSaver() {
		
		
		
	}
	public void addWinnerPlayer(WinerPlayer wp2) {
		
		if(wp==null) {
			
			wp = wp2;
		}else {
			
			if(wp.getScore()<=wp2.getScore()) {
				
				wp.setPreviousWinnerPlayer(wp2);
				
			}else {
				wp.setNextWinnerPlayer(wp2);
			}
			
		}
		
	}
	
}
