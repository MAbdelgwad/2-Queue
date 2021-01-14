package com.example.android.Que;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class D$D$1$K$Fragment extends Fragment {
    EditText editText_lamda;
    EditText editText_mu;
    EditText editText_k;
    TextView ti;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dd1k, container, false);
        editText_lamda = (EditText) view.findViewById(R.id.dd1k_λ);
        editText_mu    = (EditText) view.findViewById(R.id.dd1k_μ);
        editText_k    = (EditText) view.findViewById(R.id.dd1k_k);
        ti             = (TextView) view.findViewById(R.id.dd1k_ti);
        view.findViewById(R.id.dd1k_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display();
                    }});
        return view;
    }


    public void display() {

        /**LAMDA = 1/λ */
        String string_lamda = editText_lamda.getText().toString().trim();
        if(string_lamda.isEmpty() || string_lamda.length() == 0 || string_lamda.equals("") || string_lamda == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a LAMDA", Toast.LENGTH_SHORT).show();
            return; }
        int lamda = Integer.parseInt(string_lamda);

        /**MU*/
        String string_mu = editText_mu.getText().toString().trim();
        if(string_mu.isEmpty() || string_mu.length() == 0 || string_mu.equals("") || string_mu == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a MU", Toast.LENGTH_SHORT).show();
            return; }
        int mu = Integer.parseInt(string_mu);

        /**k*/
        String string_k = editText_k.getText().toString().trim();
        if(string_k.isEmpty() || string_k.length() == 0 || string_k.equals("") || string_k == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a K", Toast.LENGTH_SHORT).show();
            return; }
        int k = Integer.parseInt(string_k);

        int ti_inital=(k*lamda*mu - (lamda*lamda)) / (mu - lamda);


        while (true){

            int x =(ti_inital-lamda)/mu;
            int y = ti_inital/lamda;
             if(k!=y-x){
                 /**because we accept the value before !=  */
                 ti_inital+=lamda;
             break; }
             else ti_inital-=lamda;
        }



        /**Set ti */
        ti.setText(String.valueOf(ti_inital));
    }}

