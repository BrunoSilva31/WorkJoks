package com.example.freela.demo.repositories;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.freela.demo.entities.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	long countByDateAndAmbiente(LocalDateTime horario, String ambiente);

	@Transactional
	@Modifying
	@Query("DELETE FROM User u WHERE u.date < :currentDate")
	void deleteByDateBefore(LocalDateTime currentDate);

}
