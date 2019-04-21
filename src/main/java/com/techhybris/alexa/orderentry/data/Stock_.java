
package com.techhybris.alexa.orderentry.data;

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
    "stockLevel",
    "stockLevelStatus"
})
public class Stock_ {

    @JsonProperty("stockLevel")
    private Integer stockLevel;
    @JsonProperty("stockLevelStatus")
    private String stockLevelStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stockLevel")
    public Integer getStockLevel() {
        return stockLevel;
    }

    @JsonProperty("stockLevel")
    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    @JsonProperty("stockLevelStatus")
    public String getStockLevelStatus() {
        return stockLevelStatus;
    }

    @JsonProperty("stockLevelStatus")
    public void setStockLevelStatus(String stockLevelStatus) {
        this.stockLevelStatus = stockLevelStatus;
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
