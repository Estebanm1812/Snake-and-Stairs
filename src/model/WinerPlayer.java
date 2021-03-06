package model;

public class WinerPlayer extends Player{

	private int columns;
	private int rows;
	private int snakes;
	private int ladders;
	private String symbols;
	private double totalScore;
	private String nickName;
		
	private WinerPlayer nextWinnerPlayer;
	private WinerPlayer previousWinnerPlayer;
	
	public WinerPlayer(String winnerSymbol,int columns,int rows,int snakes,int ladders,String symbols,double totalScore,String nickName) {
		super(winnerSymbol);
		this.columns = columns;
		this.rows = rows;
		this.snakes = snakes;
		this.ladders = ladders;
		this.symbols = symbols;
		this.totalScore = totalScore;
		this.nickName = nickName;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSnakes() {
		return snakes;
	}

	public void setSnakes(int snakes) {
		this.snakes = snakes;
	}

	public int getLadders() {
		return ladders;
	}

	public void setLadders(int ladders) {
		this.ladders = ladders;
	}

	public String getSymbols() {
		return symbols;
	}

	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}

	public WinerPlayer getNextWinnerPlayer() {
		return nextWinnerPlayer;
	}

	public void setNextWinnerPlayer(WinerPlayer nextWinnerPlayer) {
		this.nextWinnerPlayer = nextWinnerPlayer;
	}

	public WinerPlayer getPreviousWinnerPlayer() {
		return previousWinnerPlayer;
	}

	public void setPreviousWinnerPlayer(WinerPlayer previousWinnerPlayer) {
		this.previousWinnerPlayer = previousWinnerPlayer;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	
	

	
}
