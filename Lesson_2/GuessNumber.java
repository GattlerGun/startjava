import java.util.Scanner;

public class GuessNumber {

	private Scanner scan = new Scanner(System.in);
	private int compNum;
	private int player1Guess;
	private int player2Guess;
	private String player1Name;
	private String player2Name;

	public void startGame(int compNum, String player1Name, String player2Name) {
		do {
			System.out.println(player1Name + " введите ваше число: ");
			player1Guess = scan.nextInt();
			if(player1Guess < compNum) {
				System.out.println("Загаданное число больше чем число " + player1Name);
			} else if(player1Guess > compNum) {
				System.out.println("Загаданное число меньше чем число " + player1Name);
			} else {
				System.out.println(player1Name +" вы победили! Это было число: " + compNum);
				break;
			}
			System.out.println(player2Name + " введите ваше число: ");
			player2Guess = scan.nextInt();
			if(player2Guess < compNum) {
				System.out.println("Загаданное число больше чем число " + player2Name);
			} else if(player2Guess > compNum) {
				System.out.println("Загаданное число меньше чем число " + player2Name);
			} else {
				System.out.println(player2Name +" вы победили! Это было число: " + compNum);
				break;
			}
		} while(true);
	}
}