package screens.main.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import io.ktor.client.HttpClient
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import screens.auth.LoginScreen
import shared.UIComposable

class HomeScreen : Tab, UIComposable, KoinComponent {

    private val httpClient by inject<HttpClient>()

    @OptIn(ExperimentalResourceApi::class)
    override val options: TabOptions
        @Composable get() = TabOptions(
            index = 0u,
            icon = painterResource("bottomNavIcon/home.xml"),
            title = "Home",
        )

    @Composable
    override fun Content() {
        Render()
    }


    @Composable
    override fun Render() {
        val greetingText by remember { mutableStateOf("screens.main.home") }
        val navigator = LocalNavigator.currentOrThrow

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navigator.parent?.push(LoginScreen())
            }) {
                Text("$greetingText!")
            }
        }

    }
}