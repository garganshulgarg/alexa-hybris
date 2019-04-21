
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
    "companyName",
    "country",
    "defaultAddress",
    "email",
    "firstName",
    "formattedAddress",
    "id",
    "lastName",
    "line1",
    "line2",
    "phone",
    "postalCode",
    "region",
    "shippingAddress",
    "title",
    "titleCode",
    "town",
    "visibleInAddressBook"
})
public class DefaultAddress {

    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("country")
    private Country_ country;
    @JsonProperty("defaultAddress")
    private Boolean defaultAddress;
    @JsonProperty("email")
    private String email;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("formattedAddress")
    private String formattedAddress;
    @JsonProperty("id")
    private String id;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("region")
    private Region_ region;
    @JsonProperty("shippingAddress")
    private Boolean shippingAddress;
    @JsonProperty("title")
    private String title;
    @JsonProperty("titleCode")
    private String titleCode;
    @JsonProperty("town")
    private String town;
    @JsonProperty("visibleInAddressBook")
    private Boolean visibleInAddressBook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("country")
    public Country_ getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country_ country) {
        this.country = country;
    }

    @JsonProperty("defaultAddress")
    public Boolean getDefaultAddress() {
        return defaultAddress;
    }

    @JsonProperty("defaultAddress")
    public void setDefaultAddress(Boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("formattedAddress")
    public String getFormattedAddress() {
        return formattedAddress;
    }

    @JsonProperty("formattedAddress")
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("region")
    public Region_ getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region_ region) {
        this.region = region;
    }

    @JsonProperty("shippingAddress")
    public Boolean getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shippingAddress")
    public void setShippingAddress(Boolean shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    @JsonProperty("visibleInAddressBook")
    public Boolean getVisibleInAddressBook() {
        return visibleInAddressBook;
    }

    @JsonProperty("visibleInAddressBook")
    public void setVisibleInAddressBook(Boolean visibleInAddressBook) {
        this.visibleInAddressBook = visibleInAddressBook;
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
