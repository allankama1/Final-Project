
package com.example.abmotorss.ui.theme.screens.signup

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.data.AuthViewModel
import com.example.abmotorss.navigation.LOGIN_URL
import com.example.abmotorss.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SignupScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.signn),
                contentScale = ContentScale.FillBounds,
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Signup Here",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(30.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var surname by remember { mutableStateOf("") }
        var phonenumber by remember { mutableStateOf("") }
        var country by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Enter name") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter email") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )



        Spacer(modifier = Modifier.height(310.dp))


        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Row {


        Button(
            onClick = {
                authViewModel.signup(name, email, password)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)


        ) {
            Text(text = "Register")
        }

        Spacer(modifier = Modifier.width(17.dp))

        Button(onClick = {
            navController.navigate(LOGIN_URL)
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)

        ) {
            Text(text = "Login instead")
        }
    }

    }
}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    WazitoECommerceTheme {
        SignupScreen(navController = rememberNavController())
    }
}