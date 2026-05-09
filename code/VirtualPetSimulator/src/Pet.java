
public abstract class Pet {
	protected int day;
	protected int level;
	protected int skill;
	protected int energy;
	protected int hunger;
	
	public Pet() {
		day = 1;
		level = 1;
		skill = 0;
		energy = 100;
		hunger = 100;
	}
	
	public void feed() {
		System.out.println("Eating...");
		System.out.println("Energy -10");
		hunger += 10;
		energy -= 10;
		if(hunger > 100) {
			System.out.printf("hunger +%d\n", 10 - (hunger - 100));
			hunger = 100;
		}else {
			System.out.println("hunger +10");			
		}
	}
	
	public void sleep() {
		int h = randomGenerator.random(10, 20);
		System.out.println("Sleeping...");
		System.out.println("Recover energy");
		System.out.println("Hunger -" + h);
		energy = 100;
		hunger -= h;
		day += 1;
	}
	
	public boolean isDead() {
		if(hunger <= 0 || energy <= 0) return true;
		return false;
	}
	
	public void isLevelUp() {
		if(skill >= 100) {
			skill -= 100;
			level += 1;
			System.out.println("Level up!");
			System.out.printf("Current Level = %d\n", level);
			System.out.printf("Remaining Skill = %d\n", skill);
		}
	}
	
	public void petInfo() {
		System.out.printf("Day: %d\n", day);
		System.out.printf("Level: %d\n", level);
		System.out.printf("Energy: %d\n", energy);
		System.out.printf("Hunger: %d\n", hunger);
		System.out.printf("Skill: %d\n\n", skill);
	}

	protected abstract void menu();
	protected abstract void action(int choice);
}
