import model.courses.Lab;
import model.courses.Theory;
import model.grades.GradePerCourse;
import model.people.Teacher;
import repository.GradesRepository;
import repository.PeopleRepositoryImpl;
import repository.PeopleRepositoryInterface;
import model.people.PostGraduate;
import model.people.Undergraduate;
import repository.SubscriptionsRepositoryImpl;
import semester.EPOCH;
import semester.Semester;

public class Main {
    public static void main(String[] args) {

        SubscriptionsRepositoryImpl subscriptionsRepository = new SubscriptionsRepositoryImpl();
        Undergraduate undergraduate = new Undergraduate(1, "Kalia", "Elounta", 15);
        PostGraduate postGraduate = new PostGraduate(2, "Iaswnas", "Elounta", "Machine Learning");
        Teacher teacher = new Teacher(3, "Frank", "Nikaia", "Everything");

        Theory theory = new Theory("HRY102", "Java", "Software", new Semester(EPOCH.SUMMER, 2023),
                teacher);
        Lab lab = new Lab("HRY102", "Java", "Software", new Semester(EPOCH.SUMMER, 2023),
                teacher);

        subscriptionsRepository.subscribe(undergraduate, new Semester(EPOCH.SUMMER, 2023),  theory );
        subscriptionsRepository.subscribe(undergraduate, new Semester(EPOCH.SUMMER, 2023),  lab );
        subscriptionsRepository.subscribe(postGraduate, new Semester(EPOCH.SUMMER, 2023), theory);
        subscriptionsRepository.print();

        GradesRepository studentGrades = new GradesRepository();
        studentGrades.add(3, lab, undergraduate, (float) 8.0 );
        studentGrades.add(3, lab, undergraduate, (float) 5.0 );

        studentGrades.print();
        studentGrades.checkStudentStatus(3, subscriptionsRepository, 5);
        /*
        PeopleRepositoryInterface  peopleRepository = new PeopleRepositoryImpl();
        peopleRepository.add(undergraduate);
        peopleRepository.add(postGraduate);
        peopleRepository.add(teacher);
        peopleRepository.print();
        System.out.println("*****************************");
        peopleRepository.deleteByAM(1);
        peopleRepository.print();
        */

    }
}