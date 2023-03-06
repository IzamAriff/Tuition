
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<Centre> centre = new ArrayList<>();
		
        // create a new centre
        System.out.print("Name of centre: "); String name = input.nextLine();
        System.out.print("Registration number: "); String registrationNum = input.nextLine();
        System.out.print("Year of Service: "); int yearOfServices = input.nextInt(); input.nextLine();
        
        centre.add(new Centre(name, registrationNum, yearOfServices));
		
        // get input for the headmasters, that acts as a leader in a certain subject
        System.out.print("\n\nEnter number of headmasters : "); int numHeadmasters = input.nextInt(); input.nextLine();
           
        for (int i = 0; i < numHeadmasters; i++) {

            System.out.println("\nEnter details of headmaster #" + (i+1));

            centre.get(0).addHeadMaster();

            System.out.print("\n\nEnter number of tutors for headmaster #" + (i+1) + " : "); int numTutors = input.nextInt(); input.nextLine();
           
            for (int j = 0; j < numTutors; j++) {

                System.out.println("\nEnter details of tutor #" + (j+1) + " for the headmaster #" + (i+1) + ": ");
                
			    HeadMaster headmaster = centre.get(0).getHeadMaster(i);
			    headmaster.addTutor();
                // get input for students
                System.out.print("\n\nEnter number of students for tutor #" + (j+1) + " for headmaster #" + (i+1) + ": "); int numStudents = input.nextInt(); input.nextLine();
               
                for (int k = 0; k < numStudents; k++) {

                    System.out.println("\nEnter details of student #" + (k+1) + " for tutor #" + (j+1) + " for headmaster #" + (i+1) + ": ");

                    Tutor tutor = centre.get(0).getHeadMaster(i).getTutor(j);
                    tutor.addStudent();
    
                    for (int l = 0; l < 1; l++) {

                    Student student = centre.get(0).getHeadMaster(i).getTutor(j).getStudent(k);
                    student.addMark();

                    }
                }
            }
        }

        PrintDetails detailsPrinter = new PrintDetails(centre);
        detailsPrinter.printDetails();

        boolean validInput = false;

        char character = ' ';

        while (!validInput) {
            System.out.print("\nDo you want to continue adding data? (Y-delete/A-adding object/N-exit): ");
            character = input.next().charAt(0);

            if (character == 'Y' || character == 'A' || character == 'N' || character == 'y' || character == 'a' || character == 'n') {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter Y, A, or N.");
            }
        }

        while (character != 'N' || character != 'n') {

            while(character == 'Y' || character == 'y') {

                System.out.println("\n\n\n----------------------------Section below for deleting data purposes---------------------------------\n\n");

                // Prompt the user to choose what to delete
                System.out.println("\nWhat would you like to delete?");
                System.out.println("1. Headmaster");
                System.out.println("2. Tutor");
                System.out.println("3. Student");
                System.out.print("Enter your choice: "); int choice = input.nextInt(); input.nextLine();
                    
                switch (choice) {

                    case 1:

                        try {
                            System.out.print("Enter the index of the headmaster you want to delete: "); int headMasterIndex = input.nextInt(); input.nextLine();

                            centre.get(0).deleteHeadMaster(headMasterIndex);

                        }   catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index entered. Please try again.");
                        }   
                        break;

                    case 2:

                        try {
                            System.out.print("Enter the index of the headmaster: "); int headMasterIndex = input.nextInt(); input.nextLine();
                                
                            System.out.print("Enter the index of the tutor you want to delete: "); int tutorIndex = input.nextInt(); input.nextLine();
                                
                            centre.get(0).deleteTutor(headMasterIndex, tutorIndex);

                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index entered. Please try again.");
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Enter the index of the headmaster: "); int headMasterIndex = input.nextInt(); input.nextLine();
                                
                            System.out.print("Enter the index of the tutor: "); int tutorIndex = input.nextInt(); input.nextLine();
                                
                            System.out.print("Enter the index of the student you want to delete: "); int studentIndex = input.nextInt(); input.nextLine();
                                
                            centre.get(0).deleteStudent(headMasterIndex, tutorIndex, studentIndex);

                        }   catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index entered. Please try again.");
                        }   
                        break;


                    default:

                    System.out.println("Invalid choice. Please try again.");
                }
                
                detailsPrinter.printDetails();

                validInput = false;

                while (!validInput) {
                    System.out.print("\nDo you want to continue adding data? (Y-delete/A-adding object/N-exit): ");
                    character = input.next().charAt(0);

                    if (character == 'Y' || character == 'A' || character == 'N' || character == 'y' || character == 'a' || character == 'n') {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter Y, A, or N.");
                    }
                }
            }

            while (character == 'A' || character == 'a' ) {

                System.out.println("\n\n\n----------------------------Section below for adding data purposes---------------------------------\n\n");

                 // Prompt the user to choose what to add
                System.out.println("\nWhat would you like to add ?");
                System.out.println("1. Headmaster");
                System.out.println("2. Tutor");
                System.out.println("3. Student");
                System.out.print("Enter your choice: "); int choice = input.nextInt(); input.nextLine();

                switch (choice) {

                    case 1:

                        centre.get(0).addHeadMaster();

                        break;

                    case 2:

                        try {
                            System.out.print("Enter the index of the headmaster where you want to add the tutor: "); int headMasterIndex = input.nextInt(); input.nextLine();

                            centre.get(0).getHeadMaster(headMasterIndex).addTutor();

                        }   catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index entered. Please try again.");
                        }
                        break;

                    case 3:

                        try {
                            System.out.print("Enter the index of the headmaster where you want to add the student: "); int headMasterIndex = input.nextInt(); input.nextLine();
                            System.out.print("Enter the index of the tutor where you want to add the student: "); int tutorIndex = input.nextInt(); input.nextLine();

                            centre.get(0).getHeadMaster(headMasterIndex).getTutor(tutorIndex).addStudent();

                            int studentIndex = (centre.get(0).getHeadMaster(headMasterIndex).getTutor(tutorIndex).getStudent())-1;
                            centre.get(0).getHeadMaster(headMasterIndex).getTutor(tutorIndex).getStudent(studentIndex).addMark();

                        }   catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index entered. Please try again.");
                        } 
                        break;

                    default:

                }

                detailsPrinter.printDetails();

                validInput = false;

                while (!validInput) {
                    System.out.print("\nDo you want to continue adding data? (Y-delete/A-adding object/N-exit): ");
                    character = input.next().charAt(0);

                    if (character == 'Y' || character == 'A' || character == 'N' || character == 'y' || character == 'a' || character == 'n') {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter Y, A, or N.");
                    }
                }
            }
            if (character == 'N' || character == 'n') break;
        }
        input.close();
    }
}
