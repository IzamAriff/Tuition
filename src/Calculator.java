import java.util.ArrayList;

public class Calculator {
    
    private ArrayList<Mark> marks;
    private Student student;
    private float average;
    private double stdev;
    private float maximum;
    private float minimum;

    public Calculator(float average, float stdev, float maximum, float minimum) {
        this.average = average;
        this.stdev = stdev;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Calculator(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    public Calculator(Student student) {
        this.marks = student.getMarks();
    }

    public void calcStatistics(Student student, ArrayList<Mark> marks) {

        
        this.average = 0.0f;
    
        for (int i = 0; i < marks.size(); i++) {
            this.average += student.getMark(i).getStudMark() ;
        }
        this.average /= marks.size();
    
        this.stdev = 0.0d;
    
        for (int i = 0; i < marks.size(); i++) {
            this.stdev += ((student.getMark(i).getStudMark() - this.average) * (student.getMark(i).getStudMark() - this.average));
        }
        this.stdev = Math.sqrt(this.stdev / marks.size());
    
        this.maximum = marks.get(0).getStudMark();
        this.minimum = marks.get(0).getStudMark();
        ;
    
        for (int i = 0; i < marks.size(); i++) {
            if (student.getMark(i).getStudMark() < this.minimum) this.minimum = student.getMark(i).getStudMark();
            if (student.getMark(i).getStudMark() > this.maximum) this.maximum = student.getMark(i).getStudMark();
        }
    }
    

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public double getStdev() {
        return stdev;
    }

    public void setStdev(double stdev) {
        this.stdev = stdev;
    }

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public float getMinimum() {
        return minimum;
    }

    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }

}
