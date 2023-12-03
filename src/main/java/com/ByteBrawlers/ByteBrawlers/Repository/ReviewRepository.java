package com.ByteBrawlers.ByteBrawlers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Integer> {
}
