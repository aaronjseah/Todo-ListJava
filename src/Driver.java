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
		System.out.println("5. Exit");
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
			break;
			case 2: {
				String desc = Keyboard.readString("Enter Task Description: ");
				list.removeTask(desc);
			}
			break;
			case 3: {
				String desc = Keyboard.readString("Enter Task Description you wish to edit: ");
				
				list.removeTask(desc);
			}
			break;
			case 4: {
				list.getAllTasks();
			}
			case 5: {
				System.exit(1);
			}
		}
	}
}
