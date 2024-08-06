package com.example.propertyplus.ui.theme.screens.details

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.ui.theme.newYellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()){
//top up bar
        TopAppBar(title = { Text(text = "Property Plus") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(newYellow),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = androidx.compose.ui.graphics.Color.Magenta
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notifications",
                        tint = androidx.compose.ui.graphics.Color.Magenta
                    )

                }
            }

        )

        Box (modifier = Modifier
            .height(280.dp)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center

        ){
            Image(
                painter = painterResource(id = com.example.propertyplus.R.drawable.home),
                contentDescription ="home",
                modifier = Modifier.fillMaxSize()
            )



        }
        Spacer(modifier = Modifier.height(20.dp))
//search bar
        var search by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = search ,
            onValueChange ={ search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search")},
            placeholder = { Text(text = "Whats your location?")}

        )
//end of searchbar

        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .horizontalScroll(rememberScrollState())
        ){
            //card 1
            Card (modifier = Modifier.height(180.dp).width(200.dp)){

                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),

                    contentAlignment = Alignment.Center

                ){
                    Image(
                        painter = painterResource(id = com.example.propertyplus.R.drawable.home),
                        contentDescription ="home",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                    )

                }}

                Spacer(modifier = Modifier.width(40.dp))
            //Card 2
                Card (modifier = Modifier.height(180.dp).width(200.dp)){

                    Box (modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),

                        contentAlignment = Alignment.Center

                    ){
                        Image(
                            painter = painterResource(id = com.example.propertyplus.R.drawable.img),
                            contentDescription ="home",
                            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                        )

                    }

                }
                Spacer(modifier = Modifier.width(40.dp))
                //card 3
                Card (modifier = Modifier.height(180.dp).width(200.dp)){

                    Box (modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),

                        contentAlignment = Alignment.Center

                    ){
                        Image(
                            painter = painterResource(id = com.example.propertyplus.R.drawable.img_1),
                            contentDescription ="home",
                            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                        )



                    }

                }
                Spacer(modifier = Modifier.width(40.dp))
                //card 4
                Card (modifier = Modifier.height(180.dp).width(200.dp)){

                    Box (modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),

                        contentAlignment = Alignment.Center

                    ){
                        Image(
                            painter = painterResource(id = com.example.propertyplus.R.drawable.img_2),
                            contentDescription ="home",
                            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                        )



                    }

                }
                Spacer(modifier = Modifier.width(40.dp))
                //card 5
                Card (modifier = Modifier.height(180.dp).width(200.dp)){

                    Box (modifier = Modifier
                        .height(180.dp)
                        .width(200.dp),

                        contentAlignment = Alignment.Center

                    ){
                        Image(
                            painter = painterResource(id = com.example.propertyplus.R.drawable.img_3),
                            contentDescription ="home",
                            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                        )



                    }

                }

            }






        }

}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}



