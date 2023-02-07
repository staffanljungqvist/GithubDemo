package com.example.githubdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubdemo.ui.theme.GithubDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GithubDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun LoginScreen() {
    Box(Modifier.fillMaxSize()) {
        Text("Hänvisar till stringresurs")
    }
}

@Composable
fun Greeting(name: String) {
    //lite ändringar
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
    Text(text = "hej hej hej $name!")
    //Hello from develop
}
