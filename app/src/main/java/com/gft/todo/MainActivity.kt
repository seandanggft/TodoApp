package com.gft.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.gft.todo.databinding.ActivityMainBinding
import com.gft.todo.ui.theme.AppTheme
import com.gft.todo.ui.view.main.MainScreen

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // FIXME: set to false if using XML
    private val useCompose = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (useCompose) {
            setContent {
                AppTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        MainScreen()
                    }
                }
            }
        } else {
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }
    }
}
