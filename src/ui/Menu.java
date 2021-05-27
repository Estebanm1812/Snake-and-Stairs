package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import model.Game;
import model.ScoreSaver;
import model.WinerPlayer;

public class Menu {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static ScoreSaver ss = new ScoreSaver();
	
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
		System.out.println("Welcome to Snakes and Ladders, Please choose an Option");		
		System.out.print("(1) To Play a new Game\n" + "(2) To see the Winners`s scores \n" + "(3) To exit the Game\n");
		choose = Integer.parseInt(br.readLine());
		return choose;
	} 
	
	public static void startANewGame() throws IOException {
		
		Game newGame;
		String nickName = "";
		System.out.println("Write the number of rows, columns, snakes, ladders and players like one of the next two examples: \n" +
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
				System.out.println("Insert nickName for the winenrPlayer");
				nickName = br.readLine();
				WinerPlayer wp = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp);
				mainMenu();
				
				break;
				case 6: newGame = new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5]);
					
				String msg2 = newGame.printBoard();
				System.out.println(msg2);
				int amount2 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount2,newGame);
				nickName = br.readLine();
				WinerPlayer wp2 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp2);
				mainMenu();
				
				break;
				case 7: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6]);
				
				String msg3 = newGame.printBoard();
				System.out.println(msg3);
				int amount3 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount3,newGame);
				nickName = br.readLine();
				WinerPlayer wp3 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp3);
				mainMenu();
				break;
				case 8:	newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7]);
					
				String msg4 = newGame.printBoard();
				System.out.println(msg4);
				int amount4 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount4,newGame);
				nickName = br.readLine();
				WinerPlayer wp4 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp4);
				mainMenu();
				break;
				case 9: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8]);
					
				String msg5 = newGame.printBoard();
				System.out.println(msg5);
				int amount5 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount5,newGame);
				nickName = br.readLine();
				WinerPlayer wp5 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp5);
				mainMenu();
				break;
				case 10: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9]);
				
				
				String msg6 = newGame.printBoard();
				System.out.println(msg6);
				int amount6 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount6,newGame);
				nickName = br.readLine();
				WinerPlayer wp6 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp6);
				mainMenu();
				break;
				
				case 11: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10]);
				
				String msg7 = newGame.printBoard();
				System.out.println(msg7);
				int amount7 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount7,newGame);
				nickName = br.readLine();
				WinerPlayer wp67 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp67);
				mainMenu();
				
				break;
				case 12: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11]);
				
				String msg8 = newGame.printBoard();
				System.out.println(msg8);
				int amount8 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount8,newGame);
				nickName = br.readLine();
				WinerPlayer wp8 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp8);
				mainMenu();
				
				break;
				case 13: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11],parts[12]);
				
				String msg9 = newGame.printBoard();
				System.out.println(msg9);
				int amount9 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount9,newGame);
				nickName = br.readLine();
				WinerPlayer wp9 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp9);
				mainMenu();
				
				break;
				case 14: newGame =new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),parts[4],parts[5],parts[6],parts[7],parts[8],parts[9],parts[10],parts[11],parts[12],parts[13]);
				
				String msg10 = newGame.printBoard();
				System.out.println(msg10);
				int amount10 = newGame.currentAmountPlayer();
				System.out.println("Game Begins");
				keepPlaying(1,amount10,newGame);
				nickName = br.readLine();
				WinerPlayer wp10 = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp10);
				mainMenu();
				
				break;
				}
				}
		bw.close();
	}
	public static void keepPlaying(int player,int amountPlayer, Game newGame) throws IOException {
		
		if(newGame.getFinished()==false) {
		
		if(player<=amountPlayer) {
			
			
			String line = br.readLine();
			
			if(line.equals("")) {

				System.out.println(newGame.movePlayers(player));
				System.out.println(newGame.printCurrentBoard());
				keepPlaying(player+1, amountPlayer, newGame);
				
				mainMenu();
			}else if(line.equals("simul")) {
				
				keepPlayinAuto(player, amountPlayer, newGame);
				
			}else if(line.equals("menu")) {
				
				showMenu();
			}else if(line.equals("num")) {
				
				System.out.println(newGame.printJustBoard());
				br.readLine();
				System.out.println(newGame.printCurrentBoard());
				keepPlaying(player, amountPlayer, newGame);
			}
		}else{
			keepPlaying(1, amountPlayer, newGame);
			
		}
		}{
			System.out.println("Insert nickName for the winner Player");
			String nickName = br.readLine();
			WinerPlayer wp = newGame.createWinnerPlayer(nickName);
			ss.addWinnerPlayer(wp);	
			
		}
	}
	public static void keepPlayinAuto(int player, int amountPlayer,Game newGame) throws IOException {
		
		if(newGame.getFinished()==false) {
			
			if(player<=amountPlayer) {
				System.out.println("Es el turno del jugador numero: " + player);
				
					System.out.println("El jugador esta en: "+newGame.playerInPosition(player).getPos().getPos());
					System.out.println(newGame.movePlayers(player));
					System.out.println(newGame.printCurrentBoard());
					keepPlayinAuto(player+1, amountPlayer, newGame);
					mainMenu();
				
			}else{
				keepPlayinAuto(1, amountPlayer, newGame);
				
			}
			}else {
				
				System.out.println("Insert nickName for the winner Player");
				String nickName = br.readLine();
				WinerPlayer wp = newGame.createWinnerPlayer(nickName);
				ss.addWinnerPlayer(wp);	
			
			}
	}
	
	public static void watchScores() throws IOException {
		
		String msg = " ";
		
		try {
			msg = ss.showScores();
			System.out.println(msg);
			mainMenu();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
