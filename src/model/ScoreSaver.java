package model;

public class ScoreSaver {

	WinerPlayer wp;
	
	String scores;
	
	public ScoreSaver() {
			
		scores = " ";
	}
	public void addWinnerPlayer(WinerPlayer wp2) {
		
		if(wp==null) {
			
			wp = wp2;
		}else {
			setScores(" ");
			addWinnerPlayer(wp, wp2);
			
		}
		
	}
	/*
	private void addWinnerPlayer(WinerPlayer wp1, WinerPlayer wp2) {
		
		if(wp1.getScore()<wp2.getScore()) {
			if(wp1.getPreviousWinnerPlayer()==null) {
			wp1.setPreviousWinnerPlayer(wp2);
			System.out.println("Conexion Creada");
			} else {
				addWinnerPlayer(wp1.getPreviousWinnerPlayer(), wp2);
				
			} 
		} else if(wp1.getScore()>=wp2.getScore()){
			if(wp1.getNextWinnerPlayer()==null) {
				wp1.setNextWinnerPlayer(wp2);
				System.out.println("Conexion Creada");
			} else {
				addWinnerPlayer(wp1.getNextWinnerPlayer(), wp2);
			}
		}
	}
	*/
	
	private void addWinnerPlayer(WinerPlayer wp1, WinerPlayer wp2) {
		
		if(wp1.getScore()<wp2.getScore()) {
			if(wp1.getNextWinnerPlayer()==null) {
			wp1.setNextWinnerPlayer(wp2);
			} else {
				addWinnerPlayer(wp1.getNextWinnerPlayer(), wp2);
				
			} 
		} else if(wp1.getScore()>=wp2.getScore()){
			if(wp1.getPreviousWinnerPlayer()==null) {
				wp1.setPreviousWinnerPlayer(wp2);
			} else {
				addWinnerPlayer(wp1.getPreviousWinnerPlayer(), wp2);
			}
		}
	}
	

	
	public String showScores() {
		
		String msg = "";
		setScores(" ");
		if(wp == null) {
			
			msg = "There are not a winner Player yet";
			return msg;
		}else {
			
			showScores(wp);
			
		}
		return scores;
	}
	/*private String showScores(String msg, WinerPlayer wpr) {
		//msg+= "\n The Player " + wpr.getNickName() + " had a Score of: " + wpr.getTotalScore();

			if(wpr.getNextWinnerPlayer()!=null) {
			
				
				
			}	
		return msg;
	}*/
	private void showScores(WinerPlayer wpr) {
		
		if(wpr == null) {
			return;
		}else {
			
			showScores(wpr.getPreviousWinnerPlayer());
			scores+= "The Player " + wpr.getNickName() + " had a Score of: " + wpr.getTotalScore() + " And the used symbols where: " + wpr.getSymbols() + "\n"; 
			showScores(wpr.getNextWinnerPlayer());
		}
		return;
	}
	public void setScores(String msg) {
		scores = msg;
	}
}
