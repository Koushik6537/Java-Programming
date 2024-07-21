import java.util.*;

public class ToDoList{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        System.out.println("!!!!!----------TO DO LIST----------!!!!!\n");

        while(true){
            System.out.println("\nOptions available are:\n1-Add a task.\n2-Remove a task.\n3-View tasks.\n4-Exit.");
            System.out.print("Enter your choice (1/2/3/4):");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch(operation){
                case 1:
                    System.out.println("Enter your task: \n");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Your task is successfully added into the tasks list.\n");
                    break;
                case 2:
                    if(toDoList.isEmpty()){
                        System.out.println("Your task list is empty.");
                        break;
                    }else{
                        System.out.println("Your Tasks list is as follows:");

                        for(int i=0;i<toDoList.size();i++){
                            System.out.println((i+1) + "-" + toDoList.get(i));
                        }

                        System.out.println("Enter the task number you want to remove: \n");
                        int itemNumber = scanner.nextInt();

                        if(itemNumber >= 1 && itemNumber <= toDoList.size()){
                            String removedTask = toDoList.remove(itemNumber-1);
                            System.out.println("Your task /'"+removedTask+"/' is removed successfully.\n");
                            break;
                        }else{
                            System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case 3:
                    if(toDoList.isEmpty()){
                        System.out.println("Your task list is empty. Please add a task.\n");
                        break;
                    }else{
                        System.out.println("Your Tasks list is as follows:");
                        for(int i=0;i<toDoList.size();i++){
                            System.out.println((i+1) + "-" + toDoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting.....");
                    System.out.println("Exiting from the To Do List......");
					System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice.");
            }
        }
    }
}