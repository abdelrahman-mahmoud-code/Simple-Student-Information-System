package JavaTraining5.StudentInformationSystem;

public class Student {
    private String name;
    private int id;
    private double gpa;
    private String degree;
    
    Student(String name, int id, double gpa, String degree){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.degree = degree;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDegree() {
        return degree;
    }

    
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
