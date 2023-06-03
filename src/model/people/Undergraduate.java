package model.people;


/**
 * This class extends Student class. 'Extend' means that all the public/protected member
 * variables or functions are inherited in the child class.
 */
public class Undergraduate extends Person {
    private int academicYear;
    public Undergraduate(int AM, String name, String address, int academicYear) {
        /* the parent's constructor is called */
        super(AM, name, address);
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "academicYear=" + academicYear +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", AM=" + AM +
                '}';
    }
}
