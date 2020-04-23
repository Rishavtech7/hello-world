package com.bmc.chatbot.entity;

import org.springframework.stereotype.Component;

@Component
public class Feedback {
    private String score;
    private String comment;
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
   
}
