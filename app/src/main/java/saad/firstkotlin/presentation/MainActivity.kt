package saad.firstkotlin.presentation

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import saad.firstkotlin.Injection
import saad.firstkotlin.R

class MainActivity : AppCompatActivity(), Contract.View {
    var forecastList: RecyclerView? = null
    var items: MutableList<String> = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "hello kotlin"
        items = mutableListOf(
                "hi ahmed"
        )
        forecastList = findViewById(R.id.forecast_list)

        forecastList!!.layoutManager = LinearLayoutManager(this)
        forecastList!!.adapter = ForecastListAdapter(items)

        message.setOnClickListener { toast("hi") }
        var presenter = Presenter(Injection.provideRepo(), this)
        presenter.getList("name")

        //      var myFrind = Person("islam", "eldesoky")

    }

    override fun onError(message: String) {
        toast(message)
    }

    override fun updateView(list: List<String>) {
        for (i in list)
            items.add(i)
        forecastList!!.adapter.notifyDataSetChanged()
    }

    override fun setPresenter(presenter: Contract.Presenter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}



