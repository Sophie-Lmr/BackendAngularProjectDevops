package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Role;
import com.repository.RoleRepository;
import com.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository repository;

	@Override
	public Role saveOrUpdateRole(Role role) {
		return repository.save(role);
	}

	@Override
	public void deleteRole(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Role findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

}
