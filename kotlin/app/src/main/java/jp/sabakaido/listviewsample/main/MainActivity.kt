package jp.sabakaido.listviewsample.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import jp.sabakaido.listviewsample.R
import jp.sabakaido.listviewsample.custom.CustomActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lv = findViewById(R.id.listview) as ListView

        // simple_list_item_1はデフォルトで用意されているlayout
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf("1", "2", "3", "4", "5", "6"))

        // adapterをset
        lv.adapter = adapter

        lv.setOnItemClickListener { _, _, _, _ ->
            var intent = Intent(this@MainActivity, CustomActivity::class.java)
            startActivity(intent)
        }
    }
}
