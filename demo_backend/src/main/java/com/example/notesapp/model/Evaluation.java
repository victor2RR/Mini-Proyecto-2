package com.example.notesapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "evaluations")
public class Evaluation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id; 
    private Long studentId;
    private int activities;
    private int firstPartial;
    private int secondPartial;
    private int finalExam;

    // Getters  
    public Long getId() {
        return id;
    }

    public Long getstudentId() {
        return studentId;
    }

    public int getactivities() {
        return activities;
    }

    public int getfirstPartial() {
        return firstPartial;
    }

    public int getsecondPartial() {
        return secondPartial;
    }
    public int getfinalExam() {
        return finalExam;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setstudentId( Long studentId) {
        this.studentId = studentId;
    }

    public void setactivities( int activities) {
        this.activities = activities;
    }

    public void setfirstPartial( int firstPartial) {
        this.firstPartial = firstPartial;
    }

    public void setsecondPartial(int secondPartial) {
        this.secondPartial = secondPartial;
    }
    public void setfinalExam(int finalExam) {
        this.finalExam = finalExam;
    }
    
   
}