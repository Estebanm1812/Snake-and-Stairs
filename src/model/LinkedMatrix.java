package model;

public class LinkedMatrix {
	
	private Node first;
	private int numCols;
	private int numRows;
	
	public LinkedMatrix(int m,int n) {
		
		numCols = n;
		numRows = m;
		createBoard();
	}
	public void createBoard() {
		first = new Node(0,0);
		createRow(0,0,first);
		
	}
	public void createRow(int i,int j, Node node) {
		createColumn(i,j,node);
		if(i+1<numRows) {
			Node down = new Node(i,j);
			node.setDown(down);
			down.setUp(node); 
			createRow(i+1, j, down);
		}
	}
	public void createColumn(int i,int j, Node node) {
		if(j<numCols) {
			Node current = new Node(i,j);
			current.setPrevious(node);
			node.setNext(current);
			createColumn(i, j+1,current);
		}
	}
	
}
