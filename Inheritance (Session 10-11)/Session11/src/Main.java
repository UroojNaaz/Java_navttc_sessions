public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());

        Rectangle r = new Rectangle(5,6,"Blue",true);
        System.out.println(r.toString());
        System.out.println();
        Square s = new Square(8,"Yellow",true);
        System.out.println(s.toString());

        System.out.println();
        Shape shape = new Square();

        Square sq = (Square) new Rectangle();



    }
}