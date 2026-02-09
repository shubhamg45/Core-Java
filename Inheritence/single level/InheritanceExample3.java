class Course {
    private String courseName;
    private String instructor;
    private int duration; // in months
    private double fees;

    // Constructor
    Course(String courseName, String instructor, int duration, double fees) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
        this.fees = fees;
    }

    public void getCourseInfo() {
        System.out.println("\n--- Course Information ---");
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor : " + instructor);
        System.out.println("Duration : " + duration + " months");
        System.out.println("Fees : rs" + fees);
    }
}

class OnlineCourse extends Course {
    private String platform;
    private String videoLink;
    private boolean certificateAvailable;

    // Constructor
    OnlineCourse(String courseName, String instructor, int duration, double fees,
                 String platform, String videoLink, boolean certificateAvailable) {

        super(courseName, instructor, duration, fees);
        this.platform = platform;
        this.videoLink = videoLink;
        this.certificateAvailable = certificateAvailable;
    }

    public void getOnlineCourseInfo() {
        System.out.println("\n--- Online Course Details ---");
        System.out.println("Platform : " + platform);
        System.out.println("Video Link : " + videoLink);
        System.out.println("Certificate Available : " + (certificateAvailable ? "Yes" : "No"));
    }
}

class InheritanceExample3 {
    public static void main(String[] args) {
        OnlineCourse obj = new OnlineCourse( "Java Full Stack Development","Ramesh Kumar ",8,4999,"Udemy","www.udemy.com/javafullstack",true);

        obj.getCourseInfo();         
        obj.getOnlineCourseInfo();   
    }
}
