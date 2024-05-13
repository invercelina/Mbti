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

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .border(10.dp, Color.LightGray)

        ) {

            Painting(paintId = R.drawable.infp)
            MbtiButton(str = "INFP")
            Painting(paintId = R.drawable.isfp)
            MbtiButton(str = "ISFP")
            Painting(R.drawable.enfp)
            MbtiButton(str = "ENFP")

        }


    }
    @Composable
    fun MbtiButton(str:String) {
        val context = LocalContext.current as? Activity
        Button(onClick = {
            val intent = Intent(context, MbtiDescActivity::class.java)
            intent.putExtra("mbtiData",str)
            context?.startActivity(intent)
        }, modifier = Modifier.padding(top = 10.dp, bottom = 30.dp)) {
            Text(text = str)
        }

    }

    @Composable
    fun Painting(paintId :Int) {
        Image(
            painter = painterResource(id = paintId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(150.dp)
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun MainScreenPreview() {
        MbtiTheme {
            MainScreen()
        }
    }
}