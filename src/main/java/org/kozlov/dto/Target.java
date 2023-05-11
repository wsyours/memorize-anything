package org.kozlov.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Target {

    private UUID targetId;

    private Date date;

    private String pieceToMemorize;

    private String description;

    private String type;

    private String status;
}
