package model;

public class ScoreSaver {

	WinerPlayer wp;
	
	public ScoreSaver() {
		
		
		
	}
	public void addWinnerPlayer(WinerPlayer wp2) {
		
		if(wp==null) {
			
			wp = wp2;
		}else {
			
			addWinnerPlayer(wp, wp2);
			
		}
		
	}
	private void addWinnerPlayer(WinerPlayer wp1, WinerPlayer wp2) {
		
		if(wp2.getTotalScore()<=wp1.getTotalScore()) {
			
			if(wp1.getPreviousWinnerPlayer()==null) {
			
				wp1.setPreviousWinnerPlayer(wp2);
				
			}else {
				
				addWinnerPlayer(wp1.getPreviousWinnerPlayer(), wp2);
			}	
		}else {
			
			if(wp1.getNextWinnerPlayer()==null) {
			
				wp1.setNextWinnerPlayer(wp2);
			}else {
				addWinnerPlayer(wp1.getNextWinnerPlayer(), wp2);
			}
		}	
	}
	public String showScores() {
		
		String msg = "";
		
		
		
		return msg;
	}
	
}
