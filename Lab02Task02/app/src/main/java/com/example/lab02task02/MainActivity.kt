package com.example.lab02task02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab02task02.ui.theme.Lab02Task02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab02Task02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskTwo()
                }
            }
        }
    }
}

@Composable
fun TaskTwo() {
//    Done
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(modifier = Modifier
            .fillMaxWidth()
//            .border(width = 1.dp, color = Color.Black)
        )
        {
            var imageWidth = 100.dp
            var imageHeight = 126.dp
            Image(painter = painterResource(id = R.drawable.ironman),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(width = imageWidth, height = imageHeight)
                    .clip(RoundedCornerShape(20.dp))
                    .padding(all = 2.dp)

            )
            Column(modifier = Modifier.weight(1F),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                var userName by remember {
                    mutableStateOf("")
                }
                var userPhoneNumber by remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = userName,
                    onValueChange = {userName = it},
                    label = { Text(text = "Name")},
                )
                OutlinedTextField(
                    value = userPhoneNumber,
                    onValueChange = {userPhoneNumber = it},
                    label = { Text(text = "Phone Number")},
                )

            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab02Task02Theme {
        TaskTwo()
    }
}