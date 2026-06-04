package com.example.advance_kotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.advance_kotlinapp.presentation.App
import com.example.advance_kotlinapp.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme{
                App()
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    AppTheme{
        App()
    }
}