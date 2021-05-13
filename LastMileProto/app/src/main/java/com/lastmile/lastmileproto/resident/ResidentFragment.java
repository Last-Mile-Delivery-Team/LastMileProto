package com.lastmile.lastmileproto.resident;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lastmile.lastmileproto.R;
import com.lastmile.lastmileproto.model.Resident;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResidentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResidentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ResidentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ResidentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ResidentFragment newInstance(String param1, String param2) {
        ResidentFragment fragment = new ResidentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resident, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)  {
        //edit to reflect page transitions
        Button button_tutorialback = view.findViewById(R.id.button_tutorialback);
        button_tutorialback.setOnClickListener(tutorialbacklistener->{
            Intent TutorialToActivityResident = new Intent(getActivity(), ResidentActivity.class);
            startActivity(TutorialToActivityResident);
        });


        Button button_tutoriallogout = view.findViewById(R.id.button_tutoriallogout);
        button_tutoriallogout.setOnClickListener(tutoriallogoutlistener-> {
            Intent TutorialToMainLogin = new Intent(getActivity(), ResidentActivity.class);
            startActivity(TutorialToMainLogin);
        });


        Button button_residenttutorial = view.findViewById(R.id.button_residenttutorial);
        button_residenttutorial.setOnClickListener(residenttutorialistener -> {
            Intent ActivityResidenttoTutorial = new Intent(getActivity(), ResidentActivity.class);
            startActivity(ActivityResidenttoTutorial);
        });

        Button button_residentlogout = view.findViewById(R.id.button_residentlogout);
        button_residentlogout.setOnClickListener(residentlogoutlistener -> {
            Intent ActivityResidentToMainLogin = new Intent(getActivity(), ResidentActivity.class);
            startActivity(ActivityResidentToMainLogin);
        });

        Button button_instupdate = view.findViewById(R.id.button_instUpdate);
        button_instupdate.setOnClickListener(instupdatelistener -> {
            try {
                RequestBody formBody = new FormBody.Builder()
                        .add("Username", "alex.horejsi@gmail.com")
                        .add("Password", "123")

                        .build();

                Request request = new Request.Builder()
                        .url("http://localhost:5000/makeResident")
                        .post(formBody)
                        .build();
                Response response = new OkHttpClient().newCall(request).execute();

                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
                System.out.println(response.body().string());



            }
            catch(IOException E){
                E.printStackTrace();
            }
        });
    }
}

