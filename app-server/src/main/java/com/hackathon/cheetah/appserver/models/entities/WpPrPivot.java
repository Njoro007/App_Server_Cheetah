package com.hackathon.cheetah.appserver.models.entities;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "pan_id",
        "ref_id"
})
@Entity
public class WpPrPivot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("pan_id")
    private String panId;
    @JsonProperty("ref_id")
    private String refId;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("pan_id")
    public String getPanId() {
        return panId;
    }

    @JsonProperty("pan_id")
    public void setPanId(String panId) {
        this.panId = panId;
    }

    @JsonProperty("ref_id")
    public String getRefId() {
        return refId;
    }

    @JsonProperty("ref_id")
    public void setRefId(String refId) {
        this.refId = refId;
    }

}