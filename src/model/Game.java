package model;

public class Game {
	
	private WinerPlayer player;
	
	private Board gameBoard;
	
	private Boolean finished;
	
	private Player player1;
	
	public Game(int numRows,int numColumns, int snakes, int ladders, int players) {
		
		assignPlayers(player1,1,players);
		gameBoard =new Board(numRows,numColumns,snakes,ladders,player1);
		
		
		
		finished = false;
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4,String symbol5) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7,String symbol8) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7,String symbol8,String symbol9) {
		
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7,String symbol8,String symbol9,String symbol10) {
		
	}
	public void assignPlayers(Player player, int counter,int players) {
		
		if(counter<=players) {
		
		switch(counter) {
		
		case 1:	player = new Player("!");
				Player anotherPlayer = player.getNextPlayer();
				player.setNextPlayer(anotherPlayer);
				anotherPlayer.setPreviusPlayer(player);
				assignPlayers(anotherPlayer, counter+1, players);
				
		break;
		case 2: player = new Player("*");
				Player anotherPlayer2 = player.getNextPlayer();
				player.setNextPlayer(anotherPlayer2);
				anotherPlayer2.setPreviusPlayer(player);
				assignPlayers(anotherPlayer2, counter+1, players);
			
		break;
		case 3:
			player = new Player("O");
			Player anotherPlayer3 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer3);
			anotherPlayer3.setPreviusPlayer(player);
			assignPlayers(anotherPlayer3, counter+1, players);
			
		break;
		case 4:
			player = new Player("X");
			Player anotherPlayer4 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer4);
			anotherPlayer4.setPreviusPlayer(player);
			assignPlayers(anotherPlayer4, counter+1, players);
			
		break;
		case 5:
			player = new Player("%");
			Player anotherPlayer5 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer5);
			anotherPlayer5.setPreviusPlayer(player);
			assignPlayers(anotherPlayer5, counter+1, players);
			
		break;
		case 6:
			player = new Player("$");
			Player anotherPlayer6 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer6);
			anotherPlayer6.setPreviusPlayer(player);
			assignPlayers(anotherPlayer6, counter+1, players);
			
		break;
		case 7:
			player = new Player("#");
			Player anotherPlayer7 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer7);
			anotherPlayer7.setPreviusPlayer(player);
			assignPlayers(anotherPlayer7, counter+1, players);
			
		break;
		case 8:
			player = new Player("+");
			Player anotherPlayer8 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer8);
			anotherPlayer8.setPreviusPlayer(player);
			assignPlayers(anotherPlayer8, counter+1, players);
			
		break;
		case 9:
			player = new Player("!");
			Player anotherPlayer9 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer9);
			anotherPlayer9.setPreviusPlayer(player);
			assignPlayers(anotherPlayer9, counter+1, players);
			
		break;
		case 10:
			player = new Player("&");
			Player anotherPlayer10 = player.getNextPlayer();
			player.setNextPlayer(anotherPlayer10);
			anotherPlayer10.setPreviusPlayer(player);
			assignPlayers(anotherPlayer10, counter+1, players);
			
		break;
		
		}
		}else {
			return;
		}	
	}

	public WinerPlayer getPlayer() {
		return player;
	}

	public void setPlayer(WinerPlayer player) {
		this.player = player;
	}
	public Board getGameBoard() {
		return gameBoard;
	}
	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}
	public Boolean getFinished() {
		return finished;
	}
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	
	
}
