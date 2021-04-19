package xyz.leecue.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@NoArgsConstructor
@Data
@ToString
public class User {
    private long userId;
    private String username;
    private String password;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private Role role;
    private Date createTime;
    private Date updateTime;
}
