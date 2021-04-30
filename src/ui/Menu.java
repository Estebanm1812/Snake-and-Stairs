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
			
			case 1:startANewGame();
			
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
		
		bw.write("(1) To Play a new Game\n" + "(2) To see the Winners`s scores \n" + "(3)To exit the Game\n");
		choose = Integer.parseInt(br.readLine());
		return choose;
	} 
	
	public static void startANewGame() throws IOException {
		
		Game newGame;
		
		bw.write("Write the number of column, rows, snakes, ladders and players like one of the next two examples: \n" +
				"4, 5, 2, 2, 3 \n" + "4,5,2,2,*,!,$");
				String [] parts = br.readLine().split(",");
				switch(parts.length) {
				case 5: newGame = new Game(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),Integer.parseInt(parts[4]));
					
				break;
				case 6:
					
				break;
				case 7:
				break;
				case 8:
				break;
				case 9:
				break;
				
				}
		
	}
	public static void watchScores() {
		
	}
}
