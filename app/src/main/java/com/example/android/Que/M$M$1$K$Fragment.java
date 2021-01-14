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

/**{@link Fragment} that displays a list of phrases.*/
public class M$M$1$K$Fragment extends Fragment {

    EditText editText_lamda;
    EditText editText_mu;
    EditText editText_k;
    TextView l;
    TextView lq;
    TextView w;
    TextView wq;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mm1k, container, false);
        editText_lamda = (EditText) view.findViewById(R.id.mm1k_λ);
        editText_mu    = (EditText) view.findViewById(R.id.mm1k_μ);
        editText_k     = (EditText) view.findViewById(R.id.mm1k_k);
        l              = (TextView) view.findViewById(R.id.mm1k_L);
        lq             = (TextView) view.findViewById(R.id.mm1k_Lq);
        w              = (TextView) view.findViewById(R.id.mm1k_W);
        wq             = (TextView) view.findViewById(R.id.mm1k_Wq);
        view.findViewById(R.id.mm1k_btn)
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

        /** k */
        String string_k = editText_k.getText().toString().trim();
        if(string_k.isEmpty() || string_k.length() == 0 || string_k.equals("") || string_k == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a K", Toast.LENGTH_SHORT).show();
            return; }
        double k = Double.parseDouble(string_k);


        double ru =(lamda/mu);
        double p = 1 - (Math.pow(ru, k) * (1 - ru / (1 - Math.pow(ru, k + 1))));

        double l_init =ru*((1-(k+1)*Math.pow(ru,k)+k*Math.pow(ru,k+1))/((1-ru)*(1-Math.pow(ru,k+1))));
        double lq_init =l_init-ru* p;
        double w_init =l_init/(lamda* p)  ;
        double wq_init = w_init-(1/mu)  ;
        /**Set L */
        l.setText(String.valueOf( l_init));
        /**Set Lq */
        lq.setText(String.valueOf(lq_init));
        /**Set W */
        w.setText(String.valueOf(w_init));
        /**Set Wq */
        wq.setText(String.valueOf(wq_init));

    }

}