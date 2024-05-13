package com.example.mbti

import android.app.Activity
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


class LastActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            MbtiTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        val context = LocalContext.current as? Activity
        Button(onClick = {
            context?.finish()
        }, modifier = Modifier.padding(20.dp)) {
            Text(text = "닫기")
        }
    }
}
