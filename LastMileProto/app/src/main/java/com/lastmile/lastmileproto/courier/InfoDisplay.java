package com.lastmile.lastmileproto.courier;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lastmile.lastmileproto.R;
import com.lastmile.lastmileproto.login.CourierLogin;
import com.lastmile.lastmileproto.login.ResidentLogin;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfoDisplay#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfoDisplay extends Fragment {


    public InfoDisplay() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InfoDisplay.
     */
    // TODO: Rename and change types and number of parameters
    public static InfoDisplay newInstance(String param1, String param2) {
        InfoDisplay fragment = new InfoDisplay();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
/*
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState){
        Button button_infodisplaynext = view.findViewById(R.id.button_infodispNext);
        button_infodisplaynext.setOnClickListener(InfoDispNextListener -> {
            Intent InfoDisplayNext = new Intent(this, InfoDisplay.class);
            startActivity(InfoDisplayNext);
        });
        //edit to reflect page transitions
    }

 */


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_display, container, false);
    }
}