package com.ByteBrawlers.ByteBrawlers.Utility.CompositKeys;

import java.io.Serializable;

public class OrderInfoId implements Serializable {

    private Integer orderId;
    private Integer itemId;

    public OrderInfoId(Integer orderID, Integer itemId) {
        this.orderId = orderID;
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
