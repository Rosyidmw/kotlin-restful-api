package com.rotibow.kotlin.restful.service

import com.rotibow.kotlin.restful.model.CreateProductRequest
import com.rotibow.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

}