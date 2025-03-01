package com.rotibow.kotlin.restful.repository

import com.rotibow.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {

}