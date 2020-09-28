package de.endrigobigi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.endrigobigi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
