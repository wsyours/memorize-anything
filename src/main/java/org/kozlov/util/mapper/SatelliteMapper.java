package org.kozlov.util.mapper;

import org.kozlov.db.entity.SatelliteEntity;
import org.kozlov.dto.Satellite;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SatelliteMapper {

    Satellite fromEntity(SatelliteEntity satelliteEntity);

    SatelliteEntity toEntity(Satellite satellite);
}
