
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
    "contact",
    "name",
    "servingName",
    "brokerid"
})
public class Office {

    @JsonProperty("contact")
    private Contact contact;
    @JsonProperty("name")
    private String name;
    @JsonProperty("servingName")
    private String servingName;
    @JsonProperty("brokerid")
    private String brokerid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("servingName")
    public String getServingName() {
        return servingName;
    }

    @JsonProperty("servingName")
    public void setServingName(String servingName) {
        this.servingName = servingName;
    }

    @JsonProperty("brokerid")
    public String getBrokerid() {
        return brokerid;
    }

    @JsonProperty("brokerid")
    public void setBrokerid(String brokerid) {
        this.brokerid = brokerid;
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
        return new ToStringBuilder(this).append("contact", contact).append("name", name).append("servingName", servingName).append("brokerid", brokerid).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(brokerid).append(servingName).append(additionalProperties).append(name).append(contact).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Office) == false) {
            return false;
        }
        Office rhs = ((Office) other);
        return new EqualsBuilder().append(brokerid, rhs.brokerid).append(servingName, rhs.servingName).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(contact, rhs.contact).isEquals();
    }

}
