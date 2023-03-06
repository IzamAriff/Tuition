import java.util.*;

public class Centre {
    
    //private attribute
    private String name;
    private String registrationNum;
    private int yearOfServices;

    //function var
    private Scanner input;
    
    //private class attribute
    private ArrayList<HeadMaster> headmaster;
    
    //constructor
    public Centre (String name, String registrationNum, int yearOfServices) {
        this.name = name;
        this.registrationNum = registrationNum;
        this.yearOfServices = yearOfServices;
        
        input = new Scanner(System.in);
        this.headmaster = new ArrayList<>();
    }

    //setter and getter
    public void setInput(Scanner input) {
        this.input = input;
    }

    public Scanner getInput() {
        return input;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public int getYearOfServices() {
        return yearOfServices;
    }

    public void setYearOfServices(int yearOfServices) {
        this.yearOfServices = yearOfServices;
    }

    public void setHeadMaster(ArrayList<HeadMaster> headmaster) {
        this.headmaster = headmaster;
    }
    
    public HeadMaster getHeadMaster(int index) {
        return headmaster.get(index);
    }

    public int getHeadMaster() {
        return headmaster.size();
    }

    public int newgetHeadMaster() {
        return headmaster.size()-1;
    }
    
    //method 
    public void addHeadMaster() {

        static {

        System.out.print("\n\tHeadmaster's Name : "); String name = input.nextLine();
        System.out.print("\tHeadmaster's year in experience : "); int yearExp = input.nextInt(); input.nextLine();
        System.out.print("\tHeadmaster's date joining : "); String datejoin = input.nextLine();
        System.out.print("\tHeadmaster's year in centre : "); int yearInCentre = input.nextInt(); input.nextLine();
        
        headmaster.add(new HeadMaster(name, yearExp, datejoin, yearInCentre));

        }
        
    }  

    public void deleteHeadMaster(int headMasterIndex) {

        if (headMasterIndex < 0 || headMasterIndex >= headmaster.size()) {
            System.out.println("Invalid index.");
            return;
        }
        
        headmaster.remove(headMasterIndex);
    }

    public void deleteTutor(int headMasterIndex, int tutorIndex) {

        //ArrayList<Centre> centre = new ArrayList<>();
        
        //HeadMaster headMaster = centre.get(0).getHeadMaster(headMasterIndex);
        
        centre.get(0).getHeadMaster(headMasterIndex).deleteTutor(tutorIndex);

    }

    public void deleteStudent(int headMasterIndex, int tutorIndex, int studentIndex) {

        ArrayList<Centre> centre = new ArrayList<>();
        
        HeadMaster headMaster = centre.get(0).getHeadMaster(headMasterIndex);
        
        Tutor tutor = headMaster.getTutor(tutorIndex);
        
        tutor.deleteStudent(studentIndex);
    }
    

    
    
}