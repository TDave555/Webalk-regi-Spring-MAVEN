package hu.iit.me.webalk.db.repository;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface PeopleRepository extends PagingAndSortingRepository<PeopleModel, Long> {
	Iterable<PeopleModel> findAllByAgeGreaterThanEqual(int age);
}
