package pers.xzj.springboottest.repository;

import pers.xzj.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
