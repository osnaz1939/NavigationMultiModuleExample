package ru.script.featuretwo.presentation.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.two_fragment.*
import ru.script.base_navigation.NavDest
import ru.script.base_navigation.NavState
import ru.script.base_navigation.NavigationState
import ru.script.featuretwo.R

class TwoFragment : Fragment() {

    companion object {
        fun newInstance() = TwoFragment()
    }

    private lateinit var viewModel: TwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.two_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TwoViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonTwo.setOnClickListener {
            NavState.setNavigations(NavDest.TWO,NavDest.OLD)
            activity?.finish()
        }
    }

    override fun onResume() {
        super.onResume()
        NavigationState.putNavState("1", context)
    }

}