package com.example.testelastic.config;

import com.example.testelastic.author.Author;
import com.example.testelastic.author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Author author = new Author();

        author.setId("concu");
        author.setName("Bob Vu");
        authorRepository.save(author);
        Optional<Author> save = authorRepository.findById("concu");

        Author author1 = save.orElseThrow(() -> new NullPointerException("Author not found!"));

        System.out.println("saved " + author1.getName());
    }
}
