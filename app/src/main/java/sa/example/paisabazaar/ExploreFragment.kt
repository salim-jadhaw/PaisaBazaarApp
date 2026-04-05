package sa.example.paisabazaar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sa.example.paisabazaar.Third.ThirdAdapterlClass
import sa.example.paisabazaar.Third.ThirdModelClass
import sa.example.paisabazaar.databinding.FragmentExploreBinding

class ExploreFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView1 : RecyclerView
    private lateinit var recyclerView3 : RecyclerView


    private lateinit var imageAdapter: ImageAdapterClass
    private lateinit var imageAdapter1 : SecondImageAdapter
    private lateinit var imageAdapter3 : SecondImageAdapter

    private lateinit var scrollView: HorizontalScrollView
    private val handler = Handler(Looper.getMainLooper())
    private var scrollX = 0
    private var direction = 1

    private lateinit var notificationicon : ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

        scrollView = view.findViewById(R.id.scrollView)
        notificationicon = view.findViewById(R.id.ntfncn)

        notificationicon.setOnClickListener {
            var intentt = Intent(requireContext() , ntfnc::class.java)
            startActivity(intentt)
        }

        autoSlideImages()
        recyclerView = view.findViewById(R.id.recyclerviewww)
        recyclerView1 = view.findViewById(R.id.recyclerviewsecond)
        recyclerView3 = view.findViewById(R.id.recyclerviewthird)

        val personList = listOf(
            ImageModelClass(R.drawable.creditcard, " Credit \nCards"),
            ImageModelClass(R.drawable.personalloan, " Personal \nloan"),
            ImageModelClass(R.drawable.bussinessloan, " Bussines \nloan   "),
            ImageModelClass(R.drawable.homeloan, " Credit \nCards"),
            ImageModelClass(R.drawable.homeloan, " Credit \nCards"),)

        recyclerView.layoutManager = GridLayoutManager(requireContext() , 3)
        imageAdapter = ImageAdapterClass(personList)
        recyclerView.adapter = imageAdapter

         

        val personList1 = listOf(
            SecondImageModel(R.drawable.healthinsurance, "Health \nInsurance"),
            SecondImageModel(R.drawable.terminsurance, "Term \nInsurance"),
            SecondImageModel(R.drawable.investmentplan, "Investment \nInsurance"),
            SecondImageModel(R.drawable.carinsurance, "Car \nInsurance"),
        )

        recyclerView1.layoutManager = GridLayoutManager(requireContext(), 3)
        imageAdapter1 = SecondImageAdapter(personList1)
        recyclerView1.adapter = imageAdapter1



        // third recyclerviewww

        val personList3 = listOf(
            ThirdModelClass("Calculator", "Calculates Reward", R.drawable.rewards),
            ThirdModelClass("Calculator","Check your EMI's", R.drawable.bankemi),
            ThirdModelClass("IFSCC FINDER","Find Bank Details", R.drawable.bankkdetails),
        )

        recyclerView3.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val imageAdapter3 = ThirdAdapterlClass(personList3)
        recyclerView3.adapter = imageAdapter3

        return view
    }

    private fun autoSlideImages() {
        handler.post(object : Runnable {
            override fun run() {
                scrollX += 1 * direction // slower scroll step (was 5)

                scrollView.smoothScrollTo(scrollX, 0)

                // Reverse at bounds — adjust 600 if needed based on image size
                if (scrollX >= 600 || scrollX <= 0) {
                    direction *= -1
                }

                handler.postDelayed(this, 20) // slower loop (was 20)
            }
        })
    }

}
