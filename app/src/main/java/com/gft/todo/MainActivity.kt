package com.gft.todo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.gft.todo.databinding.ActivityMainBinding
import com.gft.todo.ui.theme.ComposeAppTheme
import com.gft.todo.ui.view.main.MainScreen
import com.gft.todo.ui.view.main.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var appComponent: ApplicationComponent
    @Inject
    lateinit var mainViewModel: MainViewModel

    // FIXME: set to true if using XML
    private val useCompose = false

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent = (applicationContext as TodoApp).appComponent
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        if (useCompose) {
            enableEdgeToEdge()
            setContent {
                ComposeAppTheme {
                    MainScreen(viewModel = mainViewModel)
                }
            }
        } else {
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            setSupportActionBar(binding.toolbar)
            val navController = findNavController(R.id.nav_host_fragment_content_main)
            appBarConfiguration = AppBarConfiguration(navController.graph)
            setupActionBarWithNavController(navController, appBarConfiguration)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}
