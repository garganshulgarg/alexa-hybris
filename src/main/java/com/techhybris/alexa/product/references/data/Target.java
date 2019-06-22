
package com.techhybris.alexa.product.references.data;

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
    "baseOptions",
    "categories",
    "code",
    "description",
    "manufacturer",
    "name",
    "numberOfReviews",
    "price",
    "priceRange",
    "purchasable",
    "stock",
    "summary",
    "url"
})
public class Target {

    @JsonProperty("availableForPickup")
    private Boolean availableForPickup;
    @JsonProperty("averageRating")
    private Double averageRating;
    @JsonProperty("baseOptions")
    private List<Object> baseOptions = null;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("name")
    private String name;
    @JsonProperty("numberOfReviews")
    private Integer numberOfReviews;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("priceRange")
    private PriceRange priceRange;
    @JsonProperty("purchasable")
    private Boolean purchasable;
    @JsonProperty("stock")
    private Stock stock;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("url")
    private String url;
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

    @JsonProperty("baseOptions")
    public List<Object> getBaseOptions() {
        return baseOptions;
    }

    @JsonProperty("baseOptions")
    public void setBaseOptions(List<Object> baseOptions) {
        this.baseOptions = baseOptions;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
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

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("numberOfReviews")
    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    @JsonProperty("numberOfReviews")
    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
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

    @JsonProperty("purchasable")
    public Boolean getPurchasable() {
        return purchasable;
    }

    @JsonProperty("purchasable")
    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
