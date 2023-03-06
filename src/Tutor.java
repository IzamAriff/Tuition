// each tutor (name, IC,  address, qualification, # yearexp, date joined, # years in the center etc)

import java.util.*;

public class Tutor {
    
    //private attributes
    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int yearExp;
    private String datejoin;
    private int yearInCentre;
    
    //function var
    private Scanner input;
    
    //private classes attrubute
    private ArrayList<Student> student;
    
    //constructor
    public Tutor(String name, String ic, String address, String qualification, int yearExp, String datejoin, int yearInCentre) {
        //private connector
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearExp = yearExp;
        this.datejoin = datejoin;
        this.yearInCentre = yearInCentre;
        
        //
        input = new Scanner(System.in);
        this.student = new ArrayList<>();
        
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
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public String getQualification() {
        return qualification;
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

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }
    
    public Student getStudent(int index) {
        return student.get(index);
    }

    public int getStudent() {
        return student.size();
    }
    
    public void addStudent() {
        
        System.out.print("\n\tStudent's Name : "); String name = input.nextLine();
        System.out.print("\tStudent's IC number : "); String ic = input.nextLine();
        System.out.print("\tStudent's address : "); String address = input.nextLine();
        System.out.print("\tStudent's current year : "); int year = input.nextInt(); input.nextLine();
        
        student.add(new Student(name, ic, address, year));
    }

    public void deleteStudent(int studentIndex) {

        if (studentIndex < 0 || studentIndex >= student.size()) {
            System.out.println("Invalid index.");
            return;
        }
        student.remove(studentIndex);
    }

    public void addTutor() {
    } 
}
