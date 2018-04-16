package gopartner.repository;


import gopartner.entity.Movie;
import gopartner.entity.User;
import gopartner.enums.AgeGroup;
import gopartner.enums.Gender;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long>{

    public List<User> findAllByGenderAndAgeGroupAndPerspectiveMovieContains(Gender gender, AgeGroup ageGroup, Movie[] perspectiveMovie);

}
