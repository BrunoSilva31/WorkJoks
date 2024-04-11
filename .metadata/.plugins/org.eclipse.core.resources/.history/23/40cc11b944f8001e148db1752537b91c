package com.example.freela.demo.repositories;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.freela.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	long countByDateAndAmbiente(LocalDateTime horario, String ambiente);
}
