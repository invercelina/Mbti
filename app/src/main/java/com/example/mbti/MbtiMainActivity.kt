package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mbti.ui.theme.MbtiTheme

class MbtiMainActivity : ComponentActivity() {
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
        val context = LocalContext.current as? Activity
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .border(10.dp, Color.LightGray)

        ) {

            Image(
                painter = painterResource(id = R.drawable.infp),
                contentDescription = "INFP",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp)
            )
            Button(onClick = {
                val intent = Intent(context, InfpActivity::class.java)
                context?.startActivity(intent)
            }, modifier = Modifier.padding(top = 10.dp, bottom = 30.dp)) {
                Text(text = "INFP")
            }
            Image(
                painter = painterResource(id = R.drawable.isfp),
                contentDescription = "ISFP",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp)
            )
            Button(onClick = {
                val intent = Intent(context, IsfpActivity::class.java)
                context?.startActivity(intent)
            }, modifier = Modifier.padding(top = 10.dp, bottom = 30.dp)) {
                Text(text = "ISFP")
            }
            Image(
                painter = painterResource(id = R.drawable.enfp),
                contentDescription = "ENFP",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp)
            )
            Button(onClick = {
                val intent = Intent(context, EnfpActivity::class.java)
                context?.startActivity(intent)
            }, modifier = Modifier.padding(top = 10.dp, bottom = 30.dp)) {
                Text(text = "ENFP")
            }

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MainScreenPreview() {
        MbtiTheme {
            MainScreen()
        }
    }
}