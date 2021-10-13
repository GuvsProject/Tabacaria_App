package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class OrderAdapter(
    val orders: List<Order>,
    val onClick: (Order) -> Unit
): RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    class OrderViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val cardStatus: TextView
        val cardImg: ImageView
        val cardProgress: ProgressBar
        val cardView: CardView

        init {
            cardStatus = view.findViewById(R.id.card_nome)
            cardImg = view.findViewById(R.id.card_image)
            cardProgress = view.findViewById(R.id.card_progress)
            cardView = view.findViewById(R.id.card_order)
        }
    }

    override fun getItemCount() = this.orders.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : OrderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_orders, parent, false)
        val holder = OrderViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val context = holder.itemView.context

        val order = this.orders[position]

        holder.cardStatus.text = order.status
        holder.cardProgress.visibility = View.VISIBLE

        Picasso.with(context).load(order.foto).fit().into(holder.cardImg,
            object : com.squareup.picasso.Callback {
                override fun onSuccess() {
                    holder.cardProgress.visibility = View.GONE
                }

                override fun onError() {
                    holder.cardProgress.visibility = View.GONE
                }
            }
        )

        holder.itemView.setOnClickListener {onClick(order)}

    }


}

