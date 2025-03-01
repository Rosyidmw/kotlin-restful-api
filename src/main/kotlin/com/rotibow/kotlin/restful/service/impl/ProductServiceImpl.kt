package com.rotibow.kotlin.restful.service.impl

import com.rotibow.kotlin.restful.entity.Product
import com.rotibow.kotlin.restful.model.CreateProductRequest
import com.rotibow.kotlin.restful.model.ProductResponse
import com.rotibow.kotlin.restful.repository.ProductRepository
import com.rotibow.kotlin.restful.service.ProductService
import com.rotibow.kotlin.restful.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository,
    val validationUtil: ValidationUtil
) : ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
            id = createProductRequest.id!!,
            name = createProductRequest.name!!,
            price = createProductRequest.price!!,
            quantity = createProductRequest.quantity!!,
            createdAt = Date(),
            updateAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updateAt = product.updateAt
        )
    }
}