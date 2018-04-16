package gopartner.dao;

import gopartner.entity.Movie;
import gopartner.entity.PreferredUser;
import gopartner.entity.User;
import gopartner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> matchUser(PreferredUser preferredUser) {
        List<User> candidateUsers =
                userRepository.findAllByGenderAndAgeGroupAndPerspectiveMovieContains(
                        preferredUser.getGender(),
                        preferredUser.getAgeGroup(),
                        new Movie[]{preferredUser.getMovie()});
        Map<Long, User> unorderedPrecedenceMap = new HashMap<>();
        for (User candidateUser : candidateUsers) {
            Long matchRating = candidateUser.calculateTagMatch(preferredUser.getTags());
            unorderedPrecedenceMap.put(matchRating, candidateUser);
        }
        List<User> orderedCandidateUsers = new ArrayList<>();
        unorderedPrecedenceMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(longUserEntry -> {
            orderedCandidateUsers.add(longUserEntry.getValue());
        });
        return orderedCandidateUsers;
    }
}
