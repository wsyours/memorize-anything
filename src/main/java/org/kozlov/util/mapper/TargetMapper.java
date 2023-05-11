package org.kozlov.util.mapper;

import org.kozlov.db.entity.TargetEntity;
import org.kozlov.dto.Target;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TargetMapper {

    Target fromEntity(TargetEntity targetEntity);

    TargetEntity toEntity(Target target);
}
