package com.example.propertyplus.ui.theme.screens.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.ui.theme.Purple40
import com.example.propertyplus.ui.theme.newPurple
import com.example.propertyplus.ui.theme.newYellow
import com.example.propertyplus.ui.theme.screens.property.bottomNavItems



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun IntentScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = newPurple
                ) {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    androidx.compose.material3.Icon(
                                        imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title
                                    )
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },
            topBar = {
                TopAppBar(title = { Text(text = "Property Plus", fontFamily = FontFamily.Cursive, fontSize = 40.sp, color = (newPurple)) },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(newYellow),

                    )
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "menu"
                        )
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 80.dp, start = 20.dp),

                    ){
                    Spacer(modifier = Modifier.height(20.dp))

                    //start of row
                    Row {
                        //card1
                        Card (modifier = Modifier
                            .height(130.dp)
                            .width(100.dp) ){
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                                Image(painter = painterResource(id = R.drawable.home) ,
                                    contentDescription ="home",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )

                                androidx.compose.material3.Icon(imageVector = Icons.Default.Favorite,
                                    contentDescription ="favourite",
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .padding(10.dp),
                                    tint = Color.Red

                                )


                            }

                        }
                        //end of card1

                        Card (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
                            Text(text = "Visit Lavington", fontSize = 20.sp)
                            Text(text = "The best property you can find!")
                            Row {
                                androidx.compose.material3.Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = newYellow, modifier = Modifier.size(30.dp))
                                androidx.compose.material3.Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = newYellow, modifier = Modifier.size(30.dp))
                                androidx.compose.material3.Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = newYellow, modifier = Modifier.size(30.dp))
                                androidx.compose.material3.Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = newPurple, modifier = Modifier.size(30.dp))
                                androidx.compose.material3.Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = newPurple, modifier = Modifier.size(30.dp))
                            }
                            Text(text = "54,780 reviews", color = Purple40)
                            Button(
                                onClick = {
                                },
                                colors = ButtonDefaults.buttonColors(),
                                shape= RoundedCornerShape(10.dp)
                            ) {
                                Text(text = "Call")

                            }

                        }
                    }

                    //end of row

                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current

                    Button(onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "mPESA")

                    }
                    Spacer(modifier = Modifier.height(10.dp))


                    Button(onClick = {
                        val smsIntent= Intent(Intent.ACTION_SENDTO)
                        smsIntent.data="smsto:0757969665".toUri()
                        smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                        mContext.startActivity(smsIntent)
                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "SMS")

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Button(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0757969665".toUri()
                        mContext.startActivity(callIntent)

                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Call")

                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)
                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Email")

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Button(onClick = {
                        val shareIntent= Intent(Intent.ACTION_SEND)
                        shareIntent.type="text/plain"
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                        mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Share")

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Button(onClick = {
                        val cameraIntent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                        if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                            mContext.startActivity(cameraIntent)
                        }else{
                            println("Camera app is not available")
                        }
                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Camera")

                    }

                }

            }

        )

    }



}

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Details",
        route="details",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Property",
        route="property",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=1
    ),
    BottomNavItem(
        title = "About",
        route="about",
        selectedIcon=Icons.Filled.ShoppingCart,
        unselectedIcon=Icons.Outlined.ShoppingCart,
        hasNews = true,
        badges=1
    ),



    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)


@Composable
@Preview(showBackground = true)
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}

