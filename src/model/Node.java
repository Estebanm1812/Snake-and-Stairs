package model;

public class Node {

	private int row;
	private int column;
	private int pos;
	private boolean inUse;
	
	
	private Node next;
	private Node previous;
	private Node up;
	private Node down;
	
	public Node(int row,int column,int pos) {
		this.row = row;
		this.column = column;
		this.pos = pos;
		setInUse(false);
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
	
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public String toString() {
		return "(" + pos + ")" ;
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
	
}
