
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
    "leased",
    "spaces",
    "description"
})
public class Parking {

    @JsonProperty("leased")
    private String leased;
    @JsonProperty("spaces")
    private Integer spaces;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("leased")
    public String getLeased() {
        return leased;
    }

    @JsonProperty("leased")
    public void setLeased(String leased) {
        this.leased = leased;
    }

    @JsonProperty("spaces")
    public Integer getSpaces() {
        return spaces;
    }

    @JsonProperty("spaces")
    public void setSpaces(Integer spaces) {
        this.spaces = spaces;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
        return new ToStringBuilder(this).append("leased", leased).append("spaces", spaces).append("description", description).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(spaces).append(leased).append(additionalProperties).append(description).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parking) == false) {
            return false;
        }
        Parking rhs = ((Parking) other);
        return new EqualsBuilder().append(spaces, rhs.spaces).append(leased, rhs.leased).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).isEquals();
    }

}
