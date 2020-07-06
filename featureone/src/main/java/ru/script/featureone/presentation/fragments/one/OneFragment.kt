package ru.script.featureone.presentation.fragments.one

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.one_fragment.*
import ru.script.base_navigation.NavigationState
import ru.script.base_navigation.NavigationState.Companion.putNavState
import ru.script.cache_featureone.FeatureOneCachedData.Companion.getCache
import ru.script.featureone.R

class OneFragment : Fragment() {

    companion object {
        fun newInstance() =
            OneFragment()
    }

    private lateinit var viewModel: OneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.one_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OneViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO refactor method cache
        textView.text = getCache(context)

        buttonOne.setOnClickListener {
            findNavController().navigate(R.id.action_oneFragment_to_someFragment)
        }
    }

    override fun onResume() {
        super.onResume()
        NavigationState.putNavState("2", context)
    }

}