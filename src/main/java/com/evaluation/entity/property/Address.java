
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
    "crossStreet",
    "state",
    "country",
    "postalCode",
    "streetName",
    "streetNumberText",
    "city",
    "streetNumber",
    "full"
})
public class Address {

    @JsonProperty("crossStreet")
    private String crossStreet;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetNumberText")
    private String streetNumberText;
    @JsonProperty("city")
    private String city;
    @JsonProperty("streetNumber")
    private Integer streetNumber;
    @JsonProperty("full")
    private String full;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("crossStreet")
    public String getCrossStreet() {
        return crossStreet;
    }

    @JsonProperty("crossStreet")
    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("streetNumberText")
    public String getStreetNumberText() {
        return streetNumberText;
    }

    @JsonProperty("streetNumberText")
    public void setStreetNumberText(String streetNumberText) {
        this.streetNumberText = streetNumberText;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("streetNumber")
    public Integer getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("streetNumber")
    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
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
        return new ToStringBuilder(this).append("crossStreet", crossStreet).append("state", state).append("country", country).append("postalCode", postalCode).append("streetName", streetName).append("streetNumberText", streetNumberText).append("city", city).append("streetNumber", streetNumber).append("full", full).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postalCode).append(full).append(streetNumberText).append(additionalProperties).append(state).append(streetNumber).append(streetName).append(city).append(country).append(crossStreet).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(postalCode, rhs.postalCode).append(full, rhs.full).append(streetNumberText, rhs.streetNumberText).append(additionalProperties, rhs.additionalProperties).append(state, rhs.state).append(streetNumber, rhs.streetNumber).append(streetName, rhs.streetName).append(city, rhs.city).append(country, rhs.country).append(crossStreet, rhs.crossStreet).isEquals();
    }

}
