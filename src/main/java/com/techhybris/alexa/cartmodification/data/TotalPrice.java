
package com.techhybris.alexa.cartmodification.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currencyIso",
    "formattedValue",
    "maxQuantity",
    "minQuantity",
    "priceType",
    "value"
})
public class TotalPrice {

    @JsonProperty("currencyIso")
    private String currencyIso;
    @JsonProperty("formattedValue")
    private String formattedValue;
    @JsonProperty("maxQuantity")
    private Integer maxQuantity;
    @JsonProperty("minQuantity")
    private Integer minQuantity;
    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("value")
    private Integer value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currencyIso")
    public String getCurrencyIso() {
        return currencyIso;
    }

    @JsonProperty("currencyIso")
    public void setCurrencyIso(String currencyIso) {
        this.currencyIso = currencyIso;
    }

    @JsonProperty("formattedValue")
    public String getFormattedValue() {
        return formattedValue;
    }

    @JsonProperty("formattedValue")
    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    @JsonProperty("maxQuantity")
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    @JsonProperty("maxQuantity")
    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    @JsonProperty("minQuantity")
    public Integer getMinQuantity() {
        return minQuantity;
    }

    @JsonProperty("minQuantity")
    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
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
