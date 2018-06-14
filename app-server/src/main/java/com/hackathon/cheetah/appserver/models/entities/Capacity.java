package com.hackathon.cheetah.appserver.models.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "max",
        "level",
        "timestamp"
})
@Entity
public class Capacity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private long id;
    @JsonProperty("max")
    private String max;
    @JsonProperty("level")
    private String level;
    @JsonProperty("timestamp")
    private String timestamp;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "waterpan_id", referencedColumnName = "id")
    private List<WaterPan> waterPans;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<WaterPan> getWaterPans() {
        return waterPans;
    }

    public void setWaterPans(List<WaterPan> waterPans) {
        this.waterPans = waterPans;
    }

    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
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