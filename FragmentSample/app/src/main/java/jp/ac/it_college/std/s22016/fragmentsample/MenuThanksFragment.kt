package jp.ac.it_college.std.s22016.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import jp.ac.it_college.std.s22016.fragmentsample.databinding.FragmentMenuThanksBinding

internal const val ARG_NAME = "menuName"
internal const val ARG_PRICE = "menuPrice"
internal const val REQUEST_BACK_MENU = "backMenu"

/**
 * 注文完了を表示するためのフラグメント
 */
class MenuThanksFragment : Fragment() {

    private var _binding: FragmentMenuThanksBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuThanksBinding.inflate(inflater, container,false )
        //return inflater.inflate(R.layout.fragment_menu_thanks, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuName = arguments?.getString(ARG_NAME) ?: ""
        val menuPrice = arguments?.getInt(ARG_PRICE) ?: 0

        binding.tvMenuName.text = menuName
        binding.tvMenuPrice.text = "%,d".format(menuPrice)

        binding.btThxBack.setOnClickListener(::onBackButtonClick)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun onBackButtonClick(v: View) {
        parentFragmentManager.setFragmentResult(REQUEST_BACK_MENU, bundleOf())
    }
}