import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101,"Asad",
                89.8,99.9,100,59,68);

        Student s2 = new Student(6,"Rizwan",
                8,99.9,100,5,8);

        Student s3 = new Student(0,"Ali",
                89.8,99.9,0,0,68);

        ArrayList<Student> Aptech = new ArrayList<>();
        Aptech.add(s1);
        Aptech.add(s2);
        Aptech.add(s3);
        Iterator j = Aptech.iterator();
        int per;
        String Grade;
        while (j.hasNext())
        {
            Student s = (Student)j.next();
            per = (int)((s.English+s.SST+s.Urdu+s.Math+s.Science)*100)/500;
            if(per>90)
                Grade="A*";
            else if(per>80)
                Grade="A";
            else if(per>70)
                Grade="B";
            else if(per>60)
                Grade="C";
            else if(per>55)
                Grade="D";
            else
                Grade="F";

            System.out.println("{ Enrolment : "+s.Enrollment+" ,"+
                    "Name : "+s.Name+" ,"+
                    "Maths : "+s.Math+" "+
                    "Science : "+s.Science+" ," +
                    "Urdu : "+s.Urdu+"" +
                    "English : "+s.English+" ," +
                    "SST : "+s.SST+" " +
                    "Percentage : "+per+"" +
                    "Grade : "+Grade+" } ");
        }




        ArrayList<String> std = new ArrayList<>();
        std.add("Hey");
        std.add("Hello");
        std.add("AOA");
        std.add("WAS");
        for(String s:std)
        {
            System.out.print(" "+s);
        }
        System.out.println(std.size());
        for(int i=0;i<std.size();i++)
        {
            System.out.print(" "+std.get(i));
        }
        Iterator i = std.iterator();
        while (i.hasNext())
        {
            System.out.print(" "+i.next());
        }
        //System.out.println(std.get(3));

        ArrayList<Integer> M=new ArrayList<>();



    }
}