package org.kozlov.controller;

import lombok.RequiredArgsConstructor;
import org.kozlov.db.entity.SatelliteEntity;
import org.kozlov.db.entity.TargetEntity;
import org.kozlov.dto.Memo;
import org.kozlov.dto.Satellite;
import org.kozlov.service.MemorizeService;
import org.kozlov.util.mapper.SatelliteMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("MemorizeController")
@RequestMapping("/memorize")
@RequiredArgsConstructor
public class MemorizeController {

    protected final MemorizeService memorizeService;
    protected final SatelliteMapper satelliteMapper;

/*    @GetMapping
    public Memo get(){return memorizeService.getMemo();}*/

    @PutMapping
    public List<Satellite> put(@RequestParam List<Satellite> satellites){return memorizeService.putSatellites(satellites.stream().map(satelliteMapper::toEntity)
            .toList());}
}
