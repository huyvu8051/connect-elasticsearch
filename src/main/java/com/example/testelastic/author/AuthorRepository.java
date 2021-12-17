package com.example.testelastic.author;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

public interface AuthorRepository extends ElasticsearchRepository<Author, String> {
}
