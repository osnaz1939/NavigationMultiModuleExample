package ru.script.featureone.presentation.fragments.some

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.one_fragment.*
import kotlinx.android.synthetic.main.some_fragment.*
import ru.script.base_navigation.NavigationState
import ru.script.featureone.R

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

        buttonSome.setOnClickListener {
            activity?.finish()
        }
    }

}