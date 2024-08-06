public class Person {
    private String Name,Address;

    Person(String name,String address)
    {
        this.Name = name;
        this.Address = address;
    }
    public String getName(){ return this.Name; }
    public String getAddress(){ return this.Address; }

    public void setAddress(String address){ this.Address=address; }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
