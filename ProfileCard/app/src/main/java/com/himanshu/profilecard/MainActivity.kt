package com.himanshu.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.himanshu.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileCardApp(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileCardApp(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.ic_background_color))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .background(Color(0xFF073042))
                    .padding(8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.android1_logo),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
            Text(
                text = "Himanshu",
                fontSize = 48.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 16.sp,
                color = Color(0xFF006d3b),
                fontWeight = FontWeight.Bold,
            )
        }
        Column(
            modifier= Modifier
                .padding(bottom=48.dp)
        ) {
            ContactRow(
                icon = Icons.Default.Phone,
                text= "+91-70xxx-07x69",
                contentDesc = "Phone"
            )
            ContactRow(
                icon = Icons.Default.Share,
                text= "@AndroidDev",
                contentDesc = "Share"
            )
            ContactRow(
                icon = Icons.Default.Email,
                text= "himan@android.com",
                contentDesc = "Email"
            )
        }
    }
}
@Composable
fun ContactRow(
    icon: ImageVector,
    text: String,
    contentDesc: String
){
    Row(
        modifier = Modifier
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDesc,
            tint= Color(0xFF006d3b),
            modifier = Modifier.padding(end =16.dp)
        )
        Text(
            text= text,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCardTheme {
        ProfileCardApp()
    }
}
