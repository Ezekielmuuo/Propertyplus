package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ADD_PRODUCTS_URL
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplus.ui.theme.newPurple


@Composable
fun DashboardScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "PropertyPlus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.width(5.dp))
        Image(
            painter = painterResource(id = R.drawable.icon3),
            contentDescription ="home",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
        )
        Text(
            text = "Manage your property",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(newPurple)

            ){
                //Row 1
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(200.dp)
                        .clickable {
                            navController.navigate(ROUT_HOME)
                        },
                        elevation = CardDefaults.cardElevation(10.dp)){

                        Column {
                            Spacer(modifier = Modifier.width(10.dp))
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(
                                    painter = painterResource(id = R.drawable.icon2),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(100.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )


                        }

                    }
                    //end of card

                    //card 2
                    Spacer(modifier = Modifier.width(20.dp))
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(200.dp)
                        .clickable {
                            navController.navigate(ROUT_PROPERTY)
                        },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){

                        Column {
                            Spacer(modifier = Modifier.width(10.dp))
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(
                                    painter = painterResource(id = R.drawable.property),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(100.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Property",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )


                        }

                    }
                    //end of card
                }
                //End of row 1

                //Row 2
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(200.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){

                        Column {
                            Spacer(modifier = Modifier.width(10.dp))
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(
                                    painter = painterResource(id = R.drawable.settings),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(100.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Settings",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )


                        }

                    }
                    //end of card

                    //card 2
                    Spacer(modifier = Modifier.width(20.dp))
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(200.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){

                        Column {
                            Spacer(modifier = Modifier.width(10.dp))
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(
                                    painter = painterResource(id = R.drawable.profileicon),
                                    contentDescription ="Details",
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(100.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Profile",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )


                        }

                    }
                    //end of card
                }
                //End of row 2

                //Row 3
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(200.dp)
                        .clickable {
                            navController.navigate(VIEW_PRODUCTS_URL)
                        },){

                        Column {
                            Spacer(modifier = Modifier.width(10.dp))
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(
                                    painter = painterResource(id = R.drawable.icon2),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(100.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "View Products",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )


                        }

                    }
                    //end of card

                    //card 2
                    Spacer(modifier = Modifier.width(20.dp))
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(200.dp)
                        .clickable {
                            navController.navigate(ADD_PRODUCTS_URL)
                        },){

                        Column {
                            Spacer(modifier = Modifier.width(10.dp))
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(
                                    painter = painterResource(id = R.drawable.details),
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(100.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Add Products",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )


                        }

                    }
                    //end of card
                }
                //End of row 3









            }


        }









    }



}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}

