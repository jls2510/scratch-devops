/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import com.scratch.database.mysql.jv.enums.LogLevel;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Log implements Serializable {

    private static final long serialVersionUID = -2032854628;

    private ULong     id;
    private Timestamp createdTs;
    private LogLevel  level;
    private String    event;
    private String    description;
    private String    before;
    private String    after;

    public Log() {}

    public Log(Log value) {
        this.id = value.id;
        this.createdTs = value.createdTs;
        this.level = value.level;
        this.event = value.event;
        this.description = value.description;
        this.before = value.before;
        this.after = value.after;
    }

    public Log(
        ULong     id,
        Timestamp createdTs,
        LogLevel  level,
        String    event,
        String    description,
        String    before,
        String    after
    ) {
        this.id = id;
        this.createdTs = createdTs;
        this.level = level;
        this.event = event;
        this.description = description;
        this.before = before;
        this.after = after;
    }

    public ULong getId() {
        return this.id;
    }

    public Log setId(ULong id) {
        this.id = id;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public Log setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    public LogLevel getLevel() {
        return this.level;
    }

    public Log setLevel(LogLevel level) {
        this.level = level;
        return this;
    }

    public String getEvent() {
        return this.event;
    }

    public Log setEvent(String event) {
        this.event = event;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Log setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getBefore() {
        return this.before;
    }

    public Log setBefore(String before) {
        this.before = before;
        return this;
    }

    public String getAfter() {
        return this.after;
    }

    public Log setAfter(String after) {
        this.after = after;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Log (");

        sb.append(id);
        sb.append(", ").append(createdTs);
        sb.append(", ").append(level);
        sb.append(", ").append(event);
        sb.append(", ").append(description);
        sb.append(", ").append(before);
        sb.append(", ").append(after);

        sb.append(")");
        return sb.toString();
    }
}
