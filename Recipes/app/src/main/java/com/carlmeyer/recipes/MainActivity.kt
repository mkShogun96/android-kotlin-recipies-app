package com.carlmeyer.recipes

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .background(color = Color(0xFFF2F2F2))
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "Happy Meal Small",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.height(300.dp)
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy Meal", style = TextStyle(
                                fontSize = 26.sp,
                            )
                        )
                        Text(
                            text = "$5.99", style = TextStyle(
                                fontSize = 17.sp,
                                color = Color(0xFF85BB65)
                            )
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 Calories", style = TextStyle(
                            fontSize = 17.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Order Now!")
                        }
                    }

                }
            }
        }
    }
}
  

