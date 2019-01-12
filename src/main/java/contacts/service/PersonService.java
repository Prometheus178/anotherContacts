package contacts.service;

import contacts.model.Person;
import java.util.List;
public interface PersonService {

    Person createPerson(Person person);
    List<Person> getAllPersons();

}
