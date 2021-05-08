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
	public static void mainMenu() throws IOException {
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
			
			case 3: System.out.println("ByeBye");
					System.exit(0);
			break;
			}
			}
			bw.close();
			br.close();		
		
	}
	public static int showMenu() throws IOException {
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
				int amount = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount,newGame);
				
				
				break;
				case 6: newGame = new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5]);
					
				String msg2 = newGame.printBoard();
				System.out.println(msg2);
				int amount2 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount2,newGame);
				
				break;
				case 7: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6]);
				
				String msg3 = newGame.printBoard();
				System.out.println(msg3);
				int amount3 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount3,newGame);
				
				break;
				case 8:	newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7]);
					
				String msg4 = newGame.printBoard();
				System.out.println(msg4);
				int amount4 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount4,newGame);
				
				break;
				case 9: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8]);
					
				String msg5 = newGame.printBoard();
				System.out.println(msg5);
				int amount5 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount5,newGame);
				
				break;
				case 10: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9]);
				
				
				String msg6 = newGame.printBoard();
				System.out.println(msg6);
				int amount6 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount6,newGame);
				break;
				
				case 11: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10]);
				
				String msg7 = newGame.printBoard();
				System.out.println(msg7);
				int amount7 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount7,newGame);
				
				break;
				case 12: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11]);
				
				String msg8 = newGame.printBoard();
				System.out.println(msg8);
				int amount8 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount8,newGame);
				
				break;
				case 13: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11],parts[12]);
				
				String msg9 = newGame.printBoard();
				System.out.println(msg9);
				int amount9 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount9,newGame);
				
				break;
				case 14: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11],parts[12],parts[13]);
				
				String msg10 = newGame.printBoard();
				System.out.println(msg10);
				int amount10 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount10,newGame);
				
				break;
				}
				}
		bw.close();
	}
	public static void keepPlaying(int player,int amountPlayer, Game newGame) throws IOException {
		
		if(newGame.getFinished()==false) {
		
		if(player<=amountPlayer) {
			System.out.println("Es el turno del jugador numero: " + player);
			
			String line = br.readLine();
			
			if(line.equals("")) {
				System.out.println("El jugador esta en: "+newGame.playerInPosition(player).getPos().getPos());
				System.out.println(newGame.movePlayers(player));
				keepPlaying(player+1, amountPlayer, newGame);
				mainMenu();
			}else if(line.equals("simul")) {
				
				keepPlayinAuto(player, amountPlayer, newGame);
				
			}else if(line.equals("menu")) {
				
				showMenu();
			}
		}else{
			keepPlaying(1, amountPlayer, newGame);
			
		}
		}{
			
			
		}
	}
	public static void keepPlayinAuto(int player, int amountPlayer,Game newGame) throws IOException {
		
		if(newGame.getFinished()==false) {
			
			if(player<=amountPlayer) {
				System.out.println("Es el turno del jugador numero: " + player);
				
					System.out.println("El jugador esta en: "+newGame.playerInPosition(player).getPos().getPos());
					System.out.println(newGame.movePlayers(player));
					keepPlayinAuto(player+1, amountPlayer, newGame);
					mainMenu();
				
			}else{
				keepPlayinAuto(1, amountPlayer, newGame);
				
			}
			}{
				
				
			}
		
	}
	
	public static void watchScores() {
		
	}
}
