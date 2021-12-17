package com.example.testelastic.article;

import com.example.testelastic.author.Author;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "blog")
public class Article {

    @Id
    private String id;
    
    private String title;
    
    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Author> authors;
    
    // standard getters and setters
}