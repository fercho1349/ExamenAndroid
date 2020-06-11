package com.anzen.android.examenandroid.activities.listBikesDashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anzen.android.examenandroid.R
import com.anzen.android.examenandroid.activities.listBikesDashboard.adapter.ListBikesDashboardAdapter
import com.anzen.android.examenandroid.base.BaseAdapter
import com.anzen.android.examenandroid.models.Bikes
import kotlinx.android.synthetic.main.activity_main.*

class ListBikesDashboardActivity : AppCompatActivity(), BaseAdapter.OnItemClickListener<Bikes>,
    ListBikesDashboardContract.ViewInterface  {

    private lateinit var adapter: ListBikesDashboardAdapter
    private lateinit var listBikesDashboardPresenter: ListBikesDashboardContract.ListBikesDashboardInterface
    private lateinit var menu: Menu

    override fun onStart() {
        super.onStart()
        listBikesDashboardPresenter.getBikes(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpView()
        setupPresenter()
    }

    private fun setupPresenter() {
        listBikesDashboardPresenter = ListBikesDashboardPresenter(this)
        listBikesDashboardPresenter.getBikes(this)
    }

    private fun setUpView() {
        setSupportActionBar(toolbar)
        supportActionBar?.elevation = 7.0f

        adapter = ListBikesDashboardAdapter()
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter
        adapter.onItemClickListener = this
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        this.menu = menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_nearby -> {
                listBikesDashboardPresenter.getBikes(this)
                true
            }
            R.id.action_bikes_available -> {
                listBikesDashboardPresenter.getBikes(this)
                true
            }
            R.id.action_spaces_available -> {
                listBikesDashboardPresenter.getBikes(this)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onItemClick(view: View, entity: Bikes, position: Int) {}

    override fun displayBikes(listBikes: ArrayList<Bikes>?) {
        adapter.changeDataSet(listBikes)
    }

    override fun onError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }


}
