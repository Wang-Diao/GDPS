package xyz.leecue.dao;

import org.springframework.stereotype.Repository;
import xyz.leecue.model.User;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@Repository
public interface UserMapper {
    /**
     * find user details info by username
     * @param username username
     * @return user details information
     */
    User findUserByUsername(String username);

    /**
     * find user's base information by username
     * @param username username
     * @return user's base information
     */
    User findUserInfoByUserName(String username);
}
