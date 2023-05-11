package org.kozlov.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Memo {

    private ArrayList<Satellite> satellites;

    private Target target;
}
