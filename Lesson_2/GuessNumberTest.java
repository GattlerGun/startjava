import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		String playerAnswer = "yes";
		GuessNumber guessnumber = new GuessNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Игра угадай число в интервале (0,100]\n");
		System.out.println("Первый игрок введите ник: ");
		Player player1 = new Player(scan.nextLine());
		String player1Name = player1.getName();
		System.out.println("Второй игрок введите ник: ");
		Player player2 = new Player(scan.nextLine());
		String player2Name = player2.getName();
		do {
			if(playerAnswer.equals("yes")) {
				int compNum = 1 + (int) (Math.random() * 100);
				guessnumber.startGame(compNum, player1Name, player2Name);
			}
			System.out.println("Хотите продолжить игру? [yes/no]:");
			playerAnswer = scan.next();
		} while(!playerAnswer.equals("no"));
		scan.close();
	}
}