
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
    "middleSchool",
    "highSchool",
    "elementarySchool",
    "district"
})
public class School {

    @JsonProperty("middleSchool")
    private String middleSchool;
    @JsonProperty("highSchool")
    private String highSchool;
    @JsonProperty("elementarySchool")
    private String elementarySchool;
    @JsonProperty("district")
    private String district;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("middleSchool")
    public String getMiddleSchool() {
        return middleSchool;
    }

    @JsonProperty("middleSchool")
    public void setMiddleSchool(String middleSchool) {
        this.middleSchool = middleSchool;
    }

    @JsonProperty("highSchool")
    public String getHighSchool() {
        return highSchool;
    }

    @JsonProperty("highSchool")
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    @JsonProperty("elementarySchool")
    public String getElementarySchool() {
        return elementarySchool;
    }

    @JsonProperty("elementarySchool")
    public void setElementarySchool(String elementarySchool) {
        this.elementarySchool = elementarySchool;
    }

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
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
        return new ToStringBuilder(this).append("middleSchool", middleSchool).append("highSchool", highSchool).append("elementarySchool", elementarySchool).append("district", district).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(highSchool).append(middleSchool).append(additionalProperties).append(elementarySchool).append(district).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof School) == false) {
            return false;
        }
        School rhs = ((School) other);
        return new EqualsBuilder().append(highSchool, rhs.highSchool).append(middleSchool, rhs.middleSchool).append(additionalProperties, rhs.additionalProperties).append(elementarySchool, rhs.elementarySchool).append(district, rhs.district).isEquals();
    }

}
