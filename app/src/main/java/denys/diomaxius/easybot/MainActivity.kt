package denys.diomaxius.easybot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import denys.diomaxius.easybot.ui.ChatPage
import denys.diomaxius.easybot.ui.ChatViewModel
import denys.diomaxius.easybot.ui.theme.EasyBotTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(35)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val chatViewModel = ViewModelProvider(this)[ChatViewModel::class.java]
        setContent {
            EasyBotTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    ChatPage(
                        modifier = Modifier.padding(innerPadding),
                        chatViewModel = chatViewModel
                    )
                }
            }
        }
    }
}