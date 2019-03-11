package com.globomatics.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomatics.bike.models.Bike;

public interface BykeRepository extends JpaRepository<Bike, Long> {

}
