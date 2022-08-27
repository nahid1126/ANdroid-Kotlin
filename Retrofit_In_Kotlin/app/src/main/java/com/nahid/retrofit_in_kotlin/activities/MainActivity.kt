package com.nahid.retrofit_in_kotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.nahid.retrofit_in_kotlin.adapter.NewsAdapter
import com.nahid.retrofit_in_kotlin.api.ApiClient
import com.nahid.retrofit_in_kotlin.databinding.ActivityMainBinding
import com.nahid.retrofit_in_kotlin.model.Article
import com.nahid.retrofit_in_kotlin.model.News

import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity() : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var articleList = mutableListOf<Article>()
    private var pageNum = 1
    private var totalPage = -1
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getNewsHeadLines()
    }

    private fun setUpRecyclerView(articleList: MutableList<Article>) {
        /* val layoutManager = LinearLayoutManager(this)

         if (totalPage > layoutManager.itemCount && layoutManager.findLastVisibleItemPosition() >= layoutManager.itemCount - 5) {
             pageNum++
             getNewsHeadLines()
         }
         newsRecyclerView.layoutManager = layoutManager
         newsRecyclerView.adapter =
             NewsAdapter(this@MainActivity, articleList)*/
        binding.apply {
            newsRecyclerView.adapter = NewsAdapter(this@MainActivity, articleList)
            newsRecyclerView.set3DItem(true)
            newsRecyclerView.setAlpha(true)
            newsRecyclerView.setInfinite(true)
            if (totalPage > newsRecyclerView.getCarouselLayoutManager().itemCount) {
                pageNum++
                getNewsHeadLines()
            }
            newsRecyclerView.setIsScrollingEnabled(true)
        }
    }

    private fun getNewsHeadLines() {
        Log.d(TAG, "getNewsHeadLines: $pageNum")
        val news: Call<News> = ApiClient.apiInterface.getNewsHeadLine("in", pageNum)
        news.enqueue(object : Callback<News> {
            override fun onResponse(call: Call<News>, response: Response<News>) {
                if (response.isSuccessful) {
                    articleList.addAll(response.body()!!.articles)
                    totalPage = response.body()!!.totalResults
                    Log.d(TAG, "onResponse: ${articleList.size}")
                    setUpRecyclerView(articleList)
                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d(TAG, "onFailure: ", t)
            }
        })
    }
}

