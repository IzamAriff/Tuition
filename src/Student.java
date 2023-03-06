// each student (name, IC, address, year, schoolname, list of scores, etc).
import java.util.*;

public class Student {
    
    //private attributes
    private String name;
    private String ic;
    private String address;
    private int year;

    //fx variables
    private Scanner input;

    //private class attributes
    private ArrayList<Mark> marks; 
    private Mark[] mark;
    
    //constructor
    public Student(String name, String ic, String address, int year) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;

        input = new Scanner(System.in);
        this.marks = new ArrayList<>();
        this.mark = marks.toArray(new Mark[marks.size()]);
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
    
    public void setIc(String ic) {
        this.ic = ic;
    }
    
    public String getIc() {
        return ic;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    //get specific index from variable marks
    public Mark getMark(int index) {
        return marks.get(index);
    }

    //get all varible marks 
    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public int getMark() {
        return marks.size();
    }

    public void addMark() {

        System.out.println("\nEnter marks for the 5 test : \n");

        for (int i = 0; i < 5; i++) {
            
            System.out.print("\tMarks : "); int mark = input.nextInt(); input.nextLine();

            marks.add(new Mark(mark));
        }

    }

    public void addStudent() {
      // addStudent are called in the Tutor class.
    }



    
}