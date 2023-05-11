package org.kozlov.service;

import lombok.RequiredArgsConstructor;
import org.kozlov.db.entity.SatelliteEntity;
import org.kozlov.db.repository.SatelliteRepository;
import org.kozlov.dto.Satellite;
import org.kozlov.util.mapper.SatelliteMapper;
import org.kozlov.util.mapper.TargetMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemorizeService {

    //private final TargetRepository targretRepostiory;
    private final SatelliteRepository satelliteRepository;
    private final SatelliteMapper satelliteMapper;
    private final TargetMapper targetMapper;

    public List<Satellite> putSatellites(List<SatelliteEntity> satelliteEntities) {
         return satelliteRepository.saveAll(satelliteEntities)
                 .stream().map(satelliteMapper::fromEntity)
                 .toList();
    }

}
