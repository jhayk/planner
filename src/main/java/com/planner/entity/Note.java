package com.planner.entity;

import java.util.Date;

public class Note {

    private String text;

    private Date created;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
