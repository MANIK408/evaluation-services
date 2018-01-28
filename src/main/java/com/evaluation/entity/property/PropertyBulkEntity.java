
package com.evaluation.entity.property;

import java.util.HashMap;
import java.util.List;
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
    "privateRemarks",
    "property",
    "mlsId",
    "showingInstructions",
    "office",
    "leaseTerm",
    "disclaimer",
    "address",
    "listDate",
    "agent",
    "modified",
    "school",
    "photos",
    "listPrice",
    "listingId",
    "mls",
    "geo",
    "tax",
    "coAgent",
    "sales",
    "leaseType",
    "virtualTourUrl",
    "remarks",
    "association"
})
public class PropertyBulkEntity {

    @JsonProperty("privateRemarks")
    private String privateRemarks;
    @JsonProperty("property")
    private Property property;
    @JsonProperty("mlsId")
    private Integer mlsId;
    @JsonProperty("showingInstructions")
    private String showingInstructions;
    @JsonProperty("office")
    private Office office;
    @JsonProperty("leaseTerm")
    private String leaseTerm;
    @JsonProperty("disclaimer")
    private String disclaimer;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("listDate")
    private String listDate;
    @JsonProperty("agent")
    private Agent agent;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("school")
    private School school;
    @JsonProperty("photos")
    private List<String> photos = null;
    @JsonProperty("listPrice")
    private Integer listPrice;
    @JsonProperty("listingId")
    private String listingId;
    @JsonProperty("mls")
    private Mls mls;
    @JsonProperty("geo")
    private Geo geo;
    @JsonProperty("tax")
    private Tax tax;
    @JsonProperty("coAgent")
    private CoAgent coAgent;
    @JsonProperty("sales")
    private Sales sales;
    @JsonProperty("leaseType")
    private String leaseType;
    @JsonProperty("virtualTourUrl")
    private String virtualTourUrl;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("association")
    private Association association;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("privateRemarks")
    public String getPrivateRemarks() {
        return privateRemarks;
    }

    @JsonProperty("privateRemarks")
    public void setPrivateRemarks(String privateRemarks) {
        this.privateRemarks = privateRemarks;
    }

    @JsonProperty("property")
    public Property getProperty() {
        return property;
    }

    @JsonProperty("property")
    public void setProperty(Property property) {
        this.property = property;
    }

    @JsonProperty("mlsId")
    public Integer getMlsId() {
        return mlsId;
    }

    @JsonProperty("mlsId")
    public void setMlsId(Integer mlsId) {
        this.mlsId = mlsId;
    }

    @JsonProperty("showingInstructions")
    public String getShowingInstructions() {
        return showingInstructions;
    }

    @JsonProperty("showingInstructions")
    public void setShowingInstructions(String showingInstructions) {
        this.showingInstructions = showingInstructions;
    }

    @JsonProperty("office")
    public Office getOffice() {
        return office;
    }

    @JsonProperty("office")
    public void setOffice(Office office) {
        this.office = office;
    }

    @JsonProperty("leaseTerm")
    public String getLeaseTerm() {
        return leaseTerm;
    }

    @JsonProperty("leaseTerm")
    public void setLeaseTerm(String leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    @JsonProperty("disclaimer")
    public String getDisclaimer() {
        return disclaimer;
    }

    @JsonProperty("disclaimer")
    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("listDate")
    public String getListDate() {
        return listDate;
    }

    @JsonProperty("listDate")
    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    @JsonProperty("agent")
    public Agent getAgent() {
        return agent;
    }

    @JsonProperty("agent")
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    @JsonProperty("school")
    public School getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(School school) {
        this.school = school;
    }

    @JsonProperty("photos")
    public List<String> getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    @JsonProperty("listPrice")
    public Integer getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("listingId")
    public String getListingId() {
        return listingId;
    }

    @JsonProperty("listingId")
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    @JsonProperty("mls")
    public Mls getMls() {
        return mls;
    }

    @JsonProperty("mls")
    public void setMls(Mls mls) {
        this.mls = mls;
    }

    @JsonProperty("geo")
    public Geo getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @JsonProperty("tax")
    public Tax getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @JsonProperty("coAgent")
    public CoAgent getCoAgent() {
        return coAgent;
    }

    @JsonProperty("coAgent")
    public void setCoAgent(CoAgent coAgent) {
        this.coAgent = coAgent;
    }

    @JsonProperty("sales")
    public Sales getSales() {
        return sales;
    }

    @JsonProperty("sales")
    public void setSales(Sales sales) {
        this.sales = sales;
    }

    @JsonProperty("leaseType")
    public String getLeaseType() {
        return leaseType;
    }

    @JsonProperty("leaseType")
    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    @JsonProperty("virtualTourUrl")
    public String getVirtualTourUrl() {
        return virtualTourUrl;
    }

    @JsonProperty("virtualTourUrl")
    public void setVirtualTourUrl(String virtualTourUrl) {
        this.virtualTourUrl = virtualTourUrl;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("association")
    public Association getAssociation() {
        return association;
    }

    @JsonProperty("association")
    public void setAssociation(Association association) {
        this.association = association;
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
        return new ToStringBuilder(this).append("privateRemarks", privateRemarks).append("property", property).append("mlsId", mlsId).append("showingInstructions", showingInstructions).append("office", office).append("leaseTerm", leaseTerm).append("disclaimer", disclaimer).append("address", address).append("listDate", listDate).append("agent", agent).append("modified", modified).append("school", school).append("photos", photos).append("listPrice", listPrice).append("listingId", listingId).append("mls", mls).append("geo", geo).append("tax", tax).append("coAgent", coAgent).append("sales", sales).append("leaseType", leaseType).append("virtualTourUrl", virtualTourUrl).append("remarks", remarks).append("association", association).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(disclaimer).append(privateRemarks).append(mls).append(remarks).append(listingId).append(virtualTourUrl).append(listPrice).append(sales).append(mlsId).append(leaseTerm).append(office).append(geo).append(association).append(coAgent).append(property).append(leaseType).append(agent).append(showingInstructions).append(modified).append(photos).append(school).append(tax).append(address).append(additionalProperties).append(listDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertyBulkEntity) == false) {
            return false;
        }
        PropertyBulkEntity rhs = ((PropertyBulkEntity) other);
        return new EqualsBuilder().append(disclaimer, rhs.disclaimer).append(privateRemarks, rhs.privateRemarks).append(mls, rhs.mls).append(remarks, rhs.remarks).append(listingId, rhs.listingId).append(virtualTourUrl, rhs.virtualTourUrl).append(listPrice, rhs.listPrice).append(sales, rhs.sales).append(mlsId, rhs.mlsId).append(leaseTerm, rhs.leaseTerm).append(office, rhs.office).append(geo, rhs.geo).append(association, rhs.association).append(coAgent, rhs.coAgent).append(property, rhs.property).append(leaseType, rhs.leaseType).append(agent, rhs.agent).append(showingInstructions, rhs.showingInstructions).append(modified, rhs.modified).append(photos, rhs.photos).append(school, rhs.school).append(tax, rhs.tax).append(address, rhs.address).append(additionalProperties, rhs.additionalProperties).append(listDate, rhs.listDate).isEquals();
    }

}
