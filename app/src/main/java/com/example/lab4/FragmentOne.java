package com.example.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentOne extends Fragment {
    EditText Phone, Password;
    Button SignIn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View nView = inflater.inflate(R.layout.fragment_one,container,false);

        Phone = nView.findViewById(R.id.phone);
        Password = nView.findViewById(R.id.password);
        SignIn = nView.findViewById(R.id.signin_button);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = Phone.getText().toString();
                String password = Password.getText().toString();

                Bundle bundle= new Bundle();
                bundle.putString("Phone", phone);
                bundle.putString("Password", password);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                FragmentSecond fragmentSecond = new FragmentSecond();
                fragmentSecond.setArguments(bundle);
                fragmentTransaction.replace(R.id.framelayout, fragmentSecond);
                fragmentTransaction.commit();
            }
        });
        return nView;


    }
}
