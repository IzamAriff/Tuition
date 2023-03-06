import java.util.*;

public class HeadMaster {
    
    //private attributes
    private String name;
    private int yearExp;
    private String datejoin;
    private int yearInCentre;

    //function var
    private Scanner input;
    
    //private classes attrubute
    private ArrayList<Tutor> tutor;
    
    //constructor
    public HeadMaster (String name, int yearExp, String datejoin, int yearInCentre) {
        this.name = name;
        this.yearExp = yearExp;
        this.datejoin = datejoin;
        this.yearInCentre = yearInCentre;
        
        input = new Scanner(System.in);
        this.tutor = new ArrayList<>();
    }
    
    //setter and getter
    
    public void setInput(Scanner input) {
        this.input = input;
    }

    public Scanner getInput() {
        return input;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }
    
    public int getYearExp () {
        return yearExp;
    }
    
    public void setDateJoin(String datejoin) {
        this.datejoin = datejoin;
    }
    
    public String getDateJoin() {
        return datejoin;
    }
    
    public void setYearInCentre (int yearInCentre) {
        this.yearInCentre = yearInCentre;
    } 
    
    public int getYearInCentre () {
        return yearInCentre;
    }

    public void setTutor(ArrayList<Tutor> tutor) {
        this.tutor = tutor;
    } 
    
    public Tutor getTutor(int index) {
        return tutor.get(index);
    }

    public int getTutor() {
        return tutor.size();
    }

    public int newgetTutor() {
        return tutor.size()-1;
    }
    
    //method 
    public void addTutor() {

        System.out.print("\n\tTutor's Name : "); String name = input.nextLine();
        System.out.print("\tTutor's IC number : "); String ic = input.nextLine();
        System.out.print("\tTutor's address : "); String address = input.nextLine();
        System.out.print("\tTutor's qualification : "); String qualification = input.nextLine();
        System.out.print("\tTutor's year in experience : "); int yearExp = input.nextInt(); input.nextLine();
        System.out.print("\tTutor's date joining : "); String datejoin = input.nextLine();
        System.out.print("\tTutor's year in centre : "); int yearInCentre = input.nextInt(); input.nextLine();
        
        tutor.add(new Tutor(name, ic, address, qualification, yearExp, datejoin, yearInCentre));
    }

    public void deleteTutor(int tutorIndex) {

        if (tutorIndex < 0 || tutorIndex >= tutor.size()) {
            System.out.println("Invalid index.");
            return;
        }
        

        tutor.remove(tutorIndex);
    }
    
}