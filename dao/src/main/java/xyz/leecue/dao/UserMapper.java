package xyz.leecue.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import xyz.leecue.model.User;


@Repository
public interface UserMapper {

   /* @Select("select username from user where username = #{username}")
    public String selectUserName(String username);

    @Select("select password from user where username = #{username}")
    public String selectUserPassword(String username);

    @Insert("insert into user(username, password) values(#{username}, #{password})")
    public void addUser(String username, String password);*/

    User getUserByUsername(User user);
    int putUserByUsername(User user);
}
