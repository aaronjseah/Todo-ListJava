// PUSHHHHHHHHHHHHHH
public class Driver {
	
	Task task;
	ToDoList list = new ToDoList();
	public static void main(String[] args) {
		Driver d = new Driver();
		d.userMenu();
	}
	
	public void userMenu() {
		System.out.println("===============================");
		System.out.println("1. Add Task");
		System.out.println("2. Remove Task");
		System.out.println("3. Edit Task");
		System.out.println("4. View Task");
		int option = Keyboard.readInt("Enter option:");
		userInput(option);
	}
	
	public void userInput(int option) {

		switch(option) {
			case 1: {
				String desc = Keyboard.readString("Enter Task Description: ");
				String completed = Keyboard.readString("Is Task completed? (Y/N): ");
				
				if(completed.equalsIgnoreCase("Y"))
					task = new Task(desc, true);
				else
					task = new Task(desc, false);
				
				list.addTask(task);	
			}
			case 2: {
				String desc = Keyboard.readString("Enter Task Description: ");
				list.removeTask(desc);
			}
			case 3: {
				String desc = Keyboard.readString("Enter Task Description: ");
				
				list.removeTask(desc);
			}
		}
	}
}
