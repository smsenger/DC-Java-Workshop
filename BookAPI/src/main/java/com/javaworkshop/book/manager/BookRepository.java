package com.javaworkshop.book.manager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    //jpa repo looks wherever the database is defined for data, whether h2 (like here) or SQL db
    //defines how we interact with obj inside of database


}
