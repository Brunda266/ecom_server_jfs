package com.mtd.ecom_server.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtd.ecom_server.models.Product;

public interface Product_Repo extends MongoRepository<Product, String> {

}
