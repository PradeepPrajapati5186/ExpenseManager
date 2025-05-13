package com.example.expensemanager.ui.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignupScreen(modifier: Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text="SIGNUP")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = email,
            onValueChange = {email = it },
            label = {Text(text = "Email") },
            singleLine = true)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password,
            onValueChange = {password = it },
            label = {Text(text = "Password") },
            singleLine = true)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}) {
            Text(text = "SignUp")
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}