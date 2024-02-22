package creational.builder;

public class MyMain {

	public static void main(String[] args) {

		Mobile myMobile = new Mobile.MobileBuilder()
			.setBrand("Samsung")
			.setPrice(29999.0)
			.setRam(8)
			.setMegapixel(64)
			.setMemory(512)
			.build();
		
		System.out.println(myMobile);
	}

}
