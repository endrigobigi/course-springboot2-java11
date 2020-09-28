package de.endrigobigi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.endrigobigi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
