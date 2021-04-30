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
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4,String symbol5) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		Player player5 = new Player(symbol5);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		player4.setNextPlayer(player5);
		player5.setPreviusPlayer(player4);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		Player player5 = new Player(symbol5);
		Player player6 = new Player(symbol6);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		player4.setNextPlayer(player5);
		player5.setPreviusPlayer(player4);
		player5.setNextPlayer(player6);
		player6.setPreviusPlayer(player5);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		Player player5 = new Player(symbol5);
		Player player6 = new Player(symbol6);
		Player player7 = new Player(symbol7);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		player4.setNextPlayer(player5);
		player5.setPreviusPlayer(player4);
		player5.setNextPlayer(player6);
		player6.setPreviusPlayer(player5);
		player6.setNextPlayer(player7);
		player7.setPreviusPlayer(player6);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7,String symbol8) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		Player player5 = new Player(symbol5);
		Player player6 = new Player(symbol6);
		Player player7 = new Player(symbol7);
		Player player8 = new Player(symbol8);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		player4.setNextPlayer(player5);
		player5.setPreviusPlayer(player4);
		player5.setNextPlayer(player6);
		player6.setPreviusPlayer(player5);
		player6.setNextPlayer(player7);
		player7.setPreviusPlayer(player6);
		player7.setNextPlayer(player8);
		player8.setPreviusPlayer(player7);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7,String symbol8,String symbol9) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		Player player5 = new Player(symbol5);
		Player player6 = new Player(symbol6);
		Player player7 = new Player(symbol7);
		Player player8 = new Player(symbol8);
		Player player9 = new Player(symbol9);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		player4.setNextPlayer(player5);
		player5.setPreviusPlayer(player4);
		player5.setNextPlayer(player6);
		player6.setPreviusPlayer(player5);
		player6.setNextPlayer(player7);
		player7.setPreviusPlayer(player6);
		player7.setNextPlayer(player8);
		player8.setPreviusPlayer(player7);
		player8.setNextPlayer(player9);
		player9.setPreviusPlayer(player8);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2,String symbol3,String symbol4, String symbol5,String symbol6,String symbol7,String symbol8,String symbol9,String symbol10) {
	
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		Player player3 = new Player(symbol3);
		Player player4 = new Player(symbol4);
		Player player5 = new Player(symbol5);
		Player player6 = new Player(symbol6);
		Player player7 = new Player(symbol7);
		Player player8 = new Player(symbol8);
		Player player9 = new Player(symbol9);
		Player player10 = new Player(symbol10);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		player2.setNextPlayer(player3);
		player3.setPreviusPlayer(player2);
		player3.setNextPlayer(player4);
		player4.setPreviusPlayer(player3);
		player4.setNextPlayer(player5);
		player5.setPreviusPlayer(player4);
		player5.setNextPlayer(player6);
		player6.setPreviusPlayer(player5);
		player6.setNextPlayer(player7);
		player7.setPreviusPlayer(player6);
		player7.setNextPlayer(player8);
		player8.setPreviusPlayer(player7);
		player8.setNextPlayer(player9);
		player9.setPreviusPlayer(player8);
		player9.setNextPlayer(player10);
		player10.setPreviusPlayer(player9);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		finished = false;

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
