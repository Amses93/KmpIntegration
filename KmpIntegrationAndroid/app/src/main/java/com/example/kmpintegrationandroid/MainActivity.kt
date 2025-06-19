package com.example.kmpintegrationandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kmpintegrationandroid.ui.theme.KmpIntegrationAndroidTheme
import com.example.lib_a_shared.SharedClassA
import com.example.lib_b_shared.SharedClassB

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KmpIntegrationAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = SharedClassA().getClassName(),
                            modifier = Modifier
                                .padding(innerPadding)
                                .padding(16.dp)
                        )
                        Text(
                            text = SharedClassB().getClassName(),
                            modifier = Modifier
                                .padding(innerPadding)
                                .padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}