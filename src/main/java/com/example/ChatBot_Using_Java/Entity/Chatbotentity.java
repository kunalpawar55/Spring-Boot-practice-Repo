package com.example.ChatBot_Using_Java.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chat_data")
public class Chatbotentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question")
    private String question;

    @Column(name = "answers")
    private String answers;

    // Default constructor
    public Chatbotentity() {}

    // Constructor without ID
    public Chatbotentity(String question, String answers) {
        this.question = question;
        this.answers = answers;
    }

    // Full constructor
    public Chatbotentity(int id, String question, String answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Chatbotentity [id=" + id + ", question=" + question + ", answers=" + answers + "]";
    }
}
