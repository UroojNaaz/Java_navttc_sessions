import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args) {
        System.out.println(Main.sum(10,50));
        System.out.println(A.a);
        Main.sub();
//            Main m = new Main();
//            System.out.println(m.sum(50,897));
//            m.sum(500,897);
//            m.sum(5000,897);
//            m.sum('A','d');
//            m.div();
//            m.mod();
//            m.mul(65);
//            m.sub();
//            System.out.println();

    }

    static int sum(int a,int b)
    {
        return a+b;
    }
    int mul(float c)
    {
        return (int)c*sum(5,9);
    }
    static void sub()
    {
        System.out.println("Sub is : "+(10-20));
    }
    void div()
    {
        System.out.println("Div is : "+(10/20));
    }
    void mod()
    {
        System.out.println("Mod is : "+(10%20));
    }

    static class A
    {
        static int a=100;
    }
}