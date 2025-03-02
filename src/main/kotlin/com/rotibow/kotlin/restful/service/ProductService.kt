package com.rotibow.kotlin.restful.service

import com.rotibow.kotlin.restful.model.CreateProductRequest
import com.rotibow.kotlin.restful.model.ProductResponse
import com.rotibow.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest) : ProductResponse

    fun delete(id: String)

}