package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Bookstore;

@Repository
public interface BookstoreRepository extends JpaRepository<Bookstore, Long>{
	

}
