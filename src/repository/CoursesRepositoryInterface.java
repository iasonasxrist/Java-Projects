package repository;

import model.courses.Courses;

public interface CoursesRepositoryInterface  {

    public void add (Courses course);
    public void deleteById (String courseId);
    public void delete (Courses courseId);
    public void print();

}
