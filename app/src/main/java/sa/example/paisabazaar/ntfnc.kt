package sa.example.paisabazaar

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ntfnc : AppCompatActivity() {
    lateinit var imgback : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ntfnc)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        imgback = findViewById(R.id.backk)
        imgback.setOnClickListener {
            var imagebackk = Intent(this,DashBoard::class.java)
            startActivity(imagebackk)
        }

    }
}