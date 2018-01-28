
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
    "roof",
    "cooling",
    "style",
    "area",
    "bathsFull",
    "bathsHalf",
    "stories",
    "fireplaces",
    "flooring",
    "heating",
    "foundation",
    "poolFeatures",
    "laundryFeatures",
    "occupantName",
    "lotDescription",
    "lotSizeAcres",
    "subType",
    "bedrooms",
    "interiorFeatures",
    "lotSize",
    "areaSource",
    "maintenanceExpense",
    "additionalRooms",
    "exteriorFeatures",
    "water",
    "view",
    "lotSizeArea",
    "subdivision",
    "construction",
    "subTypeRaw",
    "parking",
    "lotSizeAreaUnits",
    "type",
    "garageSpaces",
    "bathsThreeQuarter",
    "accessibility",
    "occupantType",
    "yearBuilt"
})
public class Property {

    @JsonProperty("roof")
    private String roof;
    @JsonProperty("cooling")
    private String cooling;
    @JsonProperty("style")
    private String style;
    @JsonProperty("area")
    private Integer area;
    @JsonProperty("bathsFull")
    private Integer bathsFull;
    @JsonProperty("bathsHalf")
    private Integer bathsHalf;
    @JsonProperty("stories")
    private Integer stories;
    @JsonProperty("fireplaces")
    private Integer fireplaces;
    @JsonProperty("flooring")
    private String flooring;
    @JsonProperty("heating")
    private String heating;
    @JsonProperty("foundation")
    private String foundation;
    @JsonProperty("poolFeatures")
    private String poolFeatures;
    @JsonProperty("laundryFeatures")
    private String laundryFeatures;
    @JsonProperty("occupantName")
    private String occupantName;
    @JsonProperty("lotDescription")
    private String lotDescription;
    @JsonProperty("lotSizeAcres")
    private Integer lotSizeAcres;
    @JsonProperty("subType")
    private String subType;
    @JsonProperty("bedrooms")
    private Integer bedrooms;
    @JsonProperty("interiorFeatures")
    private String interiorFeatures;
    @JsonProperty("lotSize")
    private String lotSize;
    @JsonProperty("areaSource")
    private String areaSource;
    @JsonProperty("maintenanceExpense")
    private Integer maintenanceExpense;
    @JsonProperty("additionalRooms")
    private String additionalRooms;
    @JsonProperty("exteriorFeatures")
    private String exteriorFeatures;
    @JsonProperty("water")
    private String water;
    @JsonProperty("view")
    private String view;
    @JsonProperty("lotSizeArea")
    private Integer lotSizeArea;
    @JsonProperty("subdivision")
    private String subdivision;
    @JsonProperty("construction")
    private String construction;
    @JsonProperty("subTypeRaw")
    private String subTypeRaw;
    @JsonProperty("parking")
    private Parking parking;
    @JsonProperty("lotSizeAreaUnits")
    private String lotSizeAreaUnits;
    @JsonProperty("type")
    private String type;
    @JsonProperty("garageSpaces")
    private Integer garageSpaces;
    @JsonProperty("bathsThreeQuarter")
    private Integer bathsThreeQuarter;
    @JsonProperty("accessibility")
    private String accessibility;
    @JsonProperty("occupantType")
    private String occupantType;
    @JsonProperty("yearBuilt")
    private Integer yearBuilt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("roof")
    public String getRoof() {
        return roof;
    }

    @JsonProperty("roof")
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @JsonProperty("cooling")
    public String getCooling() {
        return cooling;
    }

    @JsonProperty("cooling")
    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }

    @JsonProperty("area")
    public Integer getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Integer area) {
        this.area = area;
    }

    @JsonProperty("bathsFull")
    public Integer getBathsFull() {
        return bathsFull;
    }

    @JsonProperty("bathsFull")
    public void setBathsFull(Integer bathsFull) {
        this.bathsFull = bathsFull;
    }

    @JsonProperty("bathsHalf")
    public Integer getBathsHalf() {
        return bathsHalf;
    }

    @JsonProperty("bathsHalf")
    public void setBathsHalf(Integer bathsHalf) {
        this.bathsHalf = bathsHalf;
    }

    @JsonProperty("stories")
    public Integer getStories() {
        return stories;
    }

    @JsonProperty("stories")
    public void setStories(Integer stories) {
        this.stories = stories;
    }

    @JsonProperty("fireplaces")
    public Integer getFireplaces() {
        return fireplaces;
    }

    @JsonProperty("fireplaces")
    public void setFireplaces(Integer fireplaces) {
        this.fireplaces = fireplaces;
    }

    @JsonProperty("flooring")
    public String getFlooring() {
        return flooring;
    }

    @JsonProperty("flooring")
    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    @JsonProperty("heating")
    public String getHeating() {
        return heating;
    }

    @JsonProperty("heating")
    public void setHeating(String heating) {
        this.heating = heating;
    }

    @JsonProperty("foundation")
    public String getFoundation() {
        return foundation;
    }

    @JsonProperty("foundation")
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @JsonProperty("poolFeatures")
    public String getPoolFeatures() {
        return poolFeatures;
    }

    @JsonProperty("poolFeatures")
    public void setPoolFeatures(String poolFeatures) {
        this.poolFeatures = poolFeatures;
    }

    @JsonProperty("laundryFeatures")
    public String getLaundryFeatures() {
        return laundryFeatures;
    }

    @JsonProperty("laundryFeatures")
    public void setLaundryFeatures(String laundryFeatures) {
        this.laundryFeatures = laundryFeatures;
    }

    @JsonProperty("occupantName")
    public String getOccupantName() {
        return occupantName;
    }

    @JsonProperty("occupantName")
    public void setOccupantName(String occupantName) {
        this.occupantName = occupantName;
    }

    @JsonProperty("lotDescription")
    public String getLotDescription() {
        return lotDescription;
    }

    @JsonProperty("lotDescription")
    public void setLotDescription(String lotDescription) {
        this.lotDescription = lotDescription;
    }

    @JsonProperty("lotSizeAcres")
    public Integer getLotSizeAcres() {
        return lotSizeAcres;
    }

    @JsonProperty("lotSizeAcres")
    public void setLotSizeAcres(Integer lotSizeAcres) {
        this.lotSizeAcres = lotSizeAcres;
    }

    @JsonProperty("subType")
    public String getSubType() {
        return subType;
    }

    @JsonProperty("subType")
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @JsonProperty("bedrooms")
    public Integer getBedrooms() {
        return bedrooms;
    }

    @JsonProperty("bedrooms")
    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    @JsonProperty("interiorFeatures")
    public String getInteriorFeatures() {
        return interiorFeatures;
    }

    @JsonProperty("interiorFeatures")
    public void setInteriorFeatures(String interiorFeatures) {
        this.interiorFeatures = interiorFeatures;
    }

    @JsonProperty("lotSize")
    public String getLotSize() {
        return lotSize;
    }

    @JsonProperty("lotSize")
    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    @JsonProperty("areaSource")
    public String getAreaSource() {
        return areaSource;
    }

    @JsonProperty("areaSource")
    public void setAreaSource(String areaSource) {
        this.areaSource = areaSource;
    }

    @JsonProperty("maintenanceExpense")
    public Integer getMaintenanceExpense() {
        return maintenanceExpense;
    }

    @JsonProperty("maintenanceExpense")
    public void setMaintenanceExpense(Integer maintenanceExpense) {
        this.maintenanceExpense = maintenanceExpense;
    }

    @JsonProperty("additionalRooms")
    public String getAdditionalRooms() {
        return additionalRooms;
    }

    @JsonProperty("additionalRooms")
    public void setAdditionalRooms(String additionalRooms) {
        this.additionalRooms = additionalRooms;
    }

    @JsonProperty("exteriorFeatures")
    public String getExteriorFeatures() {
        return exteriorFeatures;
    }

    @JsonProperty("exteriorFeatures")
    public void setExteriorFeatures(String exteriorFeatures) {
        this.exteriorFeatures = exteriorFeatures;
    }

    @JsonProperty("water")
    public String getWater() {
        return water;
    }

    @JsonProperty("water")
    public void setWater(String water) {
        this.water = water;
    }

    @JsonProperty("view")
    public String getView() {
        return view;
    }

    @JsonProperty("view")
    public void setView(String view) {
        this.view = view;
    }

    @JsonProperty("lotSizeArea")
    public Integer getLotSizeArea() {
        return lotSizeArea;
    }

    @JsonProperty("lotSizeArea")
    public void setLotSizeArea(Integer lotSizeArea) {
        this.lotSizeArea = lotSizeArea;
    }

    @JsonProperty("subdivision")
    public String getSubdivision() {
        return subdivision;
    }

    @JsonProperty("subdivision")
    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    @JsonProperty("construction")
    public String getConstruction() {
        return construction;
    }

    @JsonProperty("construction")
    public void setConstruction(String construction) {
        this.construction = construction;
    }

    @JsonProperty("subTypeRaw")
    public String getSubTypeRaw() {
        return subTypeRaw;
    }

    @JsonProperty("subTypeRaw")
    public void setSubTypeRaw(String subTypeRaw) {
        this.subTypeRaw = subTypeRaw;
    }

    @JsonProperty("parking")
    public Parking getParking() {
        return parking;
    }

    @JsonProperty("parking")
    public void setParking(Parking parking) {
        this.parking = parking;
    }

    @JsonProperty("lotSizeAreaUnits")
    public String getLotSizeAreaUnits() {
        return lotSizeAreaUnits;
    }

    @JsonProperty("lotSizeAreaUnits")
    public void setLotSizeAreaUnits(String lotSizeAreaUnits) {
        this.lotSizeAreaUnits = lotSizeAreaUnits;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("garageSpaces")
    public Integer getGarageSpaces() {
        return garageSpaces;
    }

    @JsonProperty("garageSpaces")
    public void setGarageSpaces(Integer garageSpaces) {
        this.garageSpaces = garageSpaces;
    }

    @JsonProperty("bathsThreeQuarter")
    public Integer getBathsThreeQuarter() {
        return bathsThreeQuarter;
    }

    @JsonProperty("bathsThreeQuarter")
    public void setBathsThreeQuarter(Integer bathsThreeQuarter) {
        this.bathsThreeQuarter = bathsThreeQuarter;
    }

    @JsonProperty("accessibility")
    public String getAccessibility() {
        return accessibility;
    }

    @JsonProperty("accessibility")
    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    @JsonProperty("occupantType")
    public String getOccupantType() {
        return occupantType;
    }

    @JsonProperty("occupantType")
    public void setOccupantType(String occupantType) {
        this.occupantType = occupantType;
    }

    @JsonProperty("yearBuilt")
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    @JsonProperty("yearBuilt")
    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
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
        return new ToStringBuilder(this).append("roof", roof).append("cooling", cooling).append("style", style).append("area", area).append("bathsFull", bathsFull).append("bathsHalf", bathsHalf).append("stories", stories).append("fireplaces", fireplaces).append("flooring", flooring).append("heating", heating).append("foundation", foundation).append("poolFeatures", poolFeatures).append("laundryFeatures", laundryFeatures).append("occupantName", occupantName).append("lotDescription", lotDescription).append("lotSizeAcres", lotSizeAcres).append("subType", subType).append("bedrooms", bedrooms).append("interiorFeatures", interiorFeatures).append("lotSize", lotSize).append("areaSource", areaSource).append("maintenanceExpense", maintenanceExpense).append("additionalRooms", additionalRooms).append("exteriorFeatures", exteriorFeatures).append("water", water).append("view", view).append("lotSizeArea", lotSizeArea).append("subdivision", subdivision).append("construction", construction).append("subTypeRaw", subTypeRaw).append("parking", parking).append("lotSizeAreaUnits", lotSizeAreaUnits).append("type", type).append("garageSpaces", garageSpaces).append("bathsThreeQuarter", bathsThreeQuarter).append("accessibility", accessibility).append("occupantType", occupantType).append("yearBuilt", yearBuilt).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(occupantType).append(subdivision).append(parking).append(laundryFeatures).append(lotSizeAreaUnits).append(poolFeatures).append(yearBuilt).append(type).append(bathsHalf).append(area).append(exteriorFeatures).append(maintenanceExpense).append(style).append(fireplaces).append(cooling).append(foundation).append(lotSizeAcres).append(construction).append(accessibility).append(water).append(interiorFeatures).append(lotDescription).append(occupantName).append(subTypeRaw).append(bedrooms).append(bathsFull).append(garageSpaces).append(lotSizeArea).append(lotSize).append(additionalRooms).append(roof).append(stories).append(additionalProperties).append(subType).append(areaSource).append(heating).append(bathsThreeQuarter).append(view).append(flooring).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property) == false) {
            return false;
        }
        Property rhs = ((Property) other);
        return new EqualsBuilder().append(occupantType, rhs.occupantType).append(subdivision, rhs.subdivision).append(parking, rhs.parking).append(laundryFeatures, rhs.laundryFeatures).append(lotSizeAreaUnits, rhs.lotSizeAreaUnits).append(poolFeatures, rhs.poolFeatures).append(yearBuilt, rhs.yearBuilt).append(type, rhs.type).append(bathsHalf, rhs.bathsHalf).append(area, rhs.area).append(exteriorFeatures, rhs.exteriorFeatures).append(maintenanceExpense, rhs.maintenanceExpense).append(style, rhs.style).append(fireplaces, rhs.fireplaces).append(cooling, rhs.cooling).append(foundation, rhs.foundation).append(lotSizeAcres, rhs.lotSizeAcres).append(construction, rhs.construction).append(accessibility, rhs.accessibility).append(water, rhs.water).append(interiorFeatures, rhs.interiorFeatures).append(lotDescription, rhs.lotDescription).append(occupantName, rhs.occupantName).append(subTypeRaw, rhs.subTypeRaw).append(bedrooms, rhs.bedrooms).append(bathsFull, rhs.bathsFull).append(garageSpaces, rhs.garageSpaces).append(lotSizeArea, rhs.lotSizeArea).append(lotSize, rhs.lotSize).append(additionalRooms, rhs.additionalRooms).append(roof, rhs.roof).append(stories, rhs.stories).append(additionalProperties, rhs.additionalProperties).append(subType, rhs.subType).append(areaSource, rhs.areaSource).append(heating, rhs.heating).append(bathsThreeQuarter, rhs.bathsThreeQuarter).append(view, rhs.view).append(flooring, rhs.flooring).isEquals();
    }

}
