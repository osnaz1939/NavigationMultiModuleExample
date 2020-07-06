package ru.script.navigationmultimoduleexample.nav

import android.content.SharedPreferences
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.script.base_navigation.NavigationState.Companion.getNavState
import ru.script.navigationmultimoduleexample.R

class NavFragment : Fragment() {

    companion object {
        fun newInstance() = NavFragment()
    }

    private lateinit var viewModel: NavViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.nav_fragment, container, false)
    }

    //TODO change to fabric method
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NavViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onResume() {
        super.onResume()

        //TODO change to request on navigation vm
        when(getNavState(context)){
            "0","1"->onetNavigation()
            "2"->twoNavigation()
        }
    }

    fun onetNavigation(){
        findNavController()?.navigate(R.id.featureOneActivity)
    }

    private fun twoNavigation(){
        findNavController()?.navigate(R.id.featureTwoActivity)
    }

}