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
		first.setPlayerInNode(player1);
	
	}
	public void createBoard() {
		first = new Node(1,1,1);
		
		System.out.println("El primer nodo esta en la posicion: " + first.getRow() + "," + first.getColumn() + " con un valor pos de: " + first.getPos());
		createRow(1,1,first);
		
	}
	public void createRow(int i,int j,Node node) {
		
		if(node.getRow()+1>numRows) {
		
			Node nodetmp = new Node(i+1,1,node.getPos()+1);
			nodetmp.setPrevious(node);
			node.setNext(nodetmp);
			createRow(i, j+1, nodetmp);
		}	
		if(j<numRows+1) {
		
			Node node2 = new Node(i,j,node.getPos()+1);
			node.setNext(node2);
			node2.setPrevious(node);
			createRow(i, j+1, node2);
		}/*
		if(i<numCols+1) {
			
			Node nNode = new Node(i,j,node.getPos()+1);
			nNode.setPrevious(node);
			node.setNext(node);
			createRow()
			
		}*/
	}
	/*
	public void createRow(int i,int j, Node node) {
		createColumn(i,j+1,node);
		if(i<numRows) {
			Node down = new Node(i,j,node.getPos()+1);
			System.out.println("Se creo un nodo en la posicion: " + i +","+ j + " con un valor pos:" + down.getPos());
			node.setDown(down);
			down.setUp(node); 
			createRow(i+1, j, down);
		}
	}
	public void createColumn(int i,int j, Node node) {
		if(j+1<numCols) {
			Node current = new Node(i,j,node.getPos()+1);
			current.setPrevious(node);
			System.out.println("Se creo un nodo en la posicion: " + i +","+ j + " con un valor pos:" + current.getPos());
			node.setNext(current);
			createColumn(i, j+1,current);
		}
	}*/
	public String toString() {
		String msg2 = " ";
		//msg = toStringRow(first);
		toStringRow(first);
		
		return getMsg();
	}
	public String toStringRow(Node node) {
			toStringColumn(node);
		
		if(node.getNext() != null) {
			
			node = node.getNext();
			toStringRow(node);
			
		}
		return msg;
	}
	public String toStringColumn(Node node) {
		
		msg = (getMsg() + node.toString());
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
