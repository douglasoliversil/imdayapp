package com.example.imdayapp.about


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.imdayapp.R
import com.example.imdayapp.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private lateinit var mViewModel: AboutViewModel
    private lateinit var mBinding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mViewModel = ViewModelProviders.of(this)[AboutViewModel::class.java]
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)

        with(mBinding) {
            viewModel = mViewModel
            lifecycleOwner = this@AboutFragment
        }

        mBinding.executePendingBindings()
        mViewModel.init()
        return mBinding.root
    }
}
