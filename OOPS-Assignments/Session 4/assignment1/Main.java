package assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositeMenu menu = new CompositeMenu();
		Scanner sc = new Scanner(System.in);
		menu.setMenuName("Main");
		menu.setParent("");
		menu.generateList(sc);
		menu.actionPerformed(sc);
	}

}
