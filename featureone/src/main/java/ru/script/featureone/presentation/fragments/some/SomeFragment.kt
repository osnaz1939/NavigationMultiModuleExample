package ru.script.featureone.presentation.fragments.some

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.one_fragment.*
import kotlinx.android.synthetic.main.some_fragment.*
import ru.script.base_navigation.NavDest
import ru.script.base_navigation.NavState.Companion.setNavigations
import ru.script.base_navigation.NavigationState
import ru.script.featureone.R
import ru.script.featureone.presentation.LocalTemp.Companion.data

class SomeFragment : Fragment() {

    companion object {
        fun newInstance() = SomeFragment()
    }

    private lateinit var viewModel: SomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.some_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("data", data)

        buttonSome.setOnClickListener {
            setNavigations(NavDest.ONE,NavDest.TWO)
            activity?.finish()
        }
    }

}