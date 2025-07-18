public class Teacher {
    //Attributes
    private String teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //Constructor
    public Teacher(String teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        //Initializing attributes with provided values
        this.teacherId = teacherId;
        this.teacherName =teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //Accessor methods
    public String getTeacherId() {
        return teacherId;
    }
     public String getTeacherName() {
        return teacherName;
    }
     public String getAddress() {
        return address;
    }
     public String getWorkingType() {
        return workingType;
    }
     public String getEmploymentStatus() {
        return  employmentStatus;
    }
     public int getWorkingHours() {
        return workingHours;
    }
    
    //Method to set working hours
    public void setWorkingHours(int hours)
    {
        workingHours = hours;
    }
    
    //Display method
    public void display() {
        System.out.println("Teacher Id:" + teacherId);
        System.out.println("Teacher Name:" + teacherName);
        System.out.println("Address:" + address);
        System.out.println("Working Type:" + workingType);
        System.out.println("Employment Status:" + employmentStatus);
        
         if(workingHours > 0){
             System.out.println("Working Hours:" + workingHours);
            } else{
        System.out.println("Working Hours:Not assigned");
        }
      }
    // Example usage
    public static void main(String[] args) {
        Teacher t1 = new Teacher("T111", "Cindy Kimberly", "Butwal", "Full-time", "Employeed");
        t1.setWorkingHours(40);
        t1.display();
    }
}

