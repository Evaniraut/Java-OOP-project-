public class Tutor extends Teacher {
    //Additional attributes
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //Constructor
    public Tutor(String teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, 
    String academicQualifications, int performanceIndex) {
        //Superclass constructor is called
        super(teacherId, teacherName, address, workingType, employmentStatus);
        
        //Additional Attributes are initialized
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    
    //Accessor methods
    public double getSalary() {
        return salary;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getAcademicQualifications() {
        return academicQualifications;
    }
    public int getPerformanceIndex() {
        return performanceIndex;
    }
    public boolean isCertified() {
        return isCertified;
    }
    
    //Method to set salary
    public void setSalary(double salary, int performanceIndex) {
        if (performanceIndex > 5 && getWorkingHours() > 20) {
            double appraisal = 0;
            if (performanceIndex >= 5 && performanceIndex <= 7) {
                appraisal = 0.05;
            } else if (performanceIndex >= 8 && performanceIndex <= 9) {
                appraisal = 0.1;
            } else if (performanceIndex == 10) {
                appraisal = 0.2;
            }
            
            //New salary is calculated
            double newSalary = salary + (appraisal * salary);
            this.salary = newSalary;
            isCertified = true;
        } else {
            System.out.println("Salary cannot be approved yet.");
        }
    }
    
    //Method to remove tutor
    public void removeTutor() {
        if (!isCertified) {
            //Set attribute to default values
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            isCertified = false;
        }
    }
    
    //Display method
    public void display() {
        super.display();
        if (isCertified) {
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}

