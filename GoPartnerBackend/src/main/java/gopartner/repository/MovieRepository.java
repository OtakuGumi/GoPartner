package gopartner.repository;

import gopartner.entity.Movie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface MovieRepository extends PagingAndSortingRepository<Movie, Long>{
    public Movie findByNameContains(@Param("movieName") String name);
}
