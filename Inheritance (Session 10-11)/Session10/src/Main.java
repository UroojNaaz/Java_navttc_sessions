public class Main {
    public static void main(String[] args) {
        Student s = new Student("Abid","Gilgit");
        s.addcoursemark("Java",92);
        s.addcoursemark("PhP",99);
        s.addcoursemark("Laravel",76);
        s.addcoursemark("C#",63);
        s.addcoursemark("HTML",47);
        System.out.println(s.toString());

        System.out.println();

        Teacher t= new Teacher("Abid","Karachi");
        t.addcourse("Java");
        t.addcourse("HTML");
        t.addcourse("CSS");
        t.addcourse("PHP");
        t.addcourse("C#");
        System.out.println(t.toString());
    }
}
