import java.util.ArrayList;

public class List {
	private ArrayList<Employee> lists;
	
	public List() {
		lists = new ArrayList<>();
	}
	
	public void addList(Employee list) {
		lists.add(list);
	}
	
	public int getSize() {
		return lists.size();
	}
	
	public void getList() {
		int counter = 1;
		int max = 0;
		String nama = null;
		for(Employee e : lists) {
			System.out.println(counter++ + ". " + e.getName() + "-" + e.getEmail());
			if(max < e.getName().length()) {
				max = e.getName().length();
				nama = e.getName();
			}
		}
		
		System.out.println("Total employees: " + counter--);
		System.out.println("Longest name: " + nama.toUpperCase() + " (" + max + " characters)");
	}
}
