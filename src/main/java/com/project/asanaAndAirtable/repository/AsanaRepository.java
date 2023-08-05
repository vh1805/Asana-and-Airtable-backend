package com.project.asanaAndAirtable.repository;

import com.project.asanaAndAirtable.entity.Asana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsanaRepository extends JpaRepository<Asana, Integer> {
}
