package creational.builder;

public class Mobile {

	private String brand;
	private Double price;
	private int megapixel;
	private int ram;
	private int memory;	

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", megapixel=" + megapixel + ", ram=" + ram + ", memory="
				+ memory + "]";
	}	

	private Mobile(MobileBuilder builder) {
		this.brand = builder.brand;
		this.memory = builder.memory;
		this.price = builder.price;
		this.ram = builder.ram;
		this.megapixel = builder.megapixel;
	}

	//Getters for Mobile
	public String getBrand() {
		return brand;
	}

	public Double getPrice() {
		return price;
	}

	public int getMegapixel() {
		return megapixel;
	}

	public int getRam() {
		return ram;
	}

	public int getMemory() {
		return memory;
	}

	static class MobileBuilder {

		private String brand;
		private Double price;
		private int megapixel;
		private int ram;
		private int memory;

		public MobileBuilder() {

		}

		public Mobile build() {
			return new Mobile(this);
		}

		public MobileBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public MobileBuilder setPrice(Double price) {
			this.price = price;
			return this;
		}

		public MobileBuilder setMegapixel(int megapixel) {
			this.megapixel = megapixel;
			return this;
		}

		public MobileBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}

		public MobileBuilder setMemory(int memory) {
			this.memory = memory;
			return this;
		}
	}

}