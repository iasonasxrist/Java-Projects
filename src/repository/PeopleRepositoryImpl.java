package repository;

import model.people.Person;

import java.util.*;

public class PeopleRepositoryImpl implements PeopleRepositoryInterface {
    private List<Person> listOfPerson = new ArrayList<>();

    public void add (Person person){
        listOfPerson.add(person);
    }
    public void deleteByAM(int AM){
        for (int i = 0; i < listOfPerson.size(); i++){
            if (listOfPerson.get(i).getAM() == AM){
                listOfPerson.remove(i);
                return;
            }
        }
    }
    public void delete (Person person){
        listOfPerson.remove(person);
    }

    public void  print (){
        listOfPerson.stream().forEach(person -> {
            System.out.println(person);
        });
    }

}
