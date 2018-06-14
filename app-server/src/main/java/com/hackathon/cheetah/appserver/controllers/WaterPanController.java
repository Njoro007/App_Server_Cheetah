package com.hackathon.cheetah.appserver.controllers;

import com.hackathon.cheetah.appserver.models.entities.WaterPan;
import com.hackathon.cheetah.appserver.models.repositories.WaterpanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/waterpans")

public class WaterPanController {
    @Autowired
    WaterpanRepository waterpanRepository;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public ResponseEntity<List<WaterPan>> waterpans(){
        return ResponseEntity.ok((List<WaterPan>) waterpanRepository.findAll());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<WaterPan> createWaterPan(@RequestBody WaterPan waterpans) {
        waterpans=waterpanRepository.save(waterpans);
        return ResponseEntity.ok(waterpans);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<WaterPan> getWaterPan(@PathVariable Long id) {

        WaterPan waterpan = waterpanRepository.findById(id).get();
            return ResponseEntity.ok(waterpan);
    }
}
