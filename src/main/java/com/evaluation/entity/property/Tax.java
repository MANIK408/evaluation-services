
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
    "taxYear",
    "taxAnnualAmount",
    "id"
})
public class Tax {

    @JsonProperty("taxYear")
    private Integer taxYear;
    @JsonProperty("taxAnnualAmount")
    private String taxAnnualAmount;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("taxYear")
    public Integer getTaxYear() {
        return taxYear;
    }

    @JsonProperty("taxYear")
    public void setTaxYear(Integer taxYear) {
        this.taxYear = taxYear;
    }

    @JsonProperty("taxAnnualAmount")
    public String getTaxAnnualAmount() {
        return taxAnnualAmount;
    }

    @JsonProperty("taxAnnualAmount")
    public void setTaxAnnualAmount(String taxAnnualAmount) {
        this.taxAnnualAmount = taxAnnualAmount;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
        return new ToStringBuilder(this).append("taxYear", taxYear).append("taxAnnualAmount", taxAnnualAmount).append("id", id).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(taxYear).append(additionalProperties).append(taxAnnualAmount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax) == false) {
            return false;
        }
        Tax rhs = ((Tax) other);
        return new EqualsBuilder().append(id, rhs.id).append(taxYear, rhs.taxYear).append(additionalProperties, rhs.additionalProperties).append(taxAnnualAmount, rhs.taxAnnualAmount).isEquals();
    }

}
