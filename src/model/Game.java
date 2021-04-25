package model;

public class Game {
	
	private WinerPlayer player;
	
	public Game() {
		
		setPlayer(null);
	}

	public WinerPlayer getPlayer() {
		return player;
	}

	public void setPlayer(WinerPlayer player) {
		this.player = player;
	}
	
}
