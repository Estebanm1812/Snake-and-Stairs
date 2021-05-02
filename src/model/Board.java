package model;

public class Board {
	
	private Node first;
	private int numCols;
	private int numRows;
	private int snakes;
	private int ladders;
	private int countedSnakes;
	private int countedLadders;
	private String msg = " ";
	
	public Board(int m,int n,int s,int l,Player player1) {
		
		numCols = n;
		numRows = m;
		snakes = s;
		ladders = l;
		createBoard();
		countedLadders = 0;
		countedSnakes = 0;
		
	
	}
	public void createBoard() {
		first = new Node(1,1,1);
		createRow(1,1,first);
		
	}
	public void createRow(int i,int j, Node node) {
		createColumn(i,j,node);
		if(i<numRows) {
			Node down = new Node(i,j,node.getPos()+1);
			System.out.println("Se creo un nodo en la posicion: " + i +","+ j + " con un valor pos:" + down.getPos());
			node.setDown(down);
			down.setUp(node); 
			createRow(i+1, j, down);
		}
	}
	public void createColumn(int i,int j, Node node) {
		if(j<numCols) {
			Node current = new Node(i,j,node.getPos());
			current.setPrevious(node);
			System.out.println("Se creo un nodo en la posicion: " + i +","+ j + " con un valor pos:" + current.getPos());
			node.setNext(current);
			createColumn(i, j+1,current);
		}
	}
	public String toString() {
		String msg2 = " ";
		//msg = toStringRow(first);
		toStringRow(first);
		
		return getMsg();
	}
	public String toStringRow(Node node) {
			toStringColumn(node);
		
		if(node.getDown() != null) {
			
			node = node.getDown();
			toStringRow(node);
			
		}
		return msg;
	}
	public String toStringColumn(Node node) {
		
		msg += (getMsg() + node.toString());
		System.out.println("El nodo en " + node.getRow()+","+node.getColumn()+" tiene una posicion: " + node.getPos());
		if(node.getNext()!=null) {
		
			node = node.getNext();
			toStringColumn(node);
			}else {
				
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
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public int getNumCols() {
		return numCols;
	}
	public void setNumCols(int numCols) {
		this.numCols = numCols;
	}
	public int getNumRows() {
		return numRows;
	}
	public void setNumRows(int numRows) {
		this.numRows = numRows;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
