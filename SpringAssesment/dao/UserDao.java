package SpringAssesment.dao;

import SpringAssesment.User;
import java.util.List;

public interface UserDao {
    List<User> readAll();

    void create(User user);

    List<User> read();

    User readByEmail(String email);

    void updateVisibility(String visibility, Integer user_id);
}