package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentAPageBinding;
import com.example.odev4.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.anasayfaBtnA.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.aPageGecis);
        });

        return binding.getRoot();
    }
}