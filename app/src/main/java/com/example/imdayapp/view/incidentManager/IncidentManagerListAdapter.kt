package com.example.imdayapp.view.incidentManager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imdayapp.databinding.IncidentManagerItemBinding

class IncidentManagerListAdapter(
    val viewModel: IncidentManagerViewModel
) : RecyclerView.Adapter<IncidentManagerListAdapter.IncidentManagerListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IncidentManagerListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = IncidentManagerItemBinding.inflate(inflater, parent, false)
        return IncidentManagerListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IncidentManagerListViewHolder, position: Int) {
        with(holder.itemBinding){
            item = viewModel.managers.value?.get(position)
            executePendingBindings()
        }
    }

    override fun getItemCount(): Int {
        return viewModel.managers.value?.size!!
    }

    class IncidentManagerListViewHolder(val itemBinding: IncidentManagerItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root)
}
