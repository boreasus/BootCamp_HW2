package poyraz.apps.odevfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import poyraz.apps.odevfragment.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding:FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.y2ana)
        }

        return binding.root
    }

}