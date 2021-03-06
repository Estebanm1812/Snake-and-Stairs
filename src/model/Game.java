package model;

public class Game {
	
	private WinerPlayer playerWinner;
	
	private Board gameBoard;
	
	private Boolean finished;
	
	private Player player1;
	
	private String msg;
	
	private Player winnerPlayer;
	
	public Game(int numRows,int numColumns, int snakes, int ladders, int players) {
		
		player1 = new Player("!");
		assignPlayers(player1,2,players);
		gameBoard =new Board(numRows,numColumns,snakes,ladders,player1);
		assignPlayersFirstPosition(player1);
		finished = false;
		msg = gameBoard.toString();
	}
	public Game(int numRows,int numColumns, int snakes, int ladders, String symbol1,String symbol2) {
		
		player1 = new Player(symbol1);
		Player player2 = new Player(symbol2);
		player1.setNextPlayer(player2);
		player2.setPreviusPlayer(player1);
		gameBoard = new Board(numRows,numColumns,snakes,ladders,player1);
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		finished = false;
		msg = gameBoard.toString();

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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		finished = false;
		msg = gameBoard.toString();

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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		
		
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		finished = false;
		msg = gameBoard.toString();
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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		player5.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player5.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		finished = false;
		msg = gameBoard.toString();

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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		player5.setPos(gameBoard.getFirst());
		player6.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player5.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player6.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		
		finished = false;
		msg = gameBoard.toString();
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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		player5.setPos(gameBoard.getFirst());
		player6.setPos(gameBoard.getFirst());
		player7.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player5.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player6.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player7.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		finished = false;
		msg = gameBoard.toString();

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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		player5.setPos(gameBoard.getFirst());
		player6.setPos(gameBoard.getFirst());
		player7.setPos(gameBoard.getFirst());
		player8.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player5.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player6.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player7.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player8.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		msg = gameBoard.toString();
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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		player5.setPos(gameBoard.getFirst());
		player6.setPos(gameBoard.getFirst());
		player7.setPos(gameBoard.getFirst());
		player8.setPos(gameBoard.getFirst());
		player9.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player5.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player6.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player7.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player8.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player9.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		msg = gameBoard.toString();
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
		player1.setPos(gameBoard.getFirst());
		player2.setPos(gameBoard.getFirst());
		player3.setPos(gameBoard.getFirst());
		player4.setPos(gameBoard.getFirst());
		player5.setPos(gameBoard.getFirst());
		player6.setPos(gameBoard.getFirst());
		player7.setPos(gameBoard.getFirst());
		player8.setPos(gameBoard.getFirst());
		player9.setPos(gameBoard.getFirst());
		player10.setPos(gameBoard.getFirst());
		player1.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player2.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player3.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player4.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player5.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player6.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player7.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player8.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player9.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		player10.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		msg = gameBoard.toString();
	}
	public void assignPlayers(Player player, int counter,int players) {
		
		
		if(counter<=players) {
		
		switch(counter) {
		
		/*case 1:	//player = new Player("!");
				Player anotherPlayer = new Player("* ");
				System.out.println("Player symbol in case1: " + player.getSymbol());
				System.out.println("tmpPlayer symbol in case1: " + anotherPlayer.getSymbol());
				player.setNextPlayer(anotherPlayer);
				anotherPlayer.setPreviusPlayer(player);
				assignPlayers(anotherPlayer, counter+1, players);
				
		break;*/
		case 2: //player = new Player("*");
				Player anotherPlayer2 = new Player("*");
				
				player.setNextPlayer(anotherPlayer2);
				anotherPlayer2.setPreviusPlayer(player);
				
				assignPlayers(anotherPlayer2, counter+1, players);
			
		break;
		case 3:	//player = new Player("O");
				Player anotherPlayer3 = new Player("O");
				
				player.setNextPlayer(anotherPlayer3);
				anotherPlayer3.setPreviusPlayer(player);
				
				assignPlayers(anotherPlayer3, counter+1, players);
			
		break;
		case 4:	//player = new Player("X");
				Player anotherPlayer4 = new Player("X");
				
				player.setNextPlayer(anotherPlayer4);
				anotherPlayer4.setPreviusPlayer(player);
			
				assignPlayers(anotherPlayer4, counter+1, players);
			
		break;
		case 5:	//player = new Player("%");
				Player anotherPlayer5 = new Player("%");
				
				player.setNextPlayer(anotherPlayer5);
				anotherPlayer5.setPreviusPlayer(player);
			
				assignPlayers(anotherPlayer5, counter+1, players);
			
		break;
		case 6:	//player = new Player("$");
				Player anotherPlayer6 = new Player("$");
				
				player.setNextPlayer(anotherPlayer6);
				anotherPlayer6.setPreviusPlayer(player);
				
				assignPlayers(anotherPlayer6, counter+1, players);
			
		break;
		case 7:	//player = new Player("#");
				Player anotherPlayer7 = new Player("#");
				
				player.setNextPlayer(anotherPlayer7);
				anotherPlayer7.setPreviusPlayer(player);
				
				assignPlayers(anotherPlayer7, counter+1, players);
				
		break;
		case 8:	//player = new Player("+");
				Player anotherPlayer8 = new Player("+");
				
				player.setNextPlayer(anotherPlayer8);
				anotherPlayer8.setPreviusPlayer(player);
				
				assignPlayers(anotherPlayer8, counter+1, players);
			
		break;
		case 9:	//player = new Player("!");
				Player anotherPlayer9 = new Player("!");
				
				player.setNextPlayer(anotherPlayer9);
				anotherPlayer9.setPreviusPlayer(player);
			
				assignPlayers(anotherPlayer9, counter+1, players);
			
		break;
		case 10://player = new Player("&");
				Player anotherPlayer10 = new Player("&");
				
				player.setNextPlayer(anotherPlayer10);
				anotherPlayer10.setPreviusPlayer(player);
				
				assignPlayers(anotherPlayer10, counter+1, players);
			
		break;
		
		}
		}else {
			return;
		}	
	}
	public void assignPlayersFirstPosition(Player player) {
		
		player.setPos(gameBoard.getFirst());
		player.setScore(gameBoard.getNumCols()*gameBoard.getNumRows());
		if(player.getNextPlayer()!=null) {
			
			
			assignPlayersFirstPosition(player.getNextPlayer());
		}
	}
	
	
	public WinerPlayer getPlayerWinner() {
		return playerWinner;
	}

	public void setPlayer(WinerPlayer playerWinner) {
		this.playerWinner = playerWinner;
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
	public String movePlayers(int position) {
		
		String msgToReturn = " ";
		
		
		msgToReturn= movePlayers(playerInPosition(position));
			
		
		
		return msgToReturn;
	}
	private String movePlayers(Player player) {
		
		int movement = (int)(Math.random()*6)+1;
		
		String msg = " ";
		int size = gameBoard.getNumRows()*gameBoard.getNumCols();
		if(	(player.getPos().getPos()+movement)>=(size)) {
			
			winnerPlayer = player;
			finished = true;
			 msg = " The Player: " +player.getSymbol() + " Has win the game";
			
		}else {
		
			int posOrigin = player.getPos().getPos();
		
			
			Node tmpNode = gameBoard.findNode(posOrigin+movement, player.getPos());
			msg = gameBoard.changePlayerPosition(player, player.getPos(), tmpNode);
			
		}	
		return msg;
	}
	public WinerPlayer createWinnerPlayer(String nickName) {
		
		 int numRows = gameBoard.getNumRows();
		
		 int numColumns = gameBoard.getNumCols();
		
		 int snakes = gameBoard.getSnakes();
		 
		 int ladders = gameBoard.getLadders();
		 
		 String symbols = player1.toStringPlayersSymbols();
		 
		 double totalScore = winnerPlayer.calculateTotalScore();
		 
		 String winnerSymbol = winnerPlayer.getSymbol();
		
		 playerWinner = new WinerPlayer(winnerSymbol, numColumns, numRows, snakes, ladders, symbols, totalScore,nickName);
		 return playerWinner;
	}
	public String printBoard() {
		
		String msg = " ";
		
		msg += gameBoard.toString();
		
		return msg;
	}
	public int currentAmountPlayer() {
		
		int players = 0;
		
		players = currentAmountPlayer(player1, players);
		
		return players;
	}
	private int currentAmountPlayer(Player player,int amount) {
		
		if(player != null) {
		
			amount+=1;
			amount = currentAmountPlayer(player.getNextPlayer(), amount);
		}
		return amount;
	}
	public String getMsg() {
		return msg;
	}
	public Player playerInPosition(int position) {
		
		int counter = 1;
		
		if(position == counter) {
		
			return player1;
		}else {
			if(player1.getNextPlayer()!=null) {
			
				return playerInPosition(position, counter+1,player1);
				
			}	
		}
		return null;
	}
	private Player playerInPosition(int position, int counter,Player player) {
	
		if(position == counter) {
		
			return player.getNextPlayer();
			
		}else {
			
			if(player.getNextPlayer()!=null) {
			return playerInPosition(position, counter+1, player.getNextPlayer());
			}
		}
		return null;
	}
	public String printJustBoard() {
		
		String msg = "";
		
		msg = gameBoard.toStringJustBoard();
		
		return msg;
	}
	public String printCurrentBoard() {
		
		String msg = "";
		
		msg = gameBoard.toStringBoardWithPlayers();
		
		return msg;
	}
}
