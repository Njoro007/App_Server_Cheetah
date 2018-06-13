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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "pan_id",
        "capacity",
        "price_id",
        "timestamp"
})
@Entity
public class PanRefill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("pan_id")
    private String panId;
    @JsonProperty("capacity")
    private String capacity;
    @JsonProperty("price_id")
    private String priceId;
    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
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

    @JsonProperty("capacity")
    public String getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("price_id")
    public String getPriceId() {
        return priceId;
    }

    @JsonProperty("price_id")
    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}