public class Animal {
    String Type;
    String Name;
    String Gander;

    Animal()
    {
        this.Name ="Animal";
        this.Type = "Mammal";
        this.Gander = "Male";
    }
    Animal(String name)
    {
        this.Name = name;
    }
    Animal(String name,String type,String gander)
    {
        this.Name = name;
        this.Type = type;
        this.Gander = gander;
    }

    void eat(String food)
    {
        System.out.println("Can eat : "+food);
    }
    void sound(String s)
    {
        System.out.println("Can sound : "+s);
    }
    void run()
    {
        System.out.println("Can run fast");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Type='" + Type + '\'' +
                ", Name='" + Name + '\'' +
                ", Gander='" + Gander + '\'' +
                '}';
    }
}
