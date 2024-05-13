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
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbti.ui.theme.MbtiTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class InfpActivity : ComponentActivity() {
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
            horizontalAlignment = CenterHorizontally,
            modifier = Modifier.fillMaxHeight()
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            Image(
                painter = painterResource(id = R.drawable.infp),
                contentScale = ContentScale.Crop,
                contentDescription = "INFP",
                modifier = Modifier.size(250.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "INFP",
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxWidth(),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .border(2.dp, Color.Green, RoundedCornerShape(5.dp))
                    .padding(20.dp)
            ) {
                Text(
                    text = "중재자",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "항상 선을 행할 준비가 되어 있는 부드럽고 친절한 이타주의자입니다.",
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