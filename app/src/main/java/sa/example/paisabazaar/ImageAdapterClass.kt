package sa.example.paisabazaar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapterClass(private val personList: List<ImageModelClass>) :
    RecyclerView.Adapter<ImageAdapterClass.ImageViewHolder>() {

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageid)
        val textView: TextView = itemView.findViewById(R.id.imgname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image_layout, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val person = personList[position]
        holder.imageView.setImageResource(person.image)
        holder.textView.text = person.imageName
    }

    override fun getItemCount(): Int = personList.size
}