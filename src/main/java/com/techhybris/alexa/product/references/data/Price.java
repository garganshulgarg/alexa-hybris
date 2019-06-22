
package com.techhybris.alexa.product.references.data;

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
    "priceType",
    "value"
})
public class Price {

    @JsonProperty("currencyIso")
    private String currencyIso;
    @JsonProperty("formattedValue")
    private String formattedValue;
    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("value")
    private Double value;
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

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
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
