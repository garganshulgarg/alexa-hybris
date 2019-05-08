
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
    "code",
    "priceData",
    "stock",
    "url",
    "variantOptionQualifiers"
})
public class VariantOption_ {

    @JsonProperty("code")
    private String code;
    @JsonProperty("priceData")
    private PriceData___ priceData;
    @JsonProperty("stock")
    private Stock_____ stock;
    @JsonProperty("url")
    private String url;
    @JsonProperty("variantOptionQualifiers")
    private List<VariantOptionQualifier___> variantOptionQualifiers = null;
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

    @JsonProperty("priceData")
    public PriceData___ getPriceData() {
        return priceData;
    }

    @JsonProperty("priceData")
    public void setPriceData(PriceData___ priceData) {
        this.priceData = priceData;
    }

    @JsonProperty("stock")
    public Stock_____ getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock_____ stock) {
        this.stock = stock;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("variantOptionQualifiers")
    public List<VariantOptionQualifier___> getVariantOptionQualifiers() {
        return variantOptionQualifiers;
    }

    @JsonProperty("variantOptionQualifiers")
    public void setVariantOptionQualifiers(List<VariantOptionQualifier___> variantOptionQualifiers) {
        this.variantOptionQualifiers = variantOptionQualifiers;
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
