
package com.techhybris.alexa.product.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductSearchResult {

    private String type;
    private List<Object> breadcrumbs = null;
    private CurrentQuery currentQuery;
    private List<Facet> facets = null;
    private String freeTextSearch;
    private Pagination pagination;
    private List<Product> products = null;
    private List<Sort> sorts = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setBreadcrumbs(List<Object> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    public CurrentQuery getCurrentQuery() {
        return currentQuery;
    }

    public void setCurrentQuery(CurrentQuery currentQuery) {
        this.currentQuery = currentQuery;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public String getFreeTextSearch() {
        return freeTextSearch;
    }

    public void setFreeTextSearch(String freeTextSearch) {
        this.freeTextSearch = freeTextSearch;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Sort> getSorts() {
        return sorts;
    }

    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
