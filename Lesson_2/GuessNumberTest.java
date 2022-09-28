import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		String playerAnswer = "yes";
		GuessNumber game = new GuessNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Первый игрок введите ник: ");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Второй игрок введите ник: ");
		Player player2 = new Player(scan.nextLine());
		do {
			if(playerAnswer.equals("yes")) {
				game.start(player1.getName(), player2.getName());
			}
			System.out.println("Хотите продолжить игру? [yes/no]:");
			playerAnswer = scan.next();
		} while(!playerAnswer.equals("no"));
		scan.close();
	}
}