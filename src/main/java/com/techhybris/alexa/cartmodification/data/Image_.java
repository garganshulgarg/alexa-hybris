
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
    "altText",
    "format",
    "galleryIndex",
    "imageType",
    "url"
})
public class Image_ {

    @JsonProperty("altText")
    private String altText;
    @JsonProperty("format")
    private String format;
    @JsonProperty("galleryIndex")
    private Integer galleryIndex;
    @JsonProperty("imageType")
    private String imageType;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("altText")
    public String getAltText() {
        return altText;
    }

    @JsonProperty("altText")
    public void setAltText(String altText) {
        this.altText = altText;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("galleryIndex")
    public Integer getGalleryIndex() {
        return galleryIndex;
    }

    @JsonProperty("galleryIndex")
    public void setGalleryIndex(Integer galleryIndex) {
        this.galleryIndex = galleryIndex;
    }

    @JsonProperty("imageType")
    public String getImageType() {
        return imageType;
    }

    @JsonProperty("imageType")
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
