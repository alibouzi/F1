package com.ali.f1
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class Home : AppCompatActivity(),AdapterView.OnItemClickListener {
    private var listView:ListView ?=null
    private var itemAdapter:ItemAdapter?=null
    private var arrayList:ArrayList<Itemlist>? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)

        listView  = findViewById(R.id.list1)
        arrayList = ArrayList()
        arrayList =setDataItem()
        itemAdapter=ItemAdapter(applicationContext,arrayList!!)
        listView?.adapter=itemAdapter
        listView?.onItemClickListener =this
    }

    private fun setDataItem() :ArrayList<Itemlist>{
        var listIteam :ArrayList<Itemlist> = ArrayList()

        listIteam.add(Itemlist(
            R.drawable.img_1,"Max Verstappen","Red Bull Racing Honda","1"))
        listIteam.add(Itemlist(
            R.drawable.img_12,"Lewis Hamilton","Mercedes","2"))
        listIteam.add(Itemlist(
            R.drawable.img_3,"Valtteri Bottas","Mercedes","3"))
        listIteam.add(Itemlist(
            R.drawable.img_13,"Max Verstappen","Red Bull Racing Honda","4"))
        listIteam.add(Itemlist(
            R.drawable.img_6,"Sergio Perez","Ferrari","5"))

        listIteam.add(Itemlist(
            R.drawable.img_7,"Lando Norris","Mclaren Mercedes","6"))

        listIteam.add(Itemlist(
            R.drawable.img_15,"Charles Leclerc","Ferrari","7"))

        listIteam.add(Itemlist(
            R.drawable.img_9,"Daniel Ricciardo","Mclaren Mercedes","8"))
        listIteam.add(Itemlist(
            R.drawable.img_10,"Pierre Gasly","Alphatauri Honda","9"
        ))
        listIteam.add(Itemlist(
            R.drawable.img_11,"Fernando Alonso","Alpine Renault","10"
        ))


        return  listIteam
    }

    override fun onItemClick(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        var items :Itemlist  =arrayList?.get(position)!!

        Toast.makeText(applicationContext,items.title,Toast.LENGTH_LONG).show()
    }
}