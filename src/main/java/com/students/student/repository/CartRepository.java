package com.students.student.repository;

import com.students.student.entity.Card;
import com.students.student.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Card, Integer> {
}
