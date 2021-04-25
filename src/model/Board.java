package model;

public class Board {
	
	private Node first;
	private int numCols;
	private int numRows;
	private int snakes;
	private int ladders;
	private int countedSnakes;
	private int countedLadders;
	private Boolean finished;
	
	public Board(int m,int n,int s,int l) {
		
		numCols = n;
		numRows = m;
		snakes = s;
		ladders = l;
		createBoard();
		countedLadders = 0;
		countedSnakes = 0;
		finished = false;
	}
	public void createBoard() {
		first = new Node(0,0,0);
		createRow(0,0,first);
		
	}
	public void createRow(int i,int j, Node node) {
		createColumn(i,j,node);
		if(i+1<numRows) {
			Node down = new Node(i,j,node.getPos()+1);
			node.setDown(down);
			down.setUp(node); 
			createRow(i+1, j, down);
		}
	}
	public void createColumn(int i,int j, Node node) {
		if(j<numCols) {
			Node current = new Node(i,j,node.getPos());
			current.setPrevious(node);
			node.setNext(current);
			createColumn(i, j+1,current);
		}
	}
	public String toString() {
		String msg = " ";
		
		return msg;
	}
	public String toStringRow(Node node) {
		String msg = "";
		
		if(node != null) {
			
			//msg = toStringcol(node);
		}
		
		return msg;
	}
	public void genereateRandomSnake() {
		
		if(countedSnakes == snakes) {
			return;
		}
		int n = snakes*ladders;
		int randomNumber = (int)(Math.random()*n)+1;
		int randomNumber2 = (int)(Math.random()*n)+1;
		
		if(first.getPos()==randomNumber) {
			 
			
		}
	}
}
