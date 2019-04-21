
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
public class Selected {

    @JsonProperty("code")
    private String code;
    @JsonProperty("priceData")
    private PriceData_ priceData;
    @JsonProperty("stock")
    private Stock_ stock;
    @JsonProperty("url")
    private String url;
    @JsonProperty("variantOptionQualifiers")
    private List<VariantOptionQualifier_> variantOptionQualifiers = null;
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
    public PriceData_ getPriceData() {
        return priceData;
    }

    @JsonProperty("priceData")
    public void setPriceData(PriceData_ priceData) {
        this.priceData = priceData;
    }

    @JsonProperty("stock")
    public Stock_ getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock_ stock) {
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
    public List<VariantOptionQualifier_> getVariantOptionQualifiers() {
        return variantOptionQualifiers;
    }

    @JsonProperty("variantOptionQualifiers")
    public void setVariantOptionQualifiers(List<VariantOptionQualifier_> variantOptionQualifiers) {
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
