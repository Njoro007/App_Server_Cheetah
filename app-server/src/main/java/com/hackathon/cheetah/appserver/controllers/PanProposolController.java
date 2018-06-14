package com.hackathon.cheetah.appserver.controllers;

import com.hackathon.cheetah.appserver.models.entities.PanProposol;
import com.hackathon.cheetah.appserver.models.entities.WaterPan;
import com.hackathon.cheetah.appserver.models.repositories.PanProposolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/panproposol")

public class PanProposolController {
    @Autowired
    PanProposolRepository panproposolRepository;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<PanProposol> createPanProposol(@RequestBody PanProposol panproposol ) {
        panproposol=panproposolRepository.save(panproposol);
        return ResponseEntity.ok(panproposol);
    }

    @RequestMapping(method = RequestMethod.GET, value = "")
    public ResponseEntity<List<PanProposol>> getPanProposol(){
        return ResponseEntity.ok((List<PanProposol>) panproposolRepository.findAll());
    }
}
