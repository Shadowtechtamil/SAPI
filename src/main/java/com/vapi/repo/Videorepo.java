package com.vapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vapi.entity.Videoinfo;

public interface Videorepo extends JpaRepository<Videoinfo, Integer> 
{
	Optional<Videoinfo> findByvUrl(String vUrl);
}
