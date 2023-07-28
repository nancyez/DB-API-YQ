package com.YolistliQuilpalli.YolistliQuilpalli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
