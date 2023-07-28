package com.YolistliQuilpalli.YolistliQuilpalli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers_Pay;

@Repository
public interface Customers_PayRepository extends JpaRepository<Customers_Pay, Long> {

}
