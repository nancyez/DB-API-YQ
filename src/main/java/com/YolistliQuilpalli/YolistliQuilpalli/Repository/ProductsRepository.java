package com.YolistliQuilpalli.YolistliQuilpalli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.YolistliQuilpalli.YolistliQuilpalli.Entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
