package com.hackathon.cheetah.appserver.models.entities;

import java.util.HashMap;
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
        "name",
        "location_id",
        "user_id",
        "status",
        "capacity_id",
        "price_id"
})
@Entity(name = "t_waterpan")
public class WaterPan {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("capacity_id")
    private String capacityId;
    @JsonProperty("price_id")
    private String priceId;

    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("capacity_id")
    public String getCapacityId() {
        return capacityId;
    }

    @JsonProperty("capacity_id")
    public void setCapacityId(String capacityId) {
        this.capacityId = capacityId;
    }

    @JsonProperty("price_id")
    public String getPriceId() {
        return priceId;
    }

    @JsonProperty("price_id")
    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}