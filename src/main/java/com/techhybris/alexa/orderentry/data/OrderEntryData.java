
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
    "basePrice",
    "deliveryMode",
    "deliveryPointOfService",
    "entryNumber",
    "product",
    "quantity",
    "totalPrice",
    "updateable"
})
public class OrderEntryData {

    @JsonProperty("basePrice")
    private BasePrice basePrice;
    @JsonProperty("deliveryMode")
    private DeliveryMode deliveryMode;
    @JsonProperty("deliveryPointOfService")
    private DeliveryPointOfService deliveryPointOfService;
    @JsonProperty("entryNumber")
    private Integer entryNumber;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("totalPrice")
    private TotalPrice totalPrice;
    @JsonProperty("updateable")
    private Boolean updateable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("basePrice")
    public BasePrice getBasePrice() {
        return basePrice;
    }

    @JsonProperty("basePrice")
    public void setBasePrice(BasePrice basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("deliveryMode")
    public DeliveryMode getDeliveryMode() {
        return deliveryMode;
    }

    @JsonProperty("deliveryMode")
    public void setDeliveryMode(DeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    @JsonProperty("deliveryPointOfService")
    public DeliveryPointOfService getDeliveryPointOfService() {
        return deliveryPointOfService;
    }

    @JsonProperty("deliveryPointOfService")
    public void setDeliveryPointOfService(DeliveryPointOfService deliveryPointOfService) {
        this.deliveryPointOfService = deliveryPointOfService;
    }

    @JsonProperty("entryNumber")
    public Integer getEntryNumber() {
        return entryNumber;
    }

    @JsonProperty("entryNumber")
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("totalPrice")
    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("updateable")
    public Boolean getUpdateable() {
        return updateable;
    }

    @JsonProperty("updateable")
    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
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
