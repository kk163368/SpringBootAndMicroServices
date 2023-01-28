package com.kewal.springboot.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kewal.springboot.training.model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	Accounts findByCustomerId(int customerId);
}
