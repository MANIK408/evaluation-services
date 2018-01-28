
package com.evaluation.entity.property;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "county",
    "lat",
    "lng",
    "marketArea",
    "directions"
})
public class Geo {

    @JsonProperty("county")
    private String county;
    @JsonProperty("lat")
    private Integer lat;
    @JsonProperty("lng")
    private Integer lng;
    @JsonProperty("marketArea")
    private String marketArea;
    @JsonProperty("directions")
    private String directions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("lat")
    public Integer getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Integer lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Integer getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Integer lng) {
        this.lng = lng;
    }

    @JsonProperty("marketArea")
    public String getMarketArea() {
        return marketArea;
    }

    @JsonProperty("marketArea")
    public void setMarketArea(String marketArea) {
        this.marketArea = marketArea;
    }

    @JsonProperty("directions")
    public String getDirections() {
        return directions;
    }

    @JsonProperty("directions")
    public void setDirections(String directions) {
        this.directions = directions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("county", county).append("lat", lat).append("lng", lng).append("marketArea", marketArea).append("directions", directions).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(directions).append(county).append(additionalProperties).append(lng).append(marketArea).append(lat).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geo) == false) {
            return false;
        }
        Geo rhs = ((Geo) other);
        return new EqualsBuilder().append(directions, rhs.directions).append(county, rhs.county).append(additionalProperties, rhs.additionalProperties).append(lng, rhs.lng).append(marketArea, rhs.marketArea).append(lat, rhs.lat).isEquals();
    }

}
