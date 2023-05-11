package org.kozlov.db.repository;

import org.kozlov.db.entity.TargetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;



public interface TargetRepository extends JpaRepository<TargetEntity, UUID> {
}
