import java.util.*;
public class PrintDetails {
    
    private ArrayList<Centre> centre;

    public PrintDetails(ArrayList<Centre> centre) {
        this.centre = centre;
    }
    
    public void printDetails() {
        System.out.println("\n\n\n----------------------------------Details are shown as below---------------------------------------\n\n");
        
        for (Centre c : centre) {

            System.out.println("Centre name: " + c.getName());
            System.out.println("Registration number: " + c.getRegistrationNum());
            System.out.println("Year of service: " + c.getYearOfServices());

            for (int i = 0 ; i < c.getHeadMaster(); i++) { 

                HeadMaster hm = c.getHeadMaster(i);

                System.out.println("\n\tHeadmaster name: " + hm.getName());
                System.out.println("\tYear of experience: " + hm.getYearExp());
                System.out.println("\tDate joined: " + hm.getDateJoin());
                System.out.println("\tYear in centre: " + hm.getYearInCentre());

                for (int j = 0 ; j < hm.getTutor() ; j++) {

                    Tutor t = hm.getTutor(j);

                    System.out.println("\n\t\tTutor name: " + t.getName());
                    System.out.println("\t\tIC number: " + t.getIc());
                    System.out.println("\t\tAddress: " + t.getAddress());
                    System.out.println("\t\tQualification: " + t.getQualification());
                    System.out.println("\t\tYear of experience: " + t.getYearExp());
                    System.out.println("\t\tDate joined: " + t.getDateJoin());
                    System.out.println("\t\tYear in centre: " + t.getYearInCentre());

                    for (int k = 0 ; k < t.getStudent() ; k++) {

                        Student s = t.getStudent(k);

                        System.out.println("\n\t\t\tStudent name: " + s.getName());
                        System.out.println("\t\t\tIC number: " + s.getIc());
                        System.out.println("\t\t\tAddress: " + s.getAddress());
                        System.out.println("\t\t\tYear: " + s.getYear());
                        System.out.println("");

                        for (int l = 0 ; l < s.getMark() ; l++) {

                            Mark m = s.getMark(l);

                            System.out.println("\t\t\t\tMark: " + m.getStudMark());
                        }

                        Student student = centre.get(0).getHeadMaster(i).getTutor(j).getStudent(k);
                        Calculator calculator = new Calculator(student.getMarks());

                        calculator.calcStatistics(student, student.getMarks());

                        System.out.println("\n\t\t\t\tAverage: " + calculator.getAverage());
                        System.out.println("\t\t\t\tStandard deviation: " + calculator.getStdev());
                        System.out.println("\t\t\t\tMaximum: " + calculator.getMaximum());
                        System.out.println("\t\t\t\tMinimum: " + calculator.getMinimum());
                    }
                }
            }
        }
    }
}
