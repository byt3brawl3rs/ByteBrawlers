package com.ByteBrawlers.ByteBrawlers.Model;

import com.ByteBrawlers.ByteBrawlers.Utility.CompositKeys.OrderInfoId;
import jakarta.persistence.*;

@Entity
@Table
@IdClass(OrderInfoId.class)
public class OrderDetails {
    @Id
    private Integer orderId;

    @Id
    private Integer itemId;

    @Column
    private Integer quantity;

    public OrderDetails() {
    }

    public OrderDetails(Integer orderId, Integer itemId, Integer quantity) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                ", quantity=" + quantity +
                '}';
    }
}