package sa.example.paisabazaar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class MyFragment : Fragment() {

    private lateinit var notificationiconn: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my, container, false)

        notificationiconn = view.findViewById(R.id.ntfncn)

        notificationiconn.setOnClickListener {
            val intentt = Intent(requireContext(), ntfnc::class.java)
            startActivity(intentt)
        }

        return view
    }
}
