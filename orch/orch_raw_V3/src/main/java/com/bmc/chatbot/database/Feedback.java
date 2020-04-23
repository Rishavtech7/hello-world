package com.bmc.chatbot.database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Feedback {
@Id
@OneToOne
private context contextId;
private double score;
private String comment;
public context getContextId() {
    return contextId;
}
public void setContextId(context contextId) {
    this.contextId = contextId;
}
public double getScore() {
    return score;
}
public void setScore(double score) {
    this.score = score;
}
public String getComment() {
    return comment;
}
public void setComment(String comment) {
    this.comment = comment;
}


}
