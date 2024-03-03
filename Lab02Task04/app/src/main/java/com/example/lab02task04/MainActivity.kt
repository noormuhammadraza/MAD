package com.example.lab02task04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab02task04.ui.theme.Lab02Task04Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab02Task04Theme {
                PhotoGallery()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhotoGallery() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Lazy Grid Layout") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White
                )
            )
        }
    )
    {
        LazyVerticalGrid(modifier = Modifier
            .padding(it),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(all = 10.dp),
            columns = GridCells.Adaptive(minSize = 160.dp),
        )
        {
//            1st Row 1st Column
            item {
                Box(
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.dhaka),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp),
                        contentScale = ContentScale.FillHeight
                    )

                    Text(
                        text = "Dhaka",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(Color.Blue)
                            .padding(vertical = 10.dp, horizontal = 16.dp),
                    )
                }
            }

//            1st Row 2nd Column
            item {
                Box(
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.sundar),
                        contentDescription = null,
                        modifier = Modifier
                            .width(180.dp)
                            .height(180.dp),
                        contentScale = ContentScale.FillHeight
                    )

                    Text(
                        text = "Sundarbans",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(Color.Blue)
                            .padding(vertical = 10.dp, horizontal = 16.dp),
                    )
                }
            }

//            2nd Row 1st Column
            item {
                Box(
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.sonar),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp),
                        contentScale = ContentScale.FillHeight
                    )

                    Text(
                        text = "Sonargaon",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(Color.Blue)
                            .padding(vertical = 10.dp, horizontal = 16.dp),
                    )
                }
            }

//            2nd Row 2nd Column
            item {
                Box(
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.barisal),
                        contentDescription = null,
                        modifier = Modifier
                            .width(180.dp)
                            .height(180.dp),
                        contentScale = ContentScale.FillHeight
                    )

                    Text(
                        text = "Barisal",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(Color.Blue)
                            .padding(vertical = 10.dp, horizontal = 16.dp),
                    )
                }
            }

//            3rd Row 1st Column
            item {
                Box(
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.srimangal),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp),
                        contentScale = ContentScale.FillHeight
                    )

                    Text(
                        text = "Srimangal",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(Color.Blue)
                            .padding(vertical = 10.dp, horizontal = 16.dp),
                    )
                }
            }

//            3rd Row 2nd Column
            item {
                Box(
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.chitta),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp),
                        contentScale = ContentScale.FillHeight
                    )

                    Text(
                        text = "Chittagong",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(Color.Blue)
                            .padding(vertical = 10.dp, horizontal = 16.dp),
                    )
                }
            }

        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab02Task04Theme {
        PhotoGallery()
    }
}