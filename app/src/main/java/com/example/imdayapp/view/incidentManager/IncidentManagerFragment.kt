package com.example.imdayapp.view.incidentManager


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imdayapp.R
import com.example.imdayapp.databinding.FragmentIncidentManagerBinding
import org.koin.android.viewmodel.ext.android.viewModel

class IncidentManagerFragment : Fragment() {

    private val mViewModel: IncidentManagerViewModel by viewModel()
    private lateinit var mBinding: FragmentIncidentManagerBinding
    private lateinit var mIncidentManagerListAdapter: IncidentManagerListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_incident_manager, container, false)
        mIncidentManagerListAdapter = IncidentManagerListAdapter(mViewModel)

        with(mBinding) {
            viewModel = mViewModel
            lifecycleOwner = this@IncidentManagerFragment
            with(managersList) {
                layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
                adapter = mIncidentManagerListAdapter
            }
            executePendingBindings()
        }

        mViewModel.init()
        return mBinding.root
    }


}
