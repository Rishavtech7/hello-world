package com.bmc.chatbot.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name="context")
@EntityListeners(AuditingEntityListener.class)
public class Context implements Serializable {
    
    public Context() {
        
    }
    
    private static final long serialVersionUID = -5197799482644544583L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer contextId;
    @Column(name="username",nullable=false)
    private String userName;
   
    @Column(name="sessionid",nullable=false)
    private String sessionId;
    public Integer getContextId() {
        return contextId;
    }
    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
