
package com.techhybris.alexa.orderentry.data;

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
    "baseProduct",
    "categories",
    "classifications",
    "code",
    "description",
    "futureStocks",
    "images",
    "manufacturer",
    "multidimensional",
    "name",
    "numberOfReviews",
    "potentialPromotions",
    "price",
    "priceRange",
    "productReferences",
    "purchasable",
    "reviews",
    "stock",
    "summary",
    "url",
    "variantMatrix",
    "variantOptions",
    "variantType",
    "volumePrices",
    "volumePricesFlag"
})
public class Product {

    @JsonProperty("availableForPickup")
    private Boolean availableForPickup;
    @JsonProperty("averageRating")
    private Integer averageRating;
    @JsonProperty("baseOptions")
    private List<BaseOption> baseOptions = null;
    @JsonProperty("baseProduct")
    private String baseProduct;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("classifications")
    private List<Classification> classifications = null;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("futureStocks")
    private List<FutureStock> futureStocks = null;
    @JsonProperty("images")
    private List<Image___> images = null;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("multidimensional")
    private Boolean multidimensional;
    @JsonProperty("name")
    private String name;
    @JsonProperty("numberOfReviews")
    private Integer numberOfReviews;
    @JsonProperty("potentialPromotions")
    private List<PotentialPromotion> potentialPromotions = null;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("priceRange")
    private PriceRange priceRange;
    @JsonProperty("productReferences")
    private List<ProductReference> productReferences = null;
    @JsonProperty("purchasable")
    private Boolean purchasable;
    @JsonProperty("reviews")
    private List<Review> reviews = null;
    @JsonProperty("stock")
    private Stock___ stock;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("url")
    private String url;
    @JsonProperty("variantMatrix")
    private List<VariantMatrix> variantMatrix = null;
    @JsonProperty("variantOptions")
    private List<VariantOption_> variantOptions = null;
    @JsonProperty("variantType")
    private String variantType;
    @JsonProperty("volumePrices")
    private List<VolumePrice> volumePrices = null;
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
    public Integer getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("baseOptions")
    public List<BaseOption> getBaseOptions() {
        return baseOptions;
    }

    @JsonProperty("baseOptions")
    public void setBaseOptions(List<BaseOption> baseOptions) {
        this.baseOptions = baseOptions;
    }

    @JsonProperty("baseProduct")
    public String getBaseProduct() {
        return baseProduct;
    }

    @JsonProperty("baseProduct")
    public void setBaseProduct(String baseProduct) {
        this.baseProduct = baseProduct;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
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

    @JsonProperty("futureStocks")
    public List<FutureStock> getFutureStocks() {
        return futureStocks;
    }

    @JsonProperty("futureStocks")
    public void setFutureStocks(List<FutureStock> futureStocks) {
        this.futureStocks = futureStocks;
    }

    @JsonProperty("images")
    public List<Image___> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image___> images) {
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

    @JsonProperty("numberOfReviews")
    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    @JsonProperty("numberOfReviews")
    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    @JsonProperty("potentialPromotions")
    public List<PotentialPromotion> getPotentialPromotions() {
        return potentialPromotions;
    }

    @JsonProperty("potentialPromotions")
    public void setPotentialPromotions(List<PotentialPromotion> potentialPromotions) {
        this.potentialPromotions = potentialPromotions;
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

    @JsonProperty("productReferences")
    public List<ProductReference> getProductReferences() {
        return productReferences;
    }

    @JsonProperty("productReferences")
    public void setProductReferences(List<ProductReference> productReferences) {
        this.productReferences = productReferences;
    }

    @JsonProperty("purchasable")
    public Boolean getPurchasable() {
        return purchasable;
    }

    @JsonProperty("purchasable")
    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }

    @JsonProperty("reviews")
    public List<Review> getReviews() {
        return reviews;
    }

    @JsonProperty("reviews")
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @JsonProperty("stock")
    public Stock___ getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock___ stock) {
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

    @JsonProperty("variantMatrix")
    public List<VariantMatrix> getVariantMatrix() {
        return variantMatrix;
    }

    @JsonProperty("variantMatrix")
    public void setVariantMatrix(List<VariantMatrix> variantMatrix) {
        this.variantMatrix = variantMatrix;
    }

    @JsonProperty("variantOptions")
    public List<VariantOption_> getVariantOptions() {
        return variantOptions;
    }

    @JsonProperty("variantOptions")
    public void setVariantOptions(List<VariantOption_> variantOptions) {
        this.variantOptions = variantOptions;
    }

    @JsonProperty("variantType")
    public String getVariantType() {
        return variantType;
    }

    @JsonProperty("variantType")
    public void setVariantType(String variantType) {
        this.variantType = variantType;
    }

    @JsonProperty("volumePrices")
    public List<VolumePrice> getVolumePrices() {
        return volumePrices;
    }

    @JsonProperty("volumePrices")
    public void setVolumePrices(List<VolumePrice> volumePrices) {
        this.volumePrices = volumePrices;
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
