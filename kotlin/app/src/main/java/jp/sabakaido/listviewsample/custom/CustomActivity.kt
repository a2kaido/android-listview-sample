package jp.sabakaido.listviewsample.custom

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import jp.sabakaido.listviewsample.R

/**
 * Created by anikaido on 2017/05/27.
 */
class CustomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lv = findViewById(R.id.listview) as ListView

        var adapter = CustomAdapter(this, arrayListOf(
                CustomItem("a"),
                CustomItem("b"),
                CustomItem("c"),
                CustomItem("d"),
                CustomItem("e"),
                CustomItem("f"),
                CustomItem("g"),
                CustomItem("h"),
                CustomItem("i"),
                CustomItem("j"),
                CustomItem("k"),
                CustomItem("l"),
                CustomItem("m"),
                CustomItem("n"),
                CustomItem("o"),
                CustomItem("p"),
                CustomItem("q"),
                CustomItem("r"),
                CustomItem("s"),
                CustomItem("t")
        ))

        // adapterをset
        lv.adapter = adapter
    }
}