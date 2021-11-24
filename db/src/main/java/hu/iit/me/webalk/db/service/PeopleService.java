package hu.iit.me.webalk.db.service;

public interface PeopleService {
	
	Iterable<People> getAllPeople();
	
	People create(People toPeople);

    void deleteById(Long id);

    People getById(Long id);

    void save(People people);
    
    Iterable<People> findByAgeGreaterThan(int age);

}
