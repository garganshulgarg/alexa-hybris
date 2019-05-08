
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
    "priceData",
    "stock",
    "url",
    "variantOptionQualifiers"
})
public class VariantOption {

    @JsonProperty("code")
    private String code;
    @JsonProperty("priceData")
    private PriceData__ priceData;
    @JsonProperty("stock")
    private Stock____ stock;
    @JsonProperty("url")
    private String url;
    @JsonProperty("variantOptionQualifiers")
    private List<VariantOptionQualifier__> variantOptionQualifiers = null;
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
    public PriceData__ getPriceData() {
        return priceData;
    }

    @JsonProperty("priceData")
    public void setPriceData(PriceData__ priceData) {
        this.priceData = priceData;
    }

    @JsonProperty("stock")
    public Stock____ getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock____ stock) {
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
    public List<VariantOptionQualifier__> getVariantOptionQualifiers() {
        return variantOptionQualifiers;
    }

    @JsonProperty("variantOptionQualifiers")
    public void setVariantOptionQualifiers(List<VariantOptionQualifier__> variantOptionQualifiers) {
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
