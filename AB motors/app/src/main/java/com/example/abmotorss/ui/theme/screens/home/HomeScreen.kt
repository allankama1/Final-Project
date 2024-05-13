package com.example.abmotorss.ui.theme.screens.home


import android.widget.Toast
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint

import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.navigation.AUDI_URL
import com.example.abmotorss.navigation.BM_URL
import com.example.abmotorss.navigation.FORD_URL
import com.example.abmotorss.navigation.ISU_URL
import com.example.abmotorss.navigation.JEEP_URL
import com.example.abmotorss.navigation.LAND_URL
import com.example.abmotorss.navigation.LEX_URL
import com.example.abmotorss.navigation.MERC_URL
import com.example.abmotorss.navigation.MIT_URL
import com.example.abmotorss.navigation.NISS_URL

import com.example.abmotorss.navigation.SPLASH_URL
import com.example.abmotorss.navigation.SUB_URL
import com.example.abmotorss.navigation.TOY_URL
import com.example.abmotorss.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(modifier = Modifier
        .paint(
            painterResource(id = R.drawable.de),
            contentScale = ContentScale.FillBounds,
        )
        .fillMaxSize()
        .verticalScroll(rememberScrollState()
        )

    ){


        Spacer(modifier = Modifier.height(20.dp))

        Row( modifier = Modifier.padding(start = 20.dp)) {
            Column {
                Text(
                    text = "AB motors",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Gray,
                    fontFamily = FontFamily.Serif
                )
                Text(text = "Keep the motion")
            }
            Spacer(modifier = Modifier.width(100.dp))

        }//End Row
        Spacer(modifier = Modifier.height(20.dp))


        //cards columns start
        Column(modifier = Modifier.padding(start = 20.dp)) {


            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate(TOY_URL )
                        Toast.makeText(mContext,"Go to Toyota screen",
                            Toast.LENGTH_SHORT).show()

                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.to),
                            contentDescription = "amazon",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Toyota",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card


                Card (modifier = Modifier.
                clickable {
                    navController.navigate(LEX_URL )
                    Toast.makeText(mContext,"Go to Mercedes screen",
                        Toast.LENGTH_SHORT).show()

                }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.merce),
                            contentDescription = "Mercedes",
                            modifier = Modifier.size(300.dp)
                        )
                        Text(
                            text = "Mercedes",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 1
            Spacer(modifier = Modifier.height(25.dp))

            //Row 2
            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .
                    clickable {
                        navController.navigate(BM_URL )
                        Toast.makeText(mContext,"Go to BMW screen",
                            Toast.LENGTH_SHORT).show()

                    }
                )

                {



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bm),
                            contentDescription = "BMW",
                            modifier = Modifier.size(230.dp)
                                .fillMaxSize()
                        )
                        Text(
                            text = "BMW",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .clickable {
                        navController.navigate(MIT_URL )
                        Toast.makeText(mContext,"Go to Mitsubishi screen",
                            Toast.LENGTH_SHORT).show()

                    }){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.mi),
                            contentDescription = "Mitsubishi",
                            modifier = Modifier.size(250.dp)
                        )
                        Text(
                            text = "Mitsubishi",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 2
            Spacer(modifier = Modifier.height(25.dp))

            //Row 3
            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .clickable {
                        navController.navigate(MERC_URL )
                        Toast.makeText(mContext,"Go to Lexus screen",
                            Toast.LENGTH_SHORT).show()

                    }){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lec),
                            contentDescription = "Lexus",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Lexus",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }

                Spacer(modifier = Modifier.width(30.dp))

                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .clickable {
                        navController.navigate(FORD_URL )
                        Toast.makeText(mContext,"Go to Ford screen",
                            Toast.LENGTH_SHORT).show()

                    }){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ford),
                            contentDescription = "Ford",
                            modifier = Modifier.size(240.dp)
                                .fillMaxSize()
                        )
                        Text(
                            text = "Ford",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }





                }

            } // End of Row 3


            Spacer(modifier = Modifier.height(25.dp))


            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate( SUB_URL)
                        Toast.makeText(mContext,"Go to Subaru screen",
                            Toast.LENGTH_SHORT).show()

                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.subb),
                            contentDescription = "amazon",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Subaru",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card


                Card (modifier = Modifier.
                clickable {
                    navController.navigate( AUDI_URL)
                    Toast.makeText(mContext,"Go to audi screen",
                        Toast.LENGTH_SHORT).show()

                }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.audi),
                            contentDescription = "Mercedes",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Audi",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 1

            Spacer(modifier = Modifier.height(25.dp))



            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate( ISU_URL)
                        Toast.makeText(mContext,"Go to Isuzu screen",
                            Toast.LENGTH_SHORT).show()

                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.isuz),
                            contentDescription = "amazon",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Isuzu",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card


                Card (modifier = Modifier.
                clickable {
                    navController.navigate(JEEP_URL )
                    Toast.makeText(mContext,"Go to Jeep screen",
                        Toast.LENGTH_SHORT).show()

                }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.jeep),
                            contentDescription = "Mercedes",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Jeep",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 1

            Spacer(modifier = Modifier.height(25.dp))


            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate(LAND_URL )
                        Toast.makeText(mContext,"Go to Landrover screen",
                            Toast.LENGTH_SHORT).show()

                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.landr),
                            contentDescription = "amazon",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Landrover",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card


                Card (modifier = Modifier.
                clickable {
                    navController.navigate( NISS_URL)
                    Toast.makeText(mContext,"Go to Nissan screen",
                        Toast.LENGTH_SHORT).show()

                }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.nisss),
                            contentDescription = "Mercedes",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Nissan",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 1








        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}