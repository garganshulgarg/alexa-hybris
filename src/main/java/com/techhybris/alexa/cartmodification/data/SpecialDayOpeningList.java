
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
    "closed",
    "closingTime",
    "comment",
    "date",
    "formattedDate",
    "name",
    "openingTime"
})
public class SpecialDayOpeningList {

    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("closingTime")
    private ClosingTime closingTime;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("date")
    private String date;
    @JsonProperty("formattedDate")
    private String formattedDate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("openingTime")
    private OpeningTime openingTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("closingTime")
    public ClosingTime getClosingTime() {
        return closingTime;
    }

    @JsonProperty("closingTime")
    public void setClosingTime(ClosingTime closingTime) {
        this.closingTime = closingTime;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("openingTime")
    public OpeningTime getOpeningTime() {
        return openingTime;
    }

    @JsonProperty("openingTime")
    public void setOpeningTime(OpeningTime openingTime) {
        this.openingTime = openingTime;
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
