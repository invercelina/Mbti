package com.example.mbti

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbti.ui.theme.MbtiTheme

class IsfpActivity : ComponentActivity() {
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
            modifier = Modifier.fillMaxHeight()
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            Image(
                painter = painterResource(id = R.drawable.isfp),
                contentScale = ContentScale.Crop,
                contentDescription = "ISFP",
                modifier = Modifier.size(250.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "ISFP",
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxWidth(),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .border(2.dp, Color.Yellow, RoundedCornerShape(5.dp))
                    .padding(20.dp)
            ) {
                Text(
                    text = "모험가",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "항상 새로운 경험을 추구하는 유연하고 매력 넘치는 예술가입니다.",
                    modifier = Modifier
                        .height(200.dp)
                        .width(250.dp)
                        .padding(30.dp),
                    fontSize = 20.sp
                )

            }

            val context = LocalContext.current as? Activity
            Button(onClick = {
                context?.finish()
            }, modifier = Modifier.padding(48.dp)) {
                Text(text = "이전으로")
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