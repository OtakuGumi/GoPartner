package gopartner.repository;

import gopartner.entity.Movie;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepository extends PagingAndSortingRepository<Movie, Long>{

}
