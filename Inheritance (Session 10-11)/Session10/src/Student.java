import java.util.Arrays;

public class Student extends Person{
    private int numCourses, Marks[];
    private String Course[];

    Student(String name,String address)
    {
        super(name,address);
        numCourses=0;
        Marks = new int[5];
        Course = new String[5];
    }
    public void addcoursemark(String course,int mark)
    {
        Course[numCourses] = course;
        Marks[numCourses] = mark;
        ++numCourses;
    }
    public String PrintMark()
    {
        return Arrays.toString(Marks);
    }
    public double getAverageMarks()
    {
        int sum = 0;
        for(int m:Marks)
        {
            sum+=m;
        }
        return sum/(numCourses+1);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Student{" +
                "numCourses=" + numCourses +
                ",\n Marks=" + Arrays.toString(Marks) +
                ",\n Course=" + Arrays.toString(Course) +"" +
                ", Average Marks=" + this.getAverageMarks() +
                '}';
    }
}
