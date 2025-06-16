package sa.example.paisabazaar.Third

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sa.example.paisabazaar.R

class ThirdAdapterlClass(private val itemList: List<ThirdModelClass>) :
    RecyclerView.Adapter<ThirdAdapterlClass.ThirdViewHolder>() {

    class ThirdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val textView2: TextView = itemView.findViewById(R.id.secondd)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_third_layout, parent, false)
        return ThirdViewHolder(view)
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.image)
        holder.textView.text = item.name
        holder.textView2.text=item.calculators
    }

    override fun getItemCount(): Int = itemList.size
}