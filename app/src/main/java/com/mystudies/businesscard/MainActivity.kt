package com.mystudies.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mystudies.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(210, 232, 212)),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DeCard(name = "Charan Manikanta N", "Android Developer Expert")
        Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        Details()
    }
}

@Composable
fun DeCard(name: String, role: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color(210,232,212))
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            Modifier
                .background(Color(7, 48, 66))
                .width(120.dp)
        )
        Text(
            text = name,
            fontSize = 32.sp,
            modifier = Modifier.padding(top = 16.dp),
        )
        Text(
            text = role,
            color = Color(23, 121, 72),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}

@Composable
fun DetailBar(icon: ImageVector, value: String) {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            icon, contentDescription = null,
            Modifier.padding(8.dp),
            tint = Color(23, 121, 72)
        )
        Text(text = value, Modifier.padding(8.dp))
    }
}

@Composable
fun Details() {
    Column {
        DetailBar(
            icon = Icons.Rounded.Share,
            value = "bio.link/charanmanikanta"
        )
        DetailBar(
            icon = Icons.Rounded.Email,
            value = "charan.manikanta.n@gmail.com"
        )
        DetailBar(
            icon = Icons.Rounded.Phone,
            value = "+91 91335 32836"
        )
        Spacer(modifier = Modifier.padding(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DetailBarPreview() {
    Details()
}


@Preview(showBackground = true)
@Composable
fun DeCardPreview() {
    DeCard("Charan Manikanta N", "Android Developer Expert")
}


