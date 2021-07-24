package com.dicoding.aplikasisederhana

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPokemonAdapter(private val listPokemon: ArrayList<Pokemon>) :
    RecyclerView.Adapter<ListPokemonAdapter.ListViewHolder>() {


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_pokemon, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var (name, detail, photo, gambarHabitat, elemen, ability, habitat, makanan) = listPokemon[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail





        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, PokemonDetail::class.java)
            moveDetail.putExtra(PokemonDetail.EXTRA_ELEMEN, elemen)
            moveDetail.putExtra(PokemonDetail.EXTRA_NAME, name)
            moveDetail.putExtra(PokemonDetail.EXTRA_PHOTO, photo)
            moveDetail.putExtra(PokemonDetail.EXTRA_HABITATPHOTO, gambarHabitat)
            moveDetail.putExtra(PokemonDetail.EXTRA_ABILITY, ability)
            moveDetail.putExtra(PokemonDetail.EXTRA_MAKANAN, makanan)
            moveDetail.putExtra(PokemonDetail.EXTRA_HABITAT, habitat)
            moveDetail.putExtra(PokemonDetail.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }


    }

    override fun getItemCount(): Int {
        return listPokemon.size

    }



}