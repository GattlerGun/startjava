public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.sex = "Мужской";
		wolf1.name = "Ричард";
		wolf1.weight = 13.2;
		wolf1.age = 10;
		wolf1.color = "Серый";
		System.out.println("Пол: " + wolf1.sex +
				"\nКличка: " + wolf1.name +
				"\nВес: " + wolf1.weight +
				"\nВозраст: " + wolf1.age +
				"\nЦвет: " + wolf1.color);
		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
		wolf1.hunt();
	}
}