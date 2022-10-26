package com.example.kepkiapp

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.NavArgument
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kepkiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val controller: NavController by lazy {
        findNavController(R.id.nav_host_fragment_activity_main)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView = binding.navView
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.mainFragment, R.id.basketFragment,
                R.id.bestsellersFragment, R.id.profileFragment
            )
        )
        navView.setupWithNavController(controller)

        controller.addOnDestinationChangedListener { _, _, _ ->
            if (controller.currentDestination?.id == R.id.firstFragment
                || controller.currentDestination?.id == R.id.secondFragment
                || controller.currentDestination?.id == R.id.authFragment2
                || controller.currentDestination?.id == R.id.restorePasswordFragment
                || controller.currentDestination?.id == R.id.thirdFragment
                || controller.currentDestination?.id == R.id.getCodeFragment
                || controller.currentDestination?.id == R.id.interFragment
                || controller.currentDestination?.id == R.id.newPasswordCreateFragment
            ) {
                binding.navView.visibility = View.GONE
            } else {
                binding.navView.visibility = View.VISIBLE
            }
        }

    }
}