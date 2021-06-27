package ru.netology.nmedia.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val a = 500F
        val b = 500F
        val c = 500F
        val d = 500F

        val diagramma = listOf(
            a / (a + b + c + d),
            b / (a + b + c + d),
            c / (a + b + c + d),
            d / (a + b + c + d),
        )

        findViewById<StatsView>(R.id.stats).data = diagramma
    }
}