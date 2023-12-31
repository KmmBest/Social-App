package di

import data.remote.product.ProductService
import data.remote.user.UserService
import org.koin.dsl.module

val serviceModule = module {
    single { UserService() }
    single { ProductService() }
}