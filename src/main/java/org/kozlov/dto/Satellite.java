package org.kozlov.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Satellite {

    private UUID targetId;

    private Date date;

    private String pieceToHelp;

    private String description;

    private String type;

    private String status;
}
