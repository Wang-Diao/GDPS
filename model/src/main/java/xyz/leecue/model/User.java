package xyz.leecue.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer Id;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private String name;
    private String sex;
    private Integer age;
    private String idcard;
    private Integer role;
}
