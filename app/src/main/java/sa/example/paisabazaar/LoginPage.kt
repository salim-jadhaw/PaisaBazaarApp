package sa.example.paisabazaar

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import sa.example.paisabazaar.databinding.ActivityLoginPageBinding


class LoginPage : AppCompatActivity() {

    private lateinit var binding : ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        binding.nextt.setOnClickListener {
            var intenttt = Intent(this , loginwithP::class.java)
            startActivity(intenttt)
        }
        binding.nextttt.setOnClickListener {
            var intenttt = Intent(this , loginwithP::class.java)
            startActivity(intenttt)
        }
    }
}
