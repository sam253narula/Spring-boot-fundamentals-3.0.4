package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Bookstore;
import com.example.serviceImpl.BookstoreCRUDServiceImpl;

@RestController
@RequestMapping("bookstore")
public class BookstoreController {

	@Autowired
	BookstoreCRUDServiceImpl bookstoreCRUDServiceImpl;
	
	@PostMapping("/createBookStore")
	public Bookstore createBookStore(Bookstore bookstore) {
		return bookstoreCRUDServiceImpl.createBookStore(bookstore);
	}
	
	@GetMapping("/getBookStores")
	public List<Bookstore> getBookStores() {
		return bookstoreCRUDServiceImpl.getBookStores();
	}
	
	@GetMapping("/getBookStoresSortedByName")
	public List<Bookstore> getBookStoresSortedByName() {
		return bookstoreCRUDServiceImpl.getBookStoresSortedByName();
	}
	
	@GetMapping("/getBookStoreById")
	public Bookstore getBookStoreById(Long id) {
		return bookstoreCRUDServiceImpl.getBookStoreById(id);
	}
	
	@GetMapping("/countBookStores")
	public long countBookStores() {
		return bookstoreCRUDServiceImpl.countBookStores();
	}
	
	@GetMapping("/bookstoreExistById")
	public boolean bookstoreExistById(Long id) {
		return bookstoreCRUDServiceImpl.bookstoreExistById(id);
	}
	
	@PutMapping("/updateBookStoreName")
	public Bookstore updateBookStoreName(Long id, String newName) /* throws Exception */  {
		return bookstoreCRUDServiceImpl.updateBookStoreName(id, newName);
	}
	
	@DeleteMapping("/deleteBookStoreById")
	public String deleteBookStoreById(Long id) {
		return bookstoreCRUDServiceImpl.deleteBookStoreById(id);
	}
	
	@DeleteMapping("/truncateBookStore")
	public String truncateBookStore() {
		return bookstoreCRUDServiceImpl.truncateBookStore();
	}
	
}
