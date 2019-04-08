package abstractProj;

public class Lady {
	
	private String name;
	private Animal animal;
	
	public Lady() {
		
	}
	
	
	public Lady(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	};
	
	
	public void play() {
		if(animal instanceof Dog) {
			System.out.print(this.name+"逗小狗"+animal.getName()+",");
			animal.enjoy();
			Dog d=(Dog)animal;
			System.out.println(d.getFurColor());
		}else if(animal instanceof Cat) {
			System.out.print(this.name+"逗小猫"+animal.getName()+",");
			animal.enjoy();
			Cat c=(Cat)animal;
			System.out.println(c.getEyeColor());
		}
	}
	
	

}
