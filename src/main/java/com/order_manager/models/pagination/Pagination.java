package com.order_manager.models.pagination;

import org.springframework.beans.factory.annotation.Value;

public class Pagination {
    private Integer page;
    private String filter;
    private String sort_field = "uuid";
    private String sort = "asc";
    private Integer limit = 30;
    private Integer count;
    private Integer offset = 0;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSort_field() {
        return sort_field;
    }

    public void setSort_field(String sort_field) {
        this.sort_field = sort_field;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}