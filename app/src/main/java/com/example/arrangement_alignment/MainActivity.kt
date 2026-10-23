package com.example.arrangement_alignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.arrangement_alignment.ui.theme.Arrangement_AlignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Arrangement_AlignmentTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box( modifier = Modifier.padding(innerPadding)){
//                        RowArrangement()
//                        Spacer(modifier = Modifier.padding(16.dp))
//                        ColumnArrangement()
//                        Spacer(modifier = Modifier.padding(16.dp))
                        RowAlignment()
                        Spacer(modifier = Modifier.padding(16.dp))
                        ColumnAlignment()

                    }
                }
            }
        }
    }
}

@Composable
fun RowArrangement(){
    Row (
//        horizontalArrangement = Arrangement.Start,
//        horizontalArrangement = Arrangement.Center,
//        horizontalArrangement = Arrangement.End,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        horizontalArrangement = Arrangement.SpaceEvenly,
        horizontalArrangement = Arrangement.SpaceAround,

        modifier = Modifier
            .padding(top = 30.dp)
            .fillMaxWidth()
    ){
        Text(
            text = "Row 1",
            color = Color.Red,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Red, shape = RectangleShape)
                .padding(8.dp)

        )
        Text(
            text = "Row 2",
            color = Color.Blue,
            fontSize = 12.sp,

            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Blue, shape = RectangleShape)
                .padding(8.dp)


        )
        Text(
            text = "Row 3",
            color = Color.Green,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Green, shape = RectangleShape)
                .padding(8.dp)


        )

    }

}

@Composable
fun ColumnArrangement(){
    Column (
//        verticalArrangement = Arrangement.Top,
//        verticalArrangement = Arrangement.Center,
//        verticalArrangement = Arrangement.Bottom,
//        verticalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = Arrangement.SpaceEvenly,
//        verticalArrangement = Arrangement.SpaceAround,

        modifier = Modifier

            .fillMaxSize()
    ){
        Text(
            text = "Column 1",
            color = Color.Red,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Red, shape = RectangleShape)
                .padding(8.dp)


        )
        Text(
            text = "Column 2",
            color = Color.Blue,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Blue, shape = RectangleShape)
                .padding(8.dp)


        )
        Text(
            text = "Column 3",
            color = Color.Green,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Green, shape = RectangleShape)
                .padding(8.dp)

        )

    }

}

@Composable
fun RowAlignment(){
    Row (
//        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.Bottom,
        verticalAlignment = Alignment.CenterVertically,


        modifier = Modifier
            .padding(start = 16.dp, top = 60.dp)
            .fillMaxSize()

    ){
        Text(
            text = "Row1",
            color = Color.Red,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Red, shape = RectangleShape)

        )
        Text(
            text = "Row2",
            color = Color.Blue,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Blue, shape = RectangleShape)

        )
        Text(
            text = "Row3",
            color = Color.Green,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Green, shape = RectangleShape)

        )

    }

}

@Composable
fun ColumnAlignment(){
    Column (
//        horizontalAlignment = Alignment.Start,
//        horizontalAlignment = Alignment.End,
        horizontalAlignment = Alignment.CenterHorizontally,


        modifier = Modifier
            .fillMaxWidth()

    ){
        Text(
            text = "Column1",
            color = Color.Red,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Red, shape = RectangleShape)

        )
        Text(
            text = "Column2",
            color = Color.Blue,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Blue, shape = RectangleShape)

        )
        Text(
            text = "Column3",
            color = Color.Green,
            modifier = Modifier
                .padding(8.dp)
                .border(width = 2.dp,Color.Green, shape = RectangleShape)

        )

    }

}
@Preview(showBackground = true)
@Composable
fun Preview(){
    Arrangement_AlignmentTheme {
        ColumnArrangement()
        ColumnAlignment()
//        RowArrangement()
//        RowAlignment()
    }
}
