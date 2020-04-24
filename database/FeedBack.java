package com.bmc.chatbot.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="feedback")
@EntityListeners(AuditingEntityListener.class)
public class FeedBack implements Serializable {

    private static final long serialVersionUID = 2930148111244467472L;
    @Id
    private String id;
    @OneToOne
    private Context context;
    @Column(name="score")
    private long score;
    @Column(name="comment")
    private String comment;
    public Context getContext() {
        return context;
    }
    public void setContext(Context context) {
        this.context = context;
    }
    public long getScore() {
        return score;
    }
    public void setScore(long score) {
        this.score = score;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public FeedBack(Context context, long score, String comment) {
        super();
        this.context = context;
        this.score = score;
        this.comment = comment;
    }

}
