package ru.lernup.bookshopmvc.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lernup.bookshopmvc.db.entity.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Integer> {
}