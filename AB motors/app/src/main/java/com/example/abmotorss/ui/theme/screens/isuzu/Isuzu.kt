package com.example.abmotorss.ui.theme.screens.isuzu


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.navigation.ADD_PRODUCTS_URL
import com.example.abmotorss.navigation.VIEW_PRODUCTS_URL
import com.example.abmotorss.ui.theme.WazitoECommerceTheme
import com.example.abmotorss.ui.theme.screens.login.LoginScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IsuScreen(navController: NavHostController) {


    Column(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Text(
                text = "ISUZU",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            //Row1
            LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                //Column1
                item {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.m01),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz cl 200",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "year:2012",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                        )

                        Text(
                            text = "Ksh.3.2M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )




                        Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mm3),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes Benz E 200",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2017",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = " Ksh.5.9M ",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                }
            }


//End of Row1
            Spacer(modifier = Modifier.height(10.dp))


            //2nd row
            LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                //Column1
                item {

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.m3),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes Benz E300",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2012",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh. 2.65M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.m5),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz ML250",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2014",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh 4.95M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {


                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }
                    //End of Column1
                }
            }

            //3nd row
            LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                //Column1
                item {

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.sall),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz C200",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2016",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh. 4.1M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.g4),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz G-Class",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Make:2016",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh.7M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }
                    //End of Column1
                }
            }


            //3nd row
            LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                //Column1
                item {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.m7),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz B180",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2016",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh.2M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.m8),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz E250",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Make:2016",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh.4.8M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }
                    //End of Column1
                }
            }

            //5th row
            LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                //Column1
                item {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.s2),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz M-Class",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make.2015",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh 6.3M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.s1),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz S-Class",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make.2015",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh. 6.9M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }


                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }
                    //End of Column1
                }
            }


            //6th row
            LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                //Column1
                item {

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.sue),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz CLS",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2018",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh. 8.9M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Email
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }


                    //End of Column1
                    Spacer(modifier = Modifier.width(10.dp))

                    //Column1

                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(160.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.sal),
                                    contentDescription = "Las Vegas",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Mercedes-Benz E250",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Make:2016",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Fuel type:Petrol",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(5.dp))


                        Text(
                            text = "Ksh. 4.8M",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Red
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            val mContext = LocalContext.current

                            OutlinedButton(onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0757355014".toUri()
                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "Call")
                            }
                            Spacer(modifier = Modifier.width(5.dp))

                            //Pay
                            OutlinedButton(onClick = {

                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }


                            }) {
                                Text(text = "Pay")
                            }
                        }
                    }
                    //End of Column1
                }


            }

            Spacer(modifier = Modifier.height(12.dp))


            Row {


                Button(
                    onClick = {
                        navController.navigate(ADD_PRODUCTS_URL)
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                ) {
                    Text(
                        text = "UPLOAD",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black

                    )
                }

                Spacer(modifier = Modifier.width(5.dp))


                Button(
                    onClick = {
                        navController.navigate(VIEW_PRODUCTS_URL)
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                ) {
                    Text(
                        text = "VIEW UPLOADED VEHICLES",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black

                    )
                }
            }


        }
    }

}


@Composable
@Preview(showBackground = true)
fun IsuscreenPreview(){
    WazitoECommerceTheme {
        LoginScreen(navController = rememberNavController())
    }
}