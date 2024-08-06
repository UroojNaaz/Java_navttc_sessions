public class Main {
    public static void main(String[] args) {

        Student Rizwan = new Student("Rizwan","Karachi, Pakistan",3);
        System.out.println(Rizwan.toString());
         Rizwan.AddCourseGrade("Java",56);
        Rizwan.AddCourseGrade("SQL",86);
        Rizwan.AddCourseGrade("HTMl",66);
        System.out.println(Rizwan.getCourses());
        System.out.println(Rizwan.getMarks());
        System.out.println("Average Grade is : "+Rizwan.getAverageMarks());
      //  Rizwan.setName("Rizwan");
//        System.out.println(Rizwan.getName());
//        System.out.println(Rizwan.getAddress());
    }
}