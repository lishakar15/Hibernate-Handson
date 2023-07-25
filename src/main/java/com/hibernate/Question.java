package com.hibernate;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.Cache;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Question {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private int id;
    private String question;
    @OneToMany( mappedBy = "question")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<Answer> answers ;
    
    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
