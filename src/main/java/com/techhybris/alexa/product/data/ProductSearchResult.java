
package com.techhybris.alexa.product.data;

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
    "type",
    "breadcrumbs",
    "currentQuery",
    "facets",
    "freeTextSearch",
    "pagination",
    "products",
    "sorts"
})
public class ProductSearchResult {

    @JsonProperty("type")
    private String type;
    @JsonProperty("breadcrumbs")
    private List<Object> breadcrumbs = null;
    @JsonProperty("currentQuery")
    private CurrentQuery currentQuery;
    @JsonProperty("facets")
    private List<Facet> facets = null;
    @JsonProperty("freeTextSearch")
    private String freeTextSearch;
    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("sorts")
    private List<Sort> sorts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("breadcrumbs")
    public List<Object> getBreadcrumbs() {
        return breadcrumbs;
    }

    @JsonProperty("breadcrumbs")
    public void setBreadcrumbs(List<Object> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    @JsonProperty("currentQuery")
    public CurrentQuery getCurrentQuery() {
        return currentQuery;
    }

    @JsonProperty("currentQuery")
    public void setCurrentQuery(CurrentQuery currentQuery) {
        this.currentQuery = currentQuery;
    }

    @JsonProperty("facets")
    public List<Facet> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    @JsonProperty("freeTextSearch")
    public String getFreeTextSearch() {
        return freeTextSearch;
    }

    @JsonProperty("freeTextSearch")
    public void setFreeTextSearch(String freeTextSearch) {
        this.freeTextSearch = freeTextSearch;
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("sorts")
    public List<Sort> getSorts() {
        return sorts;
    }

    @JsonProperty("sorts")
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
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
