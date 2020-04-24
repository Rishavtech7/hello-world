package com.bmc.chatbot.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="transcript")
@EntityListeners(AuditingEntityListener.class)
public class Transcript implements Serializable{

    private static final long serialVersionUID = 6261563789671343115L;
    @Id
    private String transcriptId;
    @Column(name="message",nullable=false)
    private String message;
    @ManyToOne
    private Context context;
    @Column(name="sender",nullable=false)
    private String sender;
    @Column(name="reciever",nullable=false)
    private String reciever;
    @Column(name="createdby",nullable=false)
    private String createdBy;
    @Column(name="modifiedby",nullable=false)
    private String modifiedBy;
    @Column(name="creationdate",nullable=false)
    private String creationDate;
    @Column(name="modifieddate",nullable=false)
    private String modifiedDate;
    public Transcript() {
     
    }
    public String getTranscriptId() {
        return transcriptId;
    }
    public void setTranscriptId(String transcriptId) {
        this.transcriptId = transcriptId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Context getContext() {
        return context;
    }
    public void setContext(Context context) {
        this.context = context;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getReciever() {
        return reciever;
    }
    public void setReciever(String reciever) {
        this.reciever = reciever;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getModifiedBy() {
        return modifiedBy;
    }
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getModifiedDate() {
        return modifiedDate;
    }
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    

}
