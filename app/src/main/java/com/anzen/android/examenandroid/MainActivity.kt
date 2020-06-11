package com.anzen.android.examenandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anzen.android.examenandroid.helpers.JsonReaderHelper
import com.anzen.android.examenandroid.utils.ResponseListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BaseAdapter.OnItemClickListener<Bikes>, ResponseListener<List<Bikes>> {

    private lateinit var adapter: ListBikesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ListBikesAdapter()
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter
        adapter.onItemClickListener = this
    }

    private fun getRequest(){
        /*val jsonReaderHelper = JsonReaderHelper(this)
        jsonReaderHelper.getInfoBikes(this)*/
        //TODO LLAMAR PRESENTADOR
    }

    override fun onItemClick(view: View, entity: Bikes, position: Int) {}

    override fun onSuccess(responseObject: List<Bikes>) {
        adapter.changeDataSet(responseObject)
    }

    override fun onError(error: String) {
        Log.e(javaClass.simpleName, error)
    }


}
