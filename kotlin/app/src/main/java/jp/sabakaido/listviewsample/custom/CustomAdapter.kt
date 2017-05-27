package jp.sabakaido.listviewsample.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import jp.sabakaido.listviewsample.R

/**
 * Created by anikaido on 2017/05/27.
 */
class CustomAdapter(var context: Context, var items: ArrayList<CustomItem>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v = layoutInflater.inflate(R.layout.custom_item, parent, false)

        (v.findViewById(R.id.text) as TextView).text = items.get(position).text

        return v
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }
}