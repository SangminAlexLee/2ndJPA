package com.swchoi.webservice.springboot.domain.positions;

import com.swchoi.webservice.springboot.domain.positions.Positions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostionsRepository extends JpaRepository<Positions, Long> {
}