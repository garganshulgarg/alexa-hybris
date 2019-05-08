
package com.techhybris.alexa.cartmodification.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "description",
    "displayName",
    "distanceKm",
    "features",
    "formattedDistance",
    "geoPoint",
    "mapIcon",
    "name",
    "openingHours",
    "storeContent",
    "storeImages",
    "url"
})
public class DeliveryPointOfService {

    @JsonProperty("address")
    private Address address;
    @JsonProperty("description")
    private String description;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("distanceKm")
    private Integer distanceKm;
    @JsonProperty("features")
    private Features features;
    @JsonProperty("formattedDistance")
    private String formattedDistance;
    @JsonProperty("geoPoint")
    private GeoPoint geoPoint;
    @JsonProperty("mapIcon")
    private MapIcon mapIcon;
    @JsonProperty("name")
    private String name;
    @JsonProperty("openingHours")
    private OpeningHours openingHours;
    @JsonProperty("storeContent")
    private String storeContent;
    @JsonProperty("storeImages")
    private List<StoreImage> storeImages = null;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("distanceKm")
    public Integer getDistanceKm() {
        return distanceKm;
    }

    @JsonProperty("distanceKm")
    public void setDistanceKm(Integer distanceKm) {
        this.distanceKm = distanceKm;
    }

    @JsonProperty("features")
    public Features getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(Features features) {
        this.features = features;
    }

    @JsonProperty("formattedDistance")
    public String getFormattedDistance() {
        return formattedDistance;
    }

    @JsonProperty("formattedDistance")
    public void setFormattedDistance(String formattedDistance) {
        this.formattedDistance = formattedDistance;
    }

    @JsonProperty("geoPoint")
    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    @JsonProperty("geoPoint")
    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    @JsonProperty("mapIcon")
    public MapIcon getMapIcon() {
        return mapIcon;
    }

    @JsonProperty("mapIcon")
    public void setMapIcon(MapIcon mapIcon) {
        this.mapIcon = mapIcon;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("openingHours")
    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    @JsonProperty("openingHours")
    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

    @JsonProperty("storeContent")
    public String getStoreContent() {
        return storeContent;
    }

    @JsonProperty("storeContent")
    public void setStoreContent(String storeContent) {
        this.storeContent = storeContent;
    }

    @JsonProperty("storeImages")
    public List<StoreImage> getStoreImages() {
        return storeImages;
    }

    @JsonProperty("storeImages")
    public void setStoreImages(List<StoreImage> storeImages) {
        this.storeImages = storeImages;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
