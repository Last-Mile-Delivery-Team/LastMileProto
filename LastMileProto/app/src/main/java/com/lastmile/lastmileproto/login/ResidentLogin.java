package com.lastmile.lastmileproto.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lastmile.lastmileproto.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResidentLogin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResidentLogin extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ResidentLogin() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ResidentLogin.
     */
    // TODO: Rename and change types and number of parameters
    public static ResidentLogin newInstance(String param1, String param2) {
        ResidentLogin fragment = new ResidentLogin();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button_courierlogin = findViewById(R.id. );
        button_courierlogin.setOnClickListener(view -> {
            Intent MainLogtoCourierLog = new Intent(this, CourierLogin.class);
            startActivity(MainLogtoCourierLog);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resident_login, container, false);
    }
}