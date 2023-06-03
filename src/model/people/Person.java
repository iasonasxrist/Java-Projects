package model.people;

abstract public class Person {
    /* member variables */
    protected String name, address;
    protected int AM;

    /*constructor*/
    public Person(int AM, String name, String address){
        this.AM = AM;
        this.name = name;
        this.address = address;
    }



    /* member functions */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", AM=" + AM +
                '}';
    }
}
