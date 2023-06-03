package repository;

import model.courses.Courses;
import model.people.Person;
import semester.Semester;

import java.util.*;
import java.util.HashMap;

public class SubscriptionsRepositoryImpl {
    /*hashCode in Semester is used to assign Semesters in each cell of hash table */
    HashMap<Integer, HashMap<Semester, List<Courses>>> subscriptionsPerSemester = new HashMap<>();

    public void subscribe(Person person, Semester semester, Courses course) {
        int AM = person.getAM();
        if (!subscriptionsPerSemester.containsKey(AM)) {
            subscriptionsPerSemester.put(AM, new HashMap<>());
        }
        if (!subscriptionsPerSemester.get(AM).containsKey(semester)) {
            subscriptionsPerSemester.get(AM).put(semester, new ArrayList<>());
        }
        subscriptionsPerSemester.get(AM).get(semester).add(course);
    }

    public void print(){
        for (Map.Entry<Integer, HashMap<Semester, List<Courses>>> subsPerAM : subscriptionsPerSemester.entrySet()){
                for (Map.Entry<Semester, List<Courses>> subsPerSemester : subsPerAM.getValue().entrySet()){
                    for (Courses course : subsPerSemester.getValue()){
                        System.out.println("AM :" + subsPerAM.getKey() + " Semester: " + subsPerSemester.getKey() +
                                " Course: " + course);
                    }
                }
        }
    }


}
