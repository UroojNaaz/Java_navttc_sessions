import java.util.Arrays;

public class Student {
    private String Name;
    private String Address;
    private int NumCourses;

    private String[] Courses;
    private int[] Marks;
    private int index;
    Student(String name,String address,int numCourses)
    {
        this.setName(name);
        this.setAddress(address);
        this.setNumCourses(numCourses);
        Courses = new String[getNumCourses()];
        Marks = new int[getNumCourses()];
        index=0;
    }
    public void AddCourseGrade(String course,int marks)
    {
        Courses[index] = course;
        Marks[index] = marks;
        ++index;
    }
    public String getCourses()
    {
        return Arrays.toString(this.Courses);
    }
    public String getMarks()
    {
        return Arrays.toString(this.Marks);
    }
    public double getAverageMarks()
    {
        int sum=0;
        for(int m:Marks)
        {
            sum+=m;
        }
        return (double) sum/this.Marks.length;
    }
    public void setName(String name)
    {
        if(name.trim().isEmpty() || name=="")
        {
            System.out.println("Name is invalid");
        }
        else
        {
            this.Name = name;
        }
    }
    public void setAddress(String address)
    {
        if(address.trim().isEmpty() || address=="")
        {
            System.out.println("Address is invalid");
        }
        else
        {
            this.Address = address;
        }
    }
    public String getName()
    {
        return this.Name;
    }
    public String getAddress()
    {
        return this.Address;
    }

    public void setNumCourses(int numCourses)
    {
        if(numCourses>0 && numCourses<=6)
        {
            this.NumCourses=numCourses;
        }
        else {
            System.out.println("Please Check again the Number of Course");
        }
    }
    public int getNumCourses()
    {
        return this.NumCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + getName() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", NumCourses=" + getNumCourses() +
                '}';
    }
}
