package com.example.quotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    private val quoteText: TextView
        get() = findViewById(R.id.quoteText)

    private val quoteAuthor: TextView
        get() = findViewById(R.id.quoteAuthor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(
            this, MainViewModelFactory(application)
        ).get(MainViewModel::class.java)

        setQuote(mainViewModel.getQuotes())
    }

    fun onShare(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, mainViewModel.getQuotes().text)
        startActivity(intent)
    }

    fun onPrevious(view: View) {
        setQuote(mainViewModel.previousQuotes())
    }

    fun onNext(view: View) {
        setQuote(mainViewModel.nextQuotes())
    }

    private fun setQuote(quotes: Quotes) {
        quoteText.text = quotes.text
        quoteAuthor.text = quotes.author
    }
}