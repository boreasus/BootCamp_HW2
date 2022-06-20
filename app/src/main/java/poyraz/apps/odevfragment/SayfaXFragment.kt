package poyraz.apps.odevfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import poyraz.apps.odevfragment.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding:FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)


        binding.buttonGitY2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.x2y)
        }

        return binding.root
    }


}