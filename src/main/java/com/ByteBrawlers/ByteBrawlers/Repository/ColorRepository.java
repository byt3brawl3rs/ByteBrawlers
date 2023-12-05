package com.ByteBrawlers.ByteBrawlers.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
}
