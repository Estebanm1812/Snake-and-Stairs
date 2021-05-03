package model;

public class Node {

	private int row;
	private int column;
	private int pos;
	private boolean inUse;
	private String snakeLetter;
	private int ladderNumber;
	
	private Node next;
	private Node previous;
	/*private Node up;
	private Node down;*/
	private Node connection;
	private Player playerInNode;
	
	public Node(int row,int column,int pos) {
		this.row = row;
		this.column = column;
		this.pos = pos;
		setInUse(false);
		setConnection(null);
		setPlayerInNode(null);
		snakeLetter = "";
		ladderNumber = 0;

	
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	/*
	public Node getUp() {
		return up;
	}
	public void setUp(Node up) {
		this.up = up;
	}
	public Node getDown() {
		return down;
	}
	public void setDown(Node down) {
		this.down = down;
	}
	*/
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public String toString() {
		
		String msg = "";
		msg += "[ " + pos;
		if(snakeLetter!="") {
			
			msg+= snakeLetter;
		}else if(ladderNumber !=0) {
			
			msg+= ladderNumber;
		}
		if(playerInNode!=null) {
			msg+= " "+playerInNode.toStringPlayersSymbols();
		}
		msg+= " ]";
		return msg ;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}

	public String getSnakeLetter() {
		return snakeLetter;
	}

	public void setSnakeLetter(String snakeLetter) {
		this.snakeLetter = snakeLetter;
	}

	public int getLadderNumber() {
		return ladderNumber;
	}

	public void setLadderNumber(int ladderNumber) {
		this.ladderNumber = ladderNumber;
	}

	public Node getConnection() {
		return connection;
	}

	public void setConnection(Node connection) {
		this.connection = connection;
	}

	public Player getPlayerInNode() {
		return playerInNode;
	}

	public void setPlayerInNode(Player playerInNode) {
		this.playerInNode = playerInNode;
	}

	
}
