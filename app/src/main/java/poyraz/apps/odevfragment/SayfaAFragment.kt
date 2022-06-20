package poyraz.apps.odevfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import poyraz.apps.odevfragment.databinding.FragmentAnasayfaBinding
import poyraz.apps.odevfragment.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)


        binding.buttonGitB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.a2b)
        }

        return binding.root
    }
}