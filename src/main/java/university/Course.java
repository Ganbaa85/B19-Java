package university;

public class Course {
    public Course(String courseName, String instructorName, int duration) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private String courseName;
    private String instructorName;
    private int duration;

    @Override
    public String toString() {
        return courseName + " and instructor is " + instructorName + " and duration is " + duration;
    }
}

