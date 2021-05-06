package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import model.Game;

public class Menu {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public Menu() {
		
	}
	public void mainMenu() throws IOException {
		int choose = -1;
		choose =  showMenu();
		
		if(choose<0 || choose>3) {
			
			try {
				choose = showMenu();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			}else{
				
			switch(choose) {
			
			case 1: 
				
				startANewGame();
			
			break;
			
			case 2: watchScores();
			break;
			
			case 3: 
			break;
			}
			}
			bw.close();
			br.close();		
		
	}
	public int showMenu() throws IOException {
		int choose = 0;
		System.out.println("Starting Applicacion");
		System.out.println("Welcome to Snakes and Ladders, Please choose an Option");		
		System.out.print("(1) To Play a new Game\n" + "(2) To see the Winners`s scores \n" + "(3) To exit the Game\n");
		choose = Integer.parseInt(br.readLine());
		return choose;
	} 
	
	public static void startANewGame() throws IOException {
		
		Game newGame;
		
		System.out.println("Write the number of column, rows, snakes, ladders and players like one of the next two examples: \n" +
				"4, 5, 2, 2, 3 \n" + "4,5,2,2,*,!,$");
				String [] parts = br.readLine().split(",");
				
				if(parts.length<5 || parts.length>14) {
					
					bw.write("Unvalid entrance");
					return;
					
				}else {
				switch(parts.length) {
				case 5: newGame = new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),Integer.parseInt(parts[4]));
				
				String msg = newGame.printBoard();
				System.out.println(msg);
				int quantity = newGame.currentAmountPlayer();
				System.out.println("La cantidad de jugadores es: " + quantity);
				
				
				break;
				case 6: newGame = new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5]);
					
				break;
				case 7: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6]);
				break;
				case 8:	newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7]);
					
				break;
				case 9: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8]);
					
				break;
				case 10: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9]);
				break;
				case 11: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10]);
				break;
				case 12: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11]);
				break;
				case 13: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11],parts[12]);
				break;
				case 14: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11],parts[12],parts[13]);
				break;
				}
				}
		bw.close();
	}
	public static void watchScores() {
		
	}
}
