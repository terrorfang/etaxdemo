package com.pccth.questionnaire.controllers;

import java.util.List;

import com.pccth.questionnaire.entities.Questionnaire;
import com.pccth.questionnaire.repositories.QuestionnaireRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@CrossOrigin(origins = { "http://192.168.60.1:8080", "http://192.168.60.2:8080" })
public class QuestionnaireController {

    @Autowired
    private QuestionnaireRepository questRp;

    @GetMapping(value = "/api/questionnaire")
    public ResponseEntity<List<Questionnaire>> get() {
        List<Questionnaire> data = this.questRp.findAll();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping(value = "/api/questionnaire")
    public ResponseEntity<Questionnaire> create(@RequestBody Questionnaire data) {
        try {
            Questionnaire _data = questRp.save(data);
            return new ResponseEntity<>(_data, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
