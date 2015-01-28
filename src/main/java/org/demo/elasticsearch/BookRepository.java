package org.demo.elasticsearch;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, String> {

  public List<Book> findByName(String name);

}
