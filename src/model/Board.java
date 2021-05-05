package model;

public class Board {
	
	private Node first;
	private int numCols;
	private int numRows;
	private int snakes;
	private int ladders;
	private int countedSnakes;
	private int countedLadders;
	private int interation;
	
	public Board(int m,int n,int s,int l,Player player1) {
		
		numCols = n;
		numRows = m;
		snakes = s;
		ladders = l;
		createBoard();
		countedLadders = 0;
		countedSnakes = 0;
		first.setPlayerInNode(player1);
		interation = 0;
		genereateRandomSnake();
		generateLadders();
		
	}
	public void createBoard() {
		first = new Node(1,1,1);
		
		//System.out.println("El primer nodo esta en la posicion: " + first.getRow() + "," + first.getColumn() + " con un valor pos de: " + first.getPos());
		createRow(1,2,first);
		
	}
	
	public void createRow(int i,int j,Node node) {
		
		Node tmpNode;
		
		if(j<=numRows && i <=numCols) {
		
			tmpNode= new Node(i,j,node.getPos()+1);
			tmpNode.setPrevious(node);
			node.setNext(tmpNode);
			System.out.println("El nodo en " + node.getRow()+","+node.getColumn()+" tiene una posicion: " + node.getPos());
		
			if(j+1>numRows) {
				System.out.println(j+1);
				System.out.println("entra a crear otra columna");
				createRow(i+1,1,tmpNode);
				
				
			}else{
				System.out.println("entra a crear otra fila");
				createRow(i,j+1,tmpNode);
			}	
		
		}
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
		msg2 = toStringRow();
		
		System.out.println(interation);
		
		return msg2;
	}
	public String toStringRow() {
		
		String msg2 = "";
		
		msg2 = toStringRow(first);
		
		return msg2;
	}
	private String toStringRow(Node node) {
	
		String msg3 = "";
		
		msg3+= node.toString() + " ";
	
		if(node.getRow()==1 && node.getColumn()!=1 ) {
			msg3+= "\n";
			
		}	
		if(node.getNext()!=null) {
			
			msg3+= toStringRow(node.getNext());
			
		}
		return msg3;
	}
	
	/*
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
		//System.out.println("El nodo en " + node.getRow()+","+node.getColumn()+" tiene una posicion: " + node.getPos());
		if(node.getNext()!=null) {
		
			node = node.getNext();
			toStringColumn(node);
			}else {
				
			}
		return msg;
		}
	*/	
	public void genereateRandomSnake() {
		
		if(countedSnakes == snakes) {
			return;
		}else {
		int n = numRows*numCols;
		int randomNumber = (int)(Math.random()*n)+1;
		System.out.println(randomNumber);
		int randomNumber2 = (int)(Math.random()*n)+1;
		System.out.println(randomNumber2);
		int randomNumber3 = (int)(Math.random()*26)+1;
		String letter = generateRandomLetter(randomNumber3);
		System.out.println("Aun no entra1, la letra elegida fue:" + letter);
		if(first.getPos()==randomNumber) {
			 
				
			
		}else {
			Node tmp = findNode(randomNumber, first);
			tmp.setInUse(true);
			Node tmp2 = findNode(randomNumber2, first);
			tmp2.setInUse(true);
			tmp.setConnection(tmp2);
			tmp2.setConnection(tmp);
			tmp.setSnakeLetter(letter);
			tmp2.setSnakeLetter(letter);
			System.out.println("Entro");
			countedSnakes+=1;
			System.out.println("se han creado:" + countedSnakes + " Serpientes hasta el momento1");
			genereateRandomSnake();
		}
		}
	}
	public String generateRandomLetter(int i) {
		
		String letter = " ";
		
		switch(i) {
		
		case 1: letter = "A";
		break;
		
		case 2: letter = "B";
		break;
		
		case 3: letter = "C";
		break;
		
		case 4: letter = "D";
		break;
		
		case 5: letter = "E";
		break;
			
		case 6: letter = "F";
		break;
		
		case 7: letter = "G";
		break;
		
		case 8: letter = "H";
		break;
		
		case 9: letter = "I";
		break;
		
		case 10: letter = "J";
		break;
		
		case 11: letter = "K";
		break;
		
		case 12: letter = "L";
		break;
		
		case 13: letter = "M";
		break;
		
		case 14: letter = "N";
		break;
		
		case 15: letter = "O";
		break;
		
		case 16: letter = "P";
		break;
		
		case 17: letter = "Q";
		break;
		
		case 18: letter = "R";
		break;
		
		case 19: letter = "S";
		break;
		
		case 20: letter = "T";
		break;
		
		case 21: letter = "U";
		break;
		
		case 22: letter = "V";
		break;
		
		case 23: letter = "W";
		break;
		
		case 24: letter = "X";
		break;
		
		case 25: letter = "Y";
		break;
		
		case 26: letter = "Z";
		break;
		
		}
		return letter;
	}
	public void generateLadders() {
		
		if(countedLadders == ladders) {
			return;
		}else {
		int n = numRows*numCols;
		int randomNumber = (int)(Math.random()*n)+1;
		System.out.println(randomNumber);
		int randomNumber2 = (int)(Math.random()*n)+1;
		System.out.println(randomNumber2);
		int randomNumber3 = (int)(Math.random()*120)+1;
		System.out.println(randomNumber3);
		System.out.println("Aun no entra2");
		if(first.getPos()==randomNumber) {
			 
				
			
		}else {
			Node tmp = findNode(randomNumber, first);
			tmp.setInUse(true);
			Node tmp2 = findNode(randomNumber2, first);
			tmp2.setInUse(true);
			if(tmp.isInUse()==true || tmp2.isInUse()==true) {
				generateLadders();
				return;
			}else {
				
			tmp.setConnection(tmp2);
			tmp2.setConnection(tmp);
			tmp.setLadderNumber(randomNumber3);
			tmp2.setLadderNumber(randomNumber3);
			System.out.println("Entro a la parte final");
			countedLadders+=1;
			generateLadders();
			}
		}	
		}
	}	
		
		
		
	
	public Node findNode(int position, Node node) {
		
		if(node.getPos()==position) {
		
			return node;
			
		}else {
			
			return findNode(position,node.getNext());
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
	
	
}
