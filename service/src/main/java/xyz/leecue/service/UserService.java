package xyz.leecue.service;

import xyz.leecue.model.User;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
public interface UserService {
    /**
     * get user information by username
     * @param username username
     * @return user's base information
     */
    User getUserInfoByUsername(String username);
}
