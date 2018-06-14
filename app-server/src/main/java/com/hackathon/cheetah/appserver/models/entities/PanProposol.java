
package com.hackathon.cheetah.appserver.models.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "locations",
    "manager",
    "content",
    "status",
    "timestamp"
})
@Entity
public class PanProposol {

    @Id
    @JsonProperty("id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    @JsonProperty("locations")
    private List<Location> locations;
    @JsonProperty("manager")
    private String manager;
    @JsonProperty("content")
    private String content;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timestamp")
    private String timestamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
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
