package com.example.propertyplus.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_DETAILS
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.ROUT_SIGNUP
import com.example.propertyplus.ui.theme.newPurple


@Composable
fun LoginScreen(navController: NavController){


    Column (modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.FillBounds),

        horizontalAlignment = Alignment.CenterHorizontally

        ){
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.property),
            contentDescription = "property",
            modifier = Modifier
                .size(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Welcome back!",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Already have an account. Please enter your credentials",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = email ,
            onValueChange = {email = it},
            label = { Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "" , tint = newPurple) },
            keyboardOptions = KeyboardOptions(  keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password ,
            onValueChange = {password = it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "" , tint = newPurple) },
            keyboardOptions = KeyboardOptions(  keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { navController.navigate(ROUT_DETAILS) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(newPurple),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "LOGIN")
        }
        Text(
            text = "Don't have an account? Register",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )










    }

}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}

