package ru.script.featureone.presentation.fragments.one

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.one_fragment.*
import ru.script.base_navigation.NavDest
import ru.script.base_navigation.NavState
import ru.script.base_navigation.NavigationState
import ru.script.base_navigation.NavigationState.Companion.putNavState
import ru.script.cache_featureone.FeatureOneCachedData.Companion.getCache
import ru.script.featureone.R
import ru.script.featureone.presentation.LocalNavStackOne
import ru.script.featureone.presentation.LocalNavStackOne.Companion.backStack

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
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if(!LocalNavStackOne.backStack.isEmpty()) {
                        val dest = LocalNavStackOne.backStack.pop()
                        findNavController().navigate(dest)
                    }else{
                        NavState.setNavigations(NavDest.ONE, NavDest.OLD)
                        activity?.finish()
                    }
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(!LocalNavStackOne.backStack.isEmpty()) {
            val dest = LocalNavStackOne.backStack.pop()
            findNavController().navigate(dest)
        }

        //TODO refactor method cache
        textView.text = getCache(context)

        buttonOne.setOnClickListener {
            val dest = R.id.someFragment
            backStack.push(dest)
            findNavController().navigate(dest)
        }
    }

    override fun onResume() {
        super.onResume()
        NavigationState.putNavState("2", context)
    }

}