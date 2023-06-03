package model.people;

public class PostGraduate extends Person {
    private String fieldOfStudy;
    public PostGraduate(int AM, String name, String address, String fieldOfStudy) {
        super(AM, name, address);
        this.fieldOfStudy = fieldOfStudy;
    }


    @Override
    public String toString() {
        return "PostGraduate{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", AM=" + AM +
                '}';
    }
}
