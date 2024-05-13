package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MbtiTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        val context = LocalContext.current       //혹시나 화면 바껴있을 가능성 때문에 MainActivity.this 대신
        Button(onClick = {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.padding(vertical = 50.dp)) {
            Text(text = "다음 화면")
        }
    }
}


