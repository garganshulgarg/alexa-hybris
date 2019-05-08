
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
    "date",
    "formattedDate",
    "stock"
})
public class FutureStock {

    @JsonProperty("date")
    private String date;
    @JsonProperty("formattedDate")
    private String formattedDate;
    @JsonProperty("stock")
    private Stock__ stock;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("formattedDate")
    public String getFormattedDate() {
        return formattedDate;
    }

    @JsonProperty("formattedDate")
    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    @JsonProperty("stock")
    public Stock__ getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock__ stock) {
        this.stock = stock;
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
