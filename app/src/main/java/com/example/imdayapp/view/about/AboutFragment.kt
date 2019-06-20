package com.example.imdayapp.view.about


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.imdayapp.R
import com.example.imdayapp.databinding.FragmentAboutBinding
import org.koin.android.viewmodel.ext.android.viewModel

class AboutFragment : Fragment() {

    private val mViewModel: AboutViewModel by viewModel()
    private lateinit var mBinding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)

        with(mBinding) {
            viewModel = mViewModel
            lifecycleOwner = this@AboutFragment
            executePendingBindings()
        }

        mViewModel.init()
        return mBinding.root
    }
}
