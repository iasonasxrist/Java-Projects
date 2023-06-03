package model.people;

public class Teacher extends Person{

    private String academicField;
    public Teacher(int AM, String name, String address, String academicField) {
        super(AM, name, address);
        this.academicField = academicField;
    }
    public String getAcademicField() {
        return academicField;
    }

    public void setAcademicField(String academicField) {
        this.academicField = academicField;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "academicField='" + academicField + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", AM=" + AM +
                '}';
    }
}
