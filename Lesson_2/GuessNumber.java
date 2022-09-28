import java.util.Scanner;

public class GuessNumber {

	private Scanner scan = new Scanner(System.in);
	private Player player1 = new Player();
	private Player player2 = new Player();
	private int hiddenNum;


	public void start(String player1Name, String player2Name) {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		int hiddenNum = 1 + (int) (Math.random() * 100);
		do {
			System.out.println(player1Name + " введите ваше число: ");
			player1.setNumber(scan.nextInt());
			if(player1.getNumber() < hiddenNum) {
				System.out.println("Загаданное число больше чем число " + player1Name);
			} else if(player1.getNumber() > hiddenNum) {
				System.out.println("Загаданное число меньше чем число " + player1Name);
			} else {
				System.out.println(player1Name +" вы победили! Это было число: " + hiddenNum);
				break;
			}
			System.out.println(player2Name + " введите ваше число: ");
			player2.setNumber(scan.nextInt());
			if(player2.getNumber() < hiddenNum) {
				System.out.println("Загаданное число больше чем число " + player2Name);
			} else if(player2.getNumber() > hiddenNum) {
				System.out.println("Загаданное число меньше чем число " + player2Name);
			} else {
				System.out.println(player2Name +" вы победили! Это было число: " + hiddenNum);
				break;
			}
		} while(true);
	}
}