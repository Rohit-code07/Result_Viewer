package com.resultViewer.RV.Entity;

import jakarta.persistence.*;

@Entity
public class result {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String studentName;

        @Column(unique = true)
        private String rollNumber;

        private String course;

        private String semester;

        private int javaMarks;
        private int dbmsMarks;
        private int osMarks;
        private int pythonMarks;
        private int cnMarks;

        private int totalMarks;

        private double percentage;

        private String grade;

        private String resultStatus; // PASS / FAIL

    }

