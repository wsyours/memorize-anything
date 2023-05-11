package org.kozlov.db.repository;

import org.kozlov.db.entity.SatelliteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SatelliteRepository extends JpaRepository<SatelliteEntity, UUID> {
}
