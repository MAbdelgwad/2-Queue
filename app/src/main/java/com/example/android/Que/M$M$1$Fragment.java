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
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class M$M$1$Fragment extends Fragment {

    EditText editText_lamda;
    EditText editText_mu;
    TextView l;
    TextView lq;
    TextView w;
    TextView wq;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mm1, container, false);
        editText_lamda = (EditText) view.findViewById(R.id.mm1_λ);
        editText_mu    = (EditText) view.findViewById(R.id.mm1_μ);
        l              = (TextView) view.findViewById(R.id.mm1_L);
        lq             = (TextView) view.findViewById(R.id.mm1_Lq);
        w              = (TextView) view.findViewById(R.id.mm1_W);
        wq             = (TextView) view.findViewById(R.id.mm1_Wq);
        view.findViewById(R.id.mm1_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display();
                    }});
        return view;
    }


    public void display() {

        /**LAMDA = λ */
        String string_lamda = editText_lamda.getText().toString().trim();
        if(string_lamda.isEmpty() || string_lamda.length() == 0 || string_lamda.equals("") || string_lamda == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a LAMDA", Toast.LENGTH_SHORT).show();
            return; }
        double lamda = Double.parseDouble(string_lamda);

        /**MU*/
        String string_mu = editText_mu.getText().toString().trim();
        if(string_mu.isEmpty() || string_mu.length() == 0 || string_mu.equals("") || string_mu == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a MU", Toast.LENGTH_SHORT).show();
            return; }
        double mu = Double.parseDouble(string_mu);


        /**Set L */
        l.setText(String.valueOf(lamda/(mu-lamda)));
        /**Set Lq */
        lq.setText(String.valueOf(lamda*lamda/(mu*(mu-lamda))));
        /**Set W */
        //double w_inital = 1/(mu-lamda);
        w.setText(String.valueOf(1/(mu-lamda)));
        /**Set Wq */
        //double wq_innital = lamda/(mu*(mu-lamda));
        wq.setText(String.valueOf(lamda/(mu*(mu-lamda))));

    }

}