
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
    "status",
    "area",
    "daysOnMarket",
    "originatingSystemName",
    "statusText",
    "areaMinor"
})
public class Mls {

    @JsonProperty("status")
    private String status;
    @JsonProperty("area")
    private String area;
    @JsonProperty("daysOnMarket")
    private Integer daysOnMarket;
    @JsonProperty("originatingSystemName")
    private String originatingSystemName;
    @JsonProperty("statusText")
    private String statusText;
    @JsonProperty("areaMinor")
    private String areaMinor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    @JsonProperty("daysOnMarket")
    public Integer getDaysOnMarket() {
        return daysOnMarket;
    }

    @JsonProperty("daysOnMarket")
    public void setDaysOnMarket(Integer daysOnMarket) {
        this.daysOnMarket = daysOnMarket;
    }

    @JsonProperty("originatingSystemName")
    public String getOriginatingSystemName() {
        return originatingSystemName;
    }

    @JsonProperty("originatingSystemName")
    public void setOriginatingSystemName(String originatingSystemName) {
        this.originatingSystemName = originatingSystemName;
    }

    @JsonProperty("statusText")
    public String getStatusText() {
        return statusText;
    }

    @JsonProperty("statusText")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    @JsonProperty("areaMinor")
    public String getAreaMinor() {
        return areaMinor;
    }

    @JsonProperty("areaMinor")
    public void setAreaMinor(String areaMinor) {
        this.areaMinor = areaMinor;
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
        return new ToStringBuilder(this).append("status", status).append("area", area).append("daysOnMarket", daysOnMarket).append("originatingSystemName", originatingSystemName).append("statusText", statusText).append("areaMinor", areaMinor).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(areaMinor).append(area).append(status).append(additionalProperties).append(statusText).append(originatingSystemName).append(daysOnMarket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mls) == false) {
            return false;
        }
        Mls rhs = ((Mls) other);
        return new EqualsBuilder().append(areaMinor, rhs.areaMinor).append(area, rhs.area).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).append(statusText, rhs.statusText).append(originatingSystemName, rhs.originatingSystemName).append(daysOnMarket, rhs.daysOnMarket).isEquals();
    }

}
