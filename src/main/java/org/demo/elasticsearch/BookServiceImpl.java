package org.demo.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

  @Autowired
  BookRepository bookRepository;


  @Override
  public List<Book> findByName(String name) {
    return bookRepository.findByName(name);
  }

}
