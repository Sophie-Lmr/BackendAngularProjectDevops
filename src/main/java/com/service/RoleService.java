package com.service;

import java.util.List;
import com.entity.Role;

public interface RoleService {

	public Role saveOrUpdateRole(Role role);

	public void deleteRole(Long id);

	public Role findById(Long id);

	public List<Role> findAll();

}
