package sa.example.paisabazaar

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import sa.example.paisabazaar.databinding.ActivityLoginwithPBinding

class loginwithP : AppCompatActivity() {
    private lateinit var binding : ActivityLoginwithPBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginwithPBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        binding.nextttt.setOnClickListener {
            var intenttt = Intent(this , WelcomePage::class.java)
            startActivity(intenttt)
        }
    }
}