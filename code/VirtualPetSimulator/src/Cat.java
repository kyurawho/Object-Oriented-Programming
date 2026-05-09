
public class Cat extends Pet implements Groomable{

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void groom() {
		// TODO Auto-generated method stub
		System.out.println("Grooming...");
		
		int h = randomGenerator.random(30, 40);
		energy -= h;
		System.out.println("Energy -" + h);
		
		h = randomGenerator.random(20, 30);
		hunger -= h;
		System.out.println("Hunger -" + h);
				
		h = randomGenerator.random(10, 20);
		skill += h;
		System.out.println("Skill +" + h);
	}
	
	public void menu() {
		System.out.println("--Pet Cat--");
		this.petInfo();
		System.out.println("1. Feed");
		System.out.println("2. Groom");
		System.out.println("3. Sleep");
	}
	
	public void action(int choice) {
		if(choice == 1) {
			this.feed();
		}else if(choice == 2) {
			this.groom();
		}else if(choice == 3){
			this.sleep();
		}
	}
}
