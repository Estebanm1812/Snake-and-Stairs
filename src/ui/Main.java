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
	
	public static void main(String[]args) {
	
	int choose = -1;
	try {
		bw.write("Welcome to Snakes and Ladders, Please choose an Option\n");
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	
	
	if(choose<0 || choose>3) {
		try {
			choose = showMenu();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		switch(choose) {
		
		case 1: actionsMenu.startANewGame();
		break;
		
		case 2: actionsMenu.watchScores();
		break;
		
		case 3:
		break;
		
		}
	}
	}
	public static int showMenu() throws IOException {
		
		int choose = 0;
		
		bw.write("(1) To Play a new Game\n" + "(2) To see the Winners`s scores \n" + "(3)To exit the Game");
		choose = Integer.parseInt(br.readLine());
		
		return choose;
	}
}
