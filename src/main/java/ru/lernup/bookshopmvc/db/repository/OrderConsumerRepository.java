package ru.lernup.bookshopmvc.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lernup.bookshopmvc.db.entity.OrderConsumer;

public interface OrderConsumerRepository extends JpaRepository<OrderConsumer, Integer> {
}