package com.example.notesapp.service;

import com.example.notesapp.model.Evaluation;
import com.example.notesapp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Evaluation addEvaluation(Evaluation evaluation) {
        return noteRepository.save(evaluation);
    }

    public List<Evaluation> getEvaluationsByStudentId(Long studentId) {
        return noteRepository.findByStudentId(studentId);
    }
}