
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
    "code",
    "couldFireMessages",
    "description",
    "enabled",
    "endDate",
    "firedMessages",
    "priority",
    "productBanner",
    "promotionGroup",
    "promotionType",
    "restrictions",
    "startDate",
    "title"
})
public class PotentialPromotion {

    @JsonProperty("code")
    private String code;
    @JsonProperty("couldFireMessages")
    private List<String> couldFireMessages = null;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("firedMessages")
    private List<String> firedMessages = null;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("productBanner")
    private ProductBanner productBanner;
    @JsonProperty("promotionGroup")
    private String promotionGroup;
    @JsonProperty("promotionType")
    private String promotionType;
    @JsonProperty("restrictions")
    private List<Restriction> restrictions = null;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("couldFireMessages")
    public List<String> getCouldFireMessages() {
        return couldFireMessages;
    }

    @JsonProperty("couldFireMessages")
    public void setCouldFireMessages(List<String> couldFireMessages) {
        this.couldFireMessages = couldFireMessages;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("firedMessages")
    public List<String> getFiredMessages() {
        return firedMessages;
    }

    @JsonProperty("firedMessages")
    public void setFiredMessages(List<String> firedMessages) {
        this.firedMessages = firedMessages;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("productBanner")
    public ProductBanner getProductBanner() {
        return productBanner;
    }

    @JsonProperty("productBanner")
    public void setProductBanner(ProductBanner productBanner) {
        this.productBanner = productBanner;
    }

    @JsonProperty("promotionGroup")
    public String getPromotionGroup() {
        return promotionGroup;
    }

    @JsonProperty("promotionGroup")
    public void setPromotionGroup(String promotionGroup) {
        this.promotionGroup = promotionGroup;
    }

    @JsonProperty("promotionType")
    public String getPromotionType() {
        return promotionType;
    }

    @JsonProperty("promotionType")
    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    @JsonProperty("restrictions")
    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    @JsonProperty("restrictions")
    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
