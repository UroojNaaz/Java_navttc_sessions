public class Student {
    int Enrollment;
    String Name;
    double Math;
    double Science;
    double Urdu;
    double SST;
    double English;

    public Student(int enrollment, String name, double math, double science, double urdu, double SST, double english) {
        Enrollment = enrollment;
        Name = name;
        Math = math;
        Science = science;
        Urdu = urdu;
        this.SST = SST;
        English = english;
    }
}
