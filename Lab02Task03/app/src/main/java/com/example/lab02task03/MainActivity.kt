package com.example.lab02task03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab02task03.ui.theme.Lab02Task03Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab02Task03Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskThree()
                }
            }
        }
    }
}

@Composable
fun TaskThree() {
//    Images remaining
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    )
    {
        var rowElevation = 6.dp
        var contentHeight = 92.dp
        var imagePadding = 12.dp
//        First Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .padding(all = imagePadding)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

//        Second Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .clip(RoundedCornerShape(16.dp))
                            .padding(all = imagePadding)
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
//                    .background(Color.Yellow)
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

//        Third Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .clip(RoundedCornerShape(16.dp))
                            .padding(all = imagePadding)
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
//                    .background(Color.Yellow)
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

//        Fourth Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .clip(RoundedCornerShape(16.dp))
                            .padding(all = imagePadding)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

//        Fifth Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .clip(RoundedCornerShape(16.dp))
                            .padding(all = imagePadding)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

//        Sixth Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .clip(RoundedCornerShape(16.dp))
                            .padding(all = imagePadding)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

//        Seventh Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(Color.White)
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 2.dp, color = Color.White)
                    .height(contentHeight),
                elevation = CardDefaults.cardElevation(defaultElevation = rowElevation),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Image(painter = painterResource(id = R.drawable.ironman),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 90.dp, height = contentHeight)
                            .clip(RoundedCornerShape(16.dp))
                            .padding(all = imagePadding)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(contentHeight),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Iron Man",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                        Text(text = "Age: 43",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab02Task03Theme {
        TaskThree()
    }
}