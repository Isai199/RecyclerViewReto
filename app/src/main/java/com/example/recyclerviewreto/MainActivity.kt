package com.example.recyclerviewreto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewreto.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Audifono inalambricos sony\", \"price\": \"$ 1,008\", \"meses\": \"en 12x $ 84MSl\", \"manana\": \"llega gratis mañana\", \"vendedor\": \"vendido por MAFE Distribuciones\"}"),
            JSONObject("{\"title\": \"Control inalambricos ps4\", \"price\": \"$ 1,400\", \"meses\": \"en 12x $ 84MSl\", \"manana\": \"llega gratis mañana\", \"vendedor\": \"vendido por MAFE Distribuciones\"}"),
            JSONObject("{\"title\": \"Tv samsung\", \"price\": \"$ 5,999\", \"meses\": \"en 12x $ 84MSl\", \"manana\": \"llega gratis mañana\", \"vendedor\": \"vendido por MAFE Distribuciones\"}"),
            JSONObject("{\"title\": \"Playera nike\", \"price\": \"$ 1,967\", \"meses\": \"en 12x $ 84MSl\", \"manana\": \"llega gratis mañana\", \"vendedor\": \"vendido por MAFE Distribuciones\"}"),
            JSONObject("{\"title\": \"Telefono xiaomi\", \"price\": \"$ 4,300\", \"meses\": \"en 12x $ 84MSl\", \"manana\": \"llega gratis mañana\", \"vendedor\": \"vendido por MAFE Distribuciones\"}")
        )

        binding.rvProductEntires.adapter = ProductAdapter(fakeVideoData)


    }
}

