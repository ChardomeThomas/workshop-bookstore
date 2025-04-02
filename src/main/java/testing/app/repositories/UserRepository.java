package testing.app.repositories;
import org.springframework.data.repository.ListCrudRepository;

import testing.app.models.User;

public interface UserRepository extends ListCrudRepository<User, Integer> {

}
