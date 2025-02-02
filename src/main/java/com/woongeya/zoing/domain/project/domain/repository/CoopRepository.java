package com.woongeya.zoing.domain.project.domain.repository;

import com.woongeya.zoing.domain.project.domain.Coop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoopRepository extends JpaRepository<Coop, Long> {

    void deleteByProjectId(Long id);
}
