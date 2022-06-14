package com.ali.f1
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter(var context: Context , var arrayList:ArrayList<Itemlist>) :BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(position: Int, ConvertView: View?, Parent: ViewGroup?): View {
    val view :View = View.inflate(context , R.layout.cardview,null)


        var icons: ImageView =view.findViewById(R.id.list)
        var title: TextView =view.findViewById(R.id.title7)
        var detail: TextView =view.findViewById(R.id.descrip)
        var num: TextView =view.findViewById(R.id.num)

        var items:Itemlist  =arrayList.get(position)
        icons.setImageResource(items.icons!!)
        title.text=items.title
        detail.text=items.detail
        num.text=items.num

return view!!
    }
}