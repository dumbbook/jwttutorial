package me.suhwankang.jwttutorial3.repository;

import me.suhwankang.jwttutorial3.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
