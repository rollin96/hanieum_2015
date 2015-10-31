package com.example.persistence;

import org.apache.ibatis.annotations.Param;

import com.example.persistence.model.Authority;

public interface AuthorityMapper {

	public Authority findByName(@Param("username")String username);
}
