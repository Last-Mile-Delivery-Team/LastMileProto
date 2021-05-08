package com.lastmile.lastmileproto.courier;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lastmile.lastmileproto.R;
import com.lastmile.lastmileproto.login.CourierLogin;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DeliveryConfirmation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DeliveryConfirmation extends Fragment {



    public DeliveryConfirmation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DeliveryConfirmation.
     */
    // TODO: Rename and change types and number of parameters
    public static DeliveryConfirmation newInstance(String param1, String param2) {
        DeliveryConfirmation fragment = new DeliveryConfirmation();
        Bundle args = new Bundle();

        return fragment;
    }
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //edit to reflect page transitions
        Button button_courierlogin = findViewById(R.id.button_courierlogin);
        button_courierlogin.setOnClickListener(view -> {
            Intent MainLogtoCourierLog = new Intent(this, CourierLogin.class);
            startActivity(MainLogtoCourierLog);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delivery_confirmation, container, false);
    }

 */
}
