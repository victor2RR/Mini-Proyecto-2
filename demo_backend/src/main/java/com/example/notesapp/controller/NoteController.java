package com.example.notesapp.controller;

import com.example.notesapp.model.Evaluation;
import com.example.notesapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/notes")
public class NoteController {
    
    @Autowired
    private NoteService noteService;

    @PostMapping
    public Evaluation addEvaluation(@RequestBody Evaluation evaluation) {
        return noteService.addEvaluation(evaluation);
    }

    @GetMapping("/{studentId}")
    public List<Evaluation> getEvaluations(@PathVariable Long studentId) {
        return noteService.getEvaluationsByStudentId(studentId);
    }
}
