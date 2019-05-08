
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
    "currency",
    "customerId",
    "deactivationDate",
    "defaultAddress",
    "displayUid",
    "firstName",
    "language",
    "lastName",
    "name",
    "title",
    "titleCode",
    "uid"
})
public class Principal {

    @JsonProperty("currency")
    private Currency currency;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("deactivationDate")
    private String deactivationDate;
    @JsonProperty("defaultAddress")
    private DefaultAddress defaultAddress;
    @JsonProperty("displayUid")
    private String displayUid;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("language")
    private Language language;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("title")
    private String title;
    @JsonProperty("titleCode")
    private String titleCode;
    @JsonProperty("uid")
    private String uid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("deactivationDate")
    public String getDeactivationDate() {
        return deactivationDate;
    }

    @JsonProperty("deactivationDate")
    public void setDeactivationDate(String deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    @JsonProperty("defaultAddress")
    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    @JsonProperty("defaultAddress")
    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @JsonProperty("displayUid")
    public String getDisplayUid() {
        return displayUid;
    }

    @JsonProperty("displayUid")
    public void setDisplayUid(String displayUid) {
        this.displayUid = displayUid;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("titleCode")
    public String getTitleCode() {
        return titleCode;
    }

    @JsonProperty("titleCode")
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
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
