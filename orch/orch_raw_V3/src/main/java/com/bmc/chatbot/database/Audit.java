package com.bmc.chatbot.database;

import javax.persistence.Embeddable;

//embeddable
@Embeddable
public class Audit {
   
    @Override
    public String toString() {
        return "Audit [createdBy=" + createdBy + ", creationdate=" + creationdate + ", modifiedby="
                + modifiedby + ", modifieddate=" + modifieddate + "]";
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreationdate() {
        return creationdate;
    }
    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }
    public String getModifiedby() {
        return modifiedby;
    }
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
    public String getModifieddate() {
        return modifieddate;
    }
    public void setModifieddate(String modifieddate) {
        this.modifieddate = modifieddate;
    }
    private String createdBy;
    private String creationdate;
    private String modifiedby;
    private String modifieddate;
    

}
