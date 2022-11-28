package com.crud.h2.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.h2.dto.ERole;
import com.crud.h2.dto.Role;

@Repository
	public interface IRoleDAO extends JpaRepository<Role, Long> {
	  Optional<Role> findByName(ERole name);
	}


