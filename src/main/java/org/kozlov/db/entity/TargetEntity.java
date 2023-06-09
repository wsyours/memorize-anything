package org.kozlov.db.entity;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "targets")
@Getter
@Setter
public class TargetEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private Date date;

    private String pieceToMemorize;

    private String description;

    private String type;

    private String status;

}
