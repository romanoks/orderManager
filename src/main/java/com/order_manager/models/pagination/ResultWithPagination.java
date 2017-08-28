package com.order_manager.models.pagination;

import com.order_manager.models.User;

import java.util.List;

public class ResultWithPagination extends  Pagination{
    public List<? extends Object> getItems() {
        return items;
    }

    public void setItems(List<? extends Object> items) {
        this.items = items;
    }

    private List<? extends Object> items;
}