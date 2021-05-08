package model;

public class Player {

	private String symbol;
	private Node pos;
	private int moves;
	private double score;
	private Player previusPlayer;
	private Player nextPlayer;

	public Player(String symbol) {
		
		this.symbol = symbol;
		pos = new Node(1,1,1);
		moves = 0;
		score = 0;
		previusPlayer = null;
		nextPlayer = null;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Node getPos() {
		return pos;
	}

	public void setPos(Node pos) {
		this.pos = pos;
	}

	public int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	public double calculateTotalScore() {
		
		double finalScore = score*moves;
		
		return finalScore;
	}

	public Player getPreviusPlayer() {
		return previusPlayer;
	}

	public void setPreviusPlayer(Player previusPlayer) {
		this.previusPlayer = previusPlayer;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
	public String toStringPlayersSymbols() {
		
		String symbols = "";
		symbols+= symbol;
		if(getNextPlayer()!=null) {
			symbols+= " ,";
			
			symbols = toStringPlayersSymbols(getNextPlayer(), symbols);
		}	
		return symbols;
	}
	private String toStringPlayersSymbols(Player player,String msg) {
		
		
		msg += player.getSymbol();

		if(player.getNextPlayer()!=null) {
		
			msg+= " ,";
			
			msg= toStringPlayersSymbols(player.getNextPlayer(), msg);
		}
		return msg;
		
	}
	
	
}
