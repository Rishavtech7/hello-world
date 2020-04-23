package com.bmc.chatbot.database;



import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class context {
    @Id
    private String sessionid;
    private String username;
    private String contextid;
   
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getContextid() {
        return contextid;
    }
    public void setContextid(String contextid) {
        this.contextid = contextid;
    }
    public String getSessionid() {
        return sessionid;
    }
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }
    @Override
    public String toString() {
        return "context [username=" + username + ", contextid=" + contextid + ", sessionid="
                + sessionid + "]";
    }
   

}
