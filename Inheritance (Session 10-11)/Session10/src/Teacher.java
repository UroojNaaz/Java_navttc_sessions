import java.util.Arrays;
public class Teacher extends Person{
    private int numCourses;
    private String Courses[];
    Teacher(String name,String address)
    {
        super(name,address);
        numCourses = 0;
        Courses = new String[5];
    }
    public void addcourse(String course)
    {
        Courses[numCourses] = course;
        ++numCourses;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+"Teacher{" +
                "numCourses=" + numCourses +
                ", Courses=" + Arrays.toString(Courses) +
                '}';
    }
}
