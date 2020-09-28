package de.endrigobigi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.endrigobigi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
