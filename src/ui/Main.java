package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static Menu actionsMenu = new Menu();
	
	
	public static void main(String[]args) throws IOException {
	bw.write("\n");
	bw.write("Starting Applicacion\n");
	bw.write("Welcome to Snakes and Ladders, Please choose an Option\n");
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
		bw.write("Write the number of column, rows, snakes, ladders and players like one of the next two examples: \n" +
		"4, 5, 2, 2, 3 \n" + "4,5,2,2,*,!,$");
		String [] parts = br.readLine().split(",");
		if(parts.length == 5) {
			actionsMenu.startANewGame(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),Integer.parseInt(parts[4]));
		}
		
		break;
		
		case 2: actionsMenu.watchScores();
		break;
		
		case 3:
		break;
		}
		}
		bw.close();
		br.close();
	}
	public static int showMenu() throws IOException {
		
		int choose = 0;
		
		bw.write("(1) To Play a new Game\n" + "(2) To see the Winners`s scores \n" + "(3)To exit the Game\n");
		choose = Integer.parseInt(br.readLine());
		
		return choose;
	}
}
