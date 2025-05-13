package com.example.expensemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.expensemanager.ui.screens.auth.SignupScreen
import com.example.expensemanager.ui.theme.ExpenseManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpenseManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //LoginScreen(modifier= Modifier.padding(innerPadding))
                    SignupScreen(modifier= Modifier.padding(innerPadding))

                }
            }
        }
    }
}