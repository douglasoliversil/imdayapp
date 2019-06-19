package com.example.imdayapp.incidentManager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imdayapp.R
import com.example.imdayapp.databinding.ActivityIncidentManagerBinding

class IncidentManagerActivity : AppCompatActivity() {

    private lateinit var mViewModel: IncidentManagerViewModel
    private lateinit var mBinding: ActivityIncidentManagerBinding
    private lateinit var mIncidentManagerListAdapter: IncidentManagerListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel = ViewModelProviders.of(this)[IncidentManagerViewModel::class.java]
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_incident_manager)
        mIncidentManagerListAdapter = IncidentManagerListAdapter(mViewModel)

        with(mBinding) {
            viewModel = mViewModel
            with(managersList) {
                layoutManager = LinearLayoutManager(this@IncidentManagerActivity, RecyclerView.VERTICAL, false)
                adapter = mIncidentManagerListAdapter
            }
        }

        mBinding.executePendingBindings()
        mViewModel.init(resources)
    }
}
