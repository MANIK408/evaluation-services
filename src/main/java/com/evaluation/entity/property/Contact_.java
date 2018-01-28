
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
    "email",
    "office",
    "cell"
})
public class Contact_ {

    @JsonProperty("email")
    private String email;
    @JsonProperty("office")
    private String office;
    @JsonProperty("cell")
    private String cell;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("office")
    public String getOffice() {
        return office;
    }

    @JsonProperty("office")
    public void setOffice(String office) {
        this.office = office;
    }

    @JsonProperty("cell")
    public String getCell() {
        return cell;
    }

    @JsonProperty("cell")
    public void setCell(String cell) {
        this.cell = cell;
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
        return new ToStringBuilder(this).append("email", email).append("office", office).append("cell", cell).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(office).append(email).append(additionalProperties).append(cell).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact_) == false) {
            return false;
        }
        Contact_ rhs = ((Contact_) other);
        return new EqualsBuilder().append(office, rhs.office).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(cell, rhs.cell).isEquals();
    }

}
