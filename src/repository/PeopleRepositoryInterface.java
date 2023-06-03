package repository;

import model.people.Person;

public interface PeopleRepositoryInterface {
    public void add (Person person);
    public void deleteByAM(int AM);
    public void delete (Person person);
    public void  print ();
}
