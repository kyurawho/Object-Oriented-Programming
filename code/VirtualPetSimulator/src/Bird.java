
public class Bird extends Pet implements Trainable{

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("Training...");
		
		int h = randomGenerator.random(30, 50);
		energy -= h;
		System.out.println("Energy -" + h);
		
		h = randomGenerator.random(20, 50);
		hunger -= h;
		System.out.println("Hunger -" + h);
		
		h = randomGenerator.random(20, 30);
		skill += h;
		System.out.println("Skill +" + h);
	}
	
	public void menu() {
		System.out.println("--Pet Bird--");
		this.petInfo();
		System.out.println("1. Feed");
		System.out.println("2. Train");
		System.out.println("3. Sleep");
	}
	
	public void action(int choice) {
		if(choice == 1) {
			this.feed();
		}else if(choice == 2) {
			this.train();
		}else if(choice == 3){
			this.sleep();
		}
	}
}
