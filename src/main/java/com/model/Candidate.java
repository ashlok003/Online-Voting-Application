package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"candidate"})})
public class Candidate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique = true)
    private String candidate;
    
    private int votes;

    // Constructor without ID
    public Candidate(String candidate, int votes) {
        this.candidate = candidate;
        this.votes = votes;
    }
    
    // Default constructor
    public Candidate() {
    }

    // Getters and setters
    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }
}
