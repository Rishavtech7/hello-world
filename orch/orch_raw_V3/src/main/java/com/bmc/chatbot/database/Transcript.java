package com.bmc.chatbot.database;

import javax.persistence.Entity;
import javax.persistence.OneToOne;



@Entity
public class Transcript {
    private String transcriptID;
    private String message;
    @OneToOne
    private context contextId;
    private String sender;
    private Audit audit;
    public String getTranscriptID() {
        return transcriptID;
    }
    public void setTranscriptID(String transcriptID) {
        this.transcriptID = transcriptID;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public context getContextId() {
        return contextId;
    }
    public void setContextId(context contextId) {
        this.contextId = contextId;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public Audit getAudit() {
        return audit;
    }
    public void setAudit(Audit audit) {
        this.audit = audit;
    }
    @Override
    public String toString() {
        return "Transcript [transcriptID=" + transcriptID + ", message=" + message + ", contextId="
                + contextId + ", sender=" + sender + ", audit=" + audit + "]";
    }
 

}
