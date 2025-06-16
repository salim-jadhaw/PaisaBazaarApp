package sa.example.paisabazaar

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.fragment.app.Fragment
import sa.example.paisabazaar.databinding.FragmentCreditBinding

class CreditFragment : Fragment() {

    private var _binding: FragmentCreditBinding? = null
    private val binding get() = _binding!!

    private lateinit var scrollView: HorizontalScrollView
    private val handler = Handler(Looper.getMainLooper())
    private var scrollX = 0
    private var direction = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreditBinding.inflate(inflater, container, false)
        val view = binding.root

        scrollView = view.findViewById(R.id.creditScrollView)
        autoSlideImages()

        binding.backk.setOnClickListener {
            var intentt = Intent(requireContext(),DashBoard::class.java)
            startActivity(intentt)
        }

        return view
    }

    private fun autoSlideImages() {
        handler.post(object : Runnable {
            override fun run() {
                scrollX += 1 * direction
                scrollView.smoothScrollTo(scrollX, 0)

                // Adjust limit based on your total image width
                if (scrollX >= 600 || scrollX <= 0) {
                    direction *= -1
                }

                handler.postDelayed(this, 20)
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        handler.removeCallbacksAndMessages(null)
        _binding = null
    }
}
