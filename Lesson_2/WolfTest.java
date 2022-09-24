public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.setSex("Мужской");
		wolf1.setName("Ричард");
		wolf1.setWeight(13.2);
		wolf1.setAge(10);
		wolf1.setColor("Серый");
		System.out.println("Пол: " + wolf1.getSex());
		System.out.println("Кличка: " + wolf1.getName());
		System.out.println("Вес: " + wolf1.getWeight());
		System.out.println("Возраст: " + wolf1.getAge());
		System.out.println("Цвет: " + wolf1.getColor());
		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
		wolf1.hunt();
		wolf1.getAge();
	}
}