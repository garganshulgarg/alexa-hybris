
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
    "deliveryModeChanged",
    "entry",
    "quantity",
    "quantityAdded",
    "statusCode",
    "statusMessage"
})
public class CartModificationData {

    @JsonProperty("deliveryModeChanged")
    private Boolean deliveryModeChanged;
    @JsonProperty("entry")
    private Entry entry;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("quantityAdded")
    private Integer quantityAdded;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("statusMessage")
    private String statusMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("deliveryModeChanged")
    public Boolean getDeliveryModeChanged() {
        return deliveryModeChanged;
    }

    @JsonProperty("deliveryModeChanged")
    public void setDeliveryModeChanged(Boolean deliveryModeChanged) {
        this.deliveryModeChanged = deliveryModeChanged;
    }

    @JsonProperty("entry")
    public Entry getEntry() {
        return entry;
    }

    @JsonProperty("entry")
    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("quantityAdded")
    public Integer getQuantityAdded() {
        return quantityAdded;
    }

    @JsonProperty("quantityAdded")
    public void setQuantityAdded(Integer quantityAdded) {
        this.quantityAdded = quantityAdded;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("statusMessage")
    public String getStatusMessage() {
        return statusMessage;
    }

    @JsonProperty("statusMessage")
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
