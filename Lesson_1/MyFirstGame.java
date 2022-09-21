public class MyFirstGame {
	
	public static void main(String[] args) {
		System.out.println("Игра - Угадай число\n");
		int computerNum = 1 + (int) (Math.random() * 100);
		int playerNum = 50;
		boolean isTrue = true;
		while(isTrue) {
			if(playerNum == computerNum) {
				System.out.println("Вы победили! Это число " + computerNum);
				isTrue = false;
			} else {
				if(playerNum > computerNum) {
					System.out.println("число " + playerNum + 
							" больше того, что загадал компьютер");
					playerNum--;
				} else if(playerNum < computerNum){
					System.out.println("число " + playerNum + 
							" меньше того, что загадал компьютер");
					playerNum++;
				}
			}
		}
	}
}