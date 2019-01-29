/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import com.scratch.database.mysql.jv.enums.ContentStatus;

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
public class Content implements Serializable {

    private static final long serialVersionUID = -712303072;

    private ULong         id;
    private ULong         parentId;
    private ContentStatus status;
    private String        title;
    private String        url;
    private String        content;
    private Timestamp     updatedTs;
    private Timestamp     createdTs;

    public Content() {}

    public Content(Content value) {
        this.id = value.id;
        this.parentId = value.parentId;
        this.status = value.status;
        this.title = value.title;
        this.url = value.url;
        this.content = value.content;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public Content(
        ULong         id,
        ULong         parentId,
        ContentStatus status,
        String        title,
        String        url,
        String        content,
        Timestamp     updatedTs,
        Timestamp     createdTs
    ) {
        this.id = id;
        this.parentId = parentId;
        this.status = status;
        this.title = title;
        this.url = url;
        this.content = content;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public Content setId(ULong id) {
        this.id = id;
        return this;
    }

    public ULong getParentId() {
        return this.parentId;
    }

    public Content setParentId(ULong parentId) {
        this.parentId = parentId;
        return this;
    }

    public ContentStatus getStatus() {
        return this.status;
    }

    public Content setStatus(ContentStatus status) {
        this.status = status;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Content setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public Content setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public Content setContent(String content) {
        this.content = content;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Content setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public Content setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Content (");

        sb.append(id);
        sb.append(", ").append(parentId);
        sb.append(", ").append(status);
        sb.append(", ").append(title);
        sb.append(", ").append(url);
        sb.append(", ").append(content);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}
