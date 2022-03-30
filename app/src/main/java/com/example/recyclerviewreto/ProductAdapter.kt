package com.example.recyclerviewreto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewreto.databinding.ItemProductBinding
import org.json.JSONObject

class ProductAdapter(private val products: Array<JSONObject>): RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ProductAdapter.ProductHolder{
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductHolder(binding)

    }


    override fun onBindViewHolder(holder: ProductAdapter.ProductHolder, position: Int) {
        holder.render(products[position])
    }

    override fun getItemCount(): Int = products.size


    class ProductHolder (val binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root){
        fun render(product: JSONObject){

            binding.tvTitle.setText(product.getString("title"))
            binding.tvPrice.setText(product.getString("price"))
            binding.tvMeses.setText(product.getString("meses"))
            binding.tvLlegaManana.setText(product.getString("manana"))
            binding.tvVendedor.setText(product.getString("vendedor"))

        }

    }


    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {

        val binding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int = videos.size

    class MainHolder(val binding: ItemVideoBinding): RecyclerView.ViewHolder(binding.root){
        fun render(video: JSONObject){

            binding.tvVideoTitle.setText(video.getString("title"))
            binding.tvChannelName.setText(video.getString("title"))
            binding.tvVideoViews.setText(video.getString("title"))
            binding.tvdateposted.setText(video.getString("title"))
            binding.tvVideoDuration.setText(video.getString("title"))
            binding.ivVideoThumbnail.setImageResource(R.drawable.video_placeholder)
            binding.ivAvatar.setImageResource(R.drawable.avatar_placeholder)

        }
    }*/

}