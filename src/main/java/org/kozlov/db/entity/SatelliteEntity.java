package org.kozlov.db.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "satellites")
@Getter
@Setter
public class SatelliteEntity {

    @Id
    private UUID id;

    private UUID targetId;

    private Date date;

    private String pieceToHelp;

    private String description;

    private String type;

    private String status;

}
