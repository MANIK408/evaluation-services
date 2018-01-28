
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
@JsonPropertyOrder({ "closeDate", "office", "closePrice", "agent", "contractDate" })
public class Sales {

	@JsonProperty("closeDate")
	private String closeDate;
	@JsonProperty("office")
	private Office office;
	@JsonProperty("closePrice")
	private Integer closePrice;
	@JsonProperty("agent")
	private Agent agent;
	@JsonProperty("contractDate")
	private String contractDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("closeDate")
	public String getCloseDate() {
		return closeDate;
	}

	@JsonProperty("closeDate")
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	@JsonProperty("office")
	public Office getOffice() {
		return office;
	}

	@JsonProperty("office")
	public void setOffice(Office office) {
		this.office = office;
	}

	@JsonProperty("closePrice")
	public Integer getClosePrice() {
		return closePrice;
	}

	@JsonProperty("closePrice")
	public void setClosePrice(Integer closePrice) {
		this.closePrice = closePrice;
	}

	@JsonProperty("agent")
	public Agent getAgent() {
		return agent;
	}

	@JsonProperty("agent")
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@JsonProperty("contractDate")
	public String getContractDate() {
		return contractDate;
	}

	@JsonProperty("contractDate")
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
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
		return new ToStringBuilder(this).append("closeDate", closeDate).append("office", office)
				.append("closePrice", closePrice).append("agent", agent).append("contractDate", contractDate)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(closePrice).append(office).append(contractDate).append(closeDate)
				.append(additionalProperties).append(agent).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Sales) == false) {
			return false;
		}
		Sales rhs = ((Sales) other);
		return new EqualsBuilder().append(closePrice, rhs.closePrice).append(office, rhs.office)
				.append(contractDate, rhs.contractDate).append(closeDate, rhs.closeDate)
				.append(additionalProperties, rhs.additionalProperties).append(agent, rhs.agent).isEquals();
	}

}
