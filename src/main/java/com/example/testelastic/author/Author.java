package com.example.testelastic.author;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "author")
@Data
public class Author {
    @Id
    private String id;

    private String name;
}
