package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Role;
import com.service.RoleService;

@RestController
@RequestMapping(value = "/RoleWebService")
@CrossOrigin(allowCredentials = "true", origins = "http://localhost:4200")
public class RoleController {

	@Autowired
	RoleService service;

	@PostMapping(value = "/role")
	public Role saveRole(@RequestBody Role role) {
		return service.saveOrUpdateRole(role);
	}

	@PutMapping(value = "/role")
	public Role updateRole(Role role) {
		return service.saveOrUpdateRole(role);
	}

	@DeleteMapping(value = "/role/{id}")
	public void deleteRole(@PathVariable("id") Long id) {
		service.deleteRole(id);
	}

	@GetMapping(value = "/role/{id}")
	public Role findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@GetMapping(value = "/roles")
	public List<Role> findAll() {
		return service.findAll();
	}

}
