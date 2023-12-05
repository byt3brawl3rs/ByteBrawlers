package com.ByteBrawlers.ByteBrawlers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.OrderDetails;

@Repository
public interface OrderInfoRepository extends JpaRepository<OrderDetails, Integer> {
}
