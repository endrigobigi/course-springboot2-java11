package de.endrigobigi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.endrigobigi.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
