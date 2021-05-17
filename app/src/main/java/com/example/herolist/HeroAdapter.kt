package com.example.herolist
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.herolist.databinding.ItemHeroBinding
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class HeroAdapter(
    private val heroes: List<Hero>
    ): RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_hero,parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(heroes[position])
    }

    override fun getItemCount(): Int = heroes.size

    class HeroHolder(private val view: View): RecyclerView.ViewHolder(view){

        val binding =  ItemHeroBinding.bind(view)

        fun render(hero: Hero){
            binding.tvHeroName.text = hero.heroName
            binding.tvRealName.text = hero.realName
            binding.tvPublisher.text = hero.publisher
            Picasso.get().load(hero.image).into(binding.imageHero)
            view.setOnClickListener{ Toast.makeText(view.context,"Has seleccionado:${hero.heroName}", Toast.LENGTH_SHORT ).show()}
        }

    }
}