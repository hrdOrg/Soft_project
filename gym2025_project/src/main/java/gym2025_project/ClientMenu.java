package gym2025_project;
import java.util.Scanner;
public class ClientMenu {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        client client = new client(); // Create an instance of the client class

	        int choice;
	     // Display the menu
            System.out.println("\n=== Client Menu ===");
            System.out.println("1. Set Name");
            System.out.println("2. Get Name");
            System.out.println("3. Set Age");
            System.out.println("4. Get Age");
            System.out.println("5. Set Gender");
            System.out.println("6. Get Gender");
            System.out.println("7. Set Height");
            System.out.println("8. Get Height");
            System.out.println("9. Set Weight");
            System.out.println("10. Get Weight");
            System.out.println("11. Add Fitness Goal");
            System.out.println("12. View Fitness Goal");
            System.out.println("13. Delete Fitness Goal");
            System.out.println("14. Add Dietary Preference");
            System.out.println("15. View Dietary Preference");
            System.out.println("16. Delete Dietary Preference");
            System.out.println("17. Add Achievement");
            System.out.println("18. View Achievements");
            System.out.println("19. Delete Achievement");
            System.out.println("20. Calculate BMI");
            System.out.println("21. Exit");
            System.out.print("Enter your choice: ");

	        do {
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    client.setName(name);
	                    System.out.println("Name set successfully.");
	                    break;
	                case 2:
	                	System.out.println("Name is:"+ client.getName());
	                	break;
	                case 3:
	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    client.setAge(age);
	                    System.out.println("Age set successfully.");
	                    break;
	                case 4:
	                	System.out.println("Age is:"+client.getAge());
	                	break;
	                case 5:
	                    System.out.print("Enter Gender: ");
	                    String gender = scanner.next();
	                    client.setGender(gender);
	                    System.out.println("Gender set successfully.");
	                    break;
	                case 6:
	                	System.out.println("Gender is:"+client.getGender());
	                	break;
	                case 7:
	                    System.out.print("Enter Height: ");
	                    double height = scanner.nextDouble();
	                    client.setHight(height);
	                    System.out.println("Height set successfully.");
	                    break;
	                case 8:
	                	System.out.println("Height is:"+client.getHeight());
	                	break;
	                case 9:
	                    System.out.print("Enter Weight: ");
	                    double weight = scanner.nextDouble();
	                    client.setWeight(weight);
	                    System.out.println("Weight set successfully.");
	                    break;
	                case 10:
	                	System.out.println("Weight is:"+client.getWeight());	
	                	break;
	                case 11:
	                    System.out.print("Enter Fitness Goal: ");
	                    String fitnessGoal = scanner.nextLine();
	                    client.addFittnessGoals(fitnessGoal);
	                    break;
	                case 12:
	                	System.out.println("Fittness Goals:"+client.getFittnessGoals());
	                	break;
	                case 13:
	                    System.out.print("Enter Fitness Goal to Delete: ");
	                    String goalToDelete = scanner.nextLine();
	                    client.deleteFittnessGoals(goalToDelete);
	                    break;
	                case 14:
	                    System.out.print("Enter Dietary Preference: ");
	                    String dietary = scanner.nextLine();
	                    client.addDietary(dietary);
	                    break;
	                case 15:
	                	System.out.println("Dietary Preference: "+client.getDietary());
	                	break;
	                case 16:
	                    System.out.print("Enter Dietary Preference to Delete: ");
	                    String dietaryToDelete = scanner.nextLine();
	                    client.deleteDietary(dietaryToDelete);
	                    break;
	                case 17:
	                    System.out.print("Enter Achievement: ");
	                    String achievement = scanner.nextLine();
	                    client.addAchievements(achievement);
	                    break;
	                case 18:
	                    System.out.println("Achievements: " + client.getAchievements());
	                    break;
	                case 19:
	                    System.out.print("Enter Achievement to Delete: ");
	                    String achievementToDelete = scanner.nextLine();
	                    client.delAchievements(achievementToDelete);
	                    break;
	                case 20:
	                    client.calBMI();
	                    System.out.println("Your BMI: " + client.getBMI());
	                    break;
	                case 21:
	                    System.out.println("Exiting the menu. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 21);

	        scanner.close();
	    }

	}


