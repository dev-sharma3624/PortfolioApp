package com.example.portfolioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portfolioapp.ui.theme.PortfolioAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortfolioAppTheme {
                Background()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Background(){

    //Back Panel
    Column (modifier = Modifier.fillMaxSize()) {

        //Upper Column
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xff29c47c),
                            Color(0xff29b2c4)
                        )
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            //Text
            Text(
                text = "Dev Sharma",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(4.dp)
            )

            Text(
                text = "App Developer",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 16.sp,
                modifier = Modifier.padding(4.dp)
            )

            Row(
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    text = "Delhi, India",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp
                )
            }

        }

        //Lower Column
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffe6e0df))
                .padding(16.dp)
        ) {

            Spacer(modifier = Modifier.padding(top = 100.dp))

            Text(
                text = "About Me",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Text(
                text = "Hi, I’m an App Developer and Tech Enthusiast. I’m passionate " +
                        "about transforming ideas into reality through code and thrive on" +
                        " the problem-solving process. My perfectionist nature drives me to " +
                        "create high-quality applications and seek out innovative solutions. " +
                        "Eureka moments: when code clicks and vision unfolds. I’m always eager " +
                        "to learn, grow, and connect with others in the tech community.",
                fontSize = 16.sp,
                fontFamily = FontFamily.SansSerif
            )

        }

    }

    //Image Circle
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
        contentAlignment = Alignment.BottomCenter
    ){
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(155.dp)
                .border(6.dp, Color.White, shape = CircleShape)
        )
    }

    /*//Outer Column
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //Upper Column
        Column(
            modifier = Modifier
                .weight(2f)
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xff29c47c), Color(0xff29b2c4)
                        )
                    )
                ),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Dev Sharma",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp)
                )

                Text(
                    text = "App Developer",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(4.dp)
                )

                Row(
                    modifier = Modifier.padding(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(
                        text = "Delhi, India",
                        color = Color.White,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .height(160.dp)
                    .width(160.dp)
                    .background(Color.Black, CircleShape)
            ){
                Image(
                    painter = painterResource(id = R.drawable.profile_image),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(155.dp)
                )
            }
        }



        //Lower Column
        Column (
            modifier = Modifier
                .weight(3f)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
        }

    }*/
}

