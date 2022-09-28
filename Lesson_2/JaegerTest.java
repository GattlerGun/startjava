public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Striker Eureka");
		jaeger1.setMark("Mark-5");
		jaeger1.setOrigin("Australia");
		jaeger1.setHeight(76.2f);
		jaeger1.setWeight(1.850f);
		jaeger1.setStrength(10);
		jaeger1.setArmor(9);
		System.out.println(jaeger1.scanKaiju());
		jaeger1.move();
		System.out.println("Характеристика " + jaeger1.getModelName() +
				":\nПоколение - " + jaeger1.getMark() +
				"\nСтрана - " + jaeger1.getOrigin() +
				"\nРост - " + jaeger1.getHeight() + "м" +
				"\nВес - " + jaeger1.getWeight() + " тонн" +
				"\nСила - " + jaeger1.getStrength() +
				"\nБроня - " + jaeger1.getArmor());

		Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 83.34f,
				2.312f, 7, 4);
		System.out.println("\n" + jaeger2.scanKaiju());
		jaeger2.useVortexCannon();
		System.out.println("Характеристика " + jaeger2.getModelName() +
				":\nПоколение - " + jaeger2.getMark() +
				"\nСтрана - " + jaeger2.getOrigin() +
				"\nРост - " + jaeger2.getHeight() + "м" +
				"\nВес - " + jaeger2.getWeight() + " тонн" +
				"\nСила - " + jaeger2.getStrength() +
				"\nБроня - " + jaeger2.getArmor());

		if(jaeger1.getArmor() == jaeger2.getArmor()) {
			System.out.println("Качество брони одинаковы");
		} else if(jaeger1.getArmor() > jaeger2.getArmor()) {
			System.out.println(jaeger1.getModelName() + " имеет более качественную броню чем " + jaeger2.getModelName());
		} else {
			System.out.println(jaeger1.getModelName() + " имеет менее качественную броню чем " + jaeger2.getModelName());
		}
		if(jaeger1.getStrength() == jaeger2.getStrength()) {
			System.out.println("Силы равны");
		} else if(jaeger1.getStrength() > jaeger2.getStrength()) {
			System.out.println(jaeger1.getModelName() + " сильнее чем " + jaeger2.getModelName());
		} else {
			System.out.println(jaeger1.getModelName() + " слабее чем " + jaeger2.getModelName());
		}
	}
}