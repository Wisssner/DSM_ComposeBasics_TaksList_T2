package com.example.takslist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.takslist.ui.theme.TaksListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaksListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        message = stringResource(R.string.text_1_bold),
                        from = stringResource(R.string.text2),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String,from: String,modifier: Modifier=Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    Image(
        painter = image, contentDescription = null
    )
}
@Composable
fun GreetingText(message: String, from: String,modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column ( modifier=Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = image, contentDescription = null,

        )

        Text(
            text = message,
            fontWeight = FontWeight.Bold,
            modifier=Modifier
                .padding(top = 24.dp)
                .padding(bottom = 8.dp)

        )
        Text(
            text = from,
            fontSize = 16.sp
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaksListTheme {
        GreetingText("All tasks completed","Nice work!")
    }
}