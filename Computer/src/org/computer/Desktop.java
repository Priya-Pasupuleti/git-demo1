package org.computer;

public class Desktop extends ComputerModel{
 
	private void desktopSize() {
    System.out.println("Desktop size is 28'");
}
	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize();
	}
}
