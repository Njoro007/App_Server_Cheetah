
package com.hackathon.cheetah.appserver.models.entities;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hackathon.cheetah.appserver.models.entities.Location;
import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "location",
    "manager",
    "content",
    "status",
    "timestamp"
})
@Entity
public class PanProposol {

    @Id
    @JsonProperty("id")
    private String id;
    @OneToMany(cascade = CascadeType.ALL)

    @JsonProperty("location")
    private Location location;
    @JsonProperty("manager")
    private String manager;
    @JsonProperty("content")
    private String content;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timestamp")
    private String timestamp;



    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("manager")
    public String getManager() {
        return manager;
    }

    @JsonProperty("manager")
    public void setManager(String manager) {
        this.manager = manager;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
