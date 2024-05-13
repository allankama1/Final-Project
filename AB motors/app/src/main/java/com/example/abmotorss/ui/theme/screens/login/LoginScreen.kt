package com.example.abmotorss.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.data.AuthViewModel
import com.example.abmotorss.navigation.HOME_URL
import com.example.abmotorss.navigation.SIGNUP_URL
import com.example.abmotorss.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.fd),
                contentScale = ContentScale.FillBounds,
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Login ",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Left
        )
        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var name by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value =name,
            onValueChange = {name = it},
            label = { Text(text = "Name")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )


        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value =email,
            onValueChange = {email= it},
            label = { Text(text = "Email")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter password")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(350.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(
            onClick = {navController.navigate(HOME_URL)
                },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)


        ) {
            Text(text = "Guest",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,

                        fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(8.dp))




        Row {
            Button(
                onClick = {navController.navigate(HOME_URL)
                    authViewModel.login(email, password) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)


            ) {
                Text(text = " Login",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
,
                            fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = {
                navController.navigate(SIGNUP_URL)
            },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
            ) {
                Text(text = "Register.",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
,
                            fontSize = 16.sp)
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    WazitoECommerceTheme {
        LoginScreen(navController = rememberNavController())
    }
}