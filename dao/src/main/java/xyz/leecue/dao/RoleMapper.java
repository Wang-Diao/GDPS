package xyz.leecue.dao;

import org.springframework.stereotype.Repository;
import xyz.leecue.model.Role;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@Repository
public interface RoleMapper {
    /**
     * find role information by role id
     * @param id role id
     * @return role information
     */
    Role findRoleById(int id);
}
