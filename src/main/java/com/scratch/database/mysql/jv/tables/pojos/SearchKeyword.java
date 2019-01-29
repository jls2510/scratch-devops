/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


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
public class SearchKeyword implements Serializable {

    private static final long serialVersionUID = -1836971560;

    private ULong     id;
    private String    searchKeyword;
    private String    replacementKeyword;
    private Timestamp createdTs;
    private Timestamp updatedTs;

    public SearchKeyword() {}

    public SearchKeyword(SearchKeyword value) {
        this.id = value.id;
        this.searchKeyword = value.searchKeyword;
        this.replacementKeyword = value.replacementKeyword;
        this.createdTs = value.createdTs;
        this.updatedTs = value.updatedTs;
    }

    public SearchKeyword(
        ULong     id,
        String    searchKeyword,
        String    replacementKeyword,
        Timestamp createdTs,
        Timestamp updatedTs
    ) {
        this.id = id;
        this.searchKeyword = searchKeyword;
        this.replacementKeyword = replacementKeyword;
        this.createdTs = createdTs;
        this.updatedTs = updatedTs;
    }

    public ULong getId() {
        return this.id;
    }

    public SearchKeyword setId(ULong id) {
        this.id = id;
        return this;
    }

    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public SearchKeyword setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }

    public String getReplacementKeyword() {
        return this.replacementKeyword;
    }

    public SearchKeyword setReplacementKeyword(String replacementKeyword) {
        this.replacementKeyword = replacementKeyword;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public SearchKeyword setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public SearchKeyword setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SearchKeyword (");

        sb.append(id);
        sb.append(", ").append(searchKeyword);
        sb.append(", ").append(replacementKeyword);
        sb.append(", ").append(createdTs);
        sb.append(", ").append(updatedTs);

        sb.append(")");
        return sb.toString();
    }
}
