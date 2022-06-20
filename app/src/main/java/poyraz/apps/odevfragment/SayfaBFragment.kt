package poyraz.apps.odevfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import poyraz.apps.odevfragment.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {

    private lateinit var binding:FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)


        binding.buttonGitY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.b2y)
        }

        return binding.root
    }


}