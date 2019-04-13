
package com.techhybris.alexa.product.data;

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
    "availableForPickup",
    "averageRating",
    "classifications",
    "code",
    "description",
    "images",
    "manufacturer",
    "multidimensional",
    "name",
    "price",
    "priceRange",
    "stock",
    "summary",
    "url",
    "volumePricesFlag"
})
public class Product {

    @JsonProperty("availableForPickup")
    private Boolean availableForPickup;
    @JsonProperty("averageRating")
    private Double averageRating;
    @JsonProperty("classifications")
    private List<Classification> classifications = null;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("multidimensional")
    private Boolean multidimensional;
    @JsonProperty("name")
    private String name;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("priceRange")
    private PriceRange priceRange;
    @JsonProperty("stock")
    private Stock stock;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("url")
    private String url;
    @JsonProperty("volumePricesFlag")
    private Boolean volumePricesFlag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("availableForPickup")
    public Boolean getAvailableForPickup() {
        return availableForPickup;
    }

    @JsonProperty("availableForPickup")
    public void setAvailableForPickup(Boolean availableForPickup) {
        this.availableForPickup = availableForPickup;
    }

    @JsonProperty("averageRating")
    public Double getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("classifications")
    public List<Classification> getClassifications() {
        return classifications;
    }

    @JsonProperty("classifications")
    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("multidimensional")
    public Boolean getMultidimensional() {
        return multidimensional;
    }

    @JsonProperty("multidimensional")
    public void setMultidimensional(Boolean multidimensional) {
        this.multidimensional = multidimensional;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("priceRange")
    public PriceRange getPriceRange() {
        return priceRange;
    }

    @JsonProperty("priceRange")
    public void setPriceRange(PriceRange priceRange) {
        this.priceRange = priceRange;
    }

    @JsonProperty("stock")
    public Stock getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("volumePricesFlag")
    public Boolean getVolumePricesFlag() {
        return volumePricesFlag;
    }

    @JsonProperty("volumePricesFlag")
    public void setVolumePricesFlag(Boolean volumePricesFlag) {
        this.volumePricesFlag = volumePricesFlag;
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
