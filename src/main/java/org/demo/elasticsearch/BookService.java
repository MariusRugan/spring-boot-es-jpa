package org.demo.elasticsearch;

import java.util.List;

public interface BookService {

  List<Book> findByName(String name);

}
