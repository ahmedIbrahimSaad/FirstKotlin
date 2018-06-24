package saad.firstkotlin.presentation

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //To change body of created functions use File | Settings | File Templates.
        holder.textView.text = items[position]
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        //To change body of created functions use File | Settings | File Templates.
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}