package screens.auth

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import data.remote.product.ProductService
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class LoginScreenModel : ScreenModel, KoinComponent {
    private val productService by inject<ProductService>()

    fun testApi() {
        screenModelScope.launch {
            productService.getProducts()
        }
    }
}