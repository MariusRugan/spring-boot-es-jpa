package org.demo.elasticsearch;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books")
public class Book {

  private String id;

  private String title;

  public Book() {

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
