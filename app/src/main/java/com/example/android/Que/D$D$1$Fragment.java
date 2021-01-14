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

public class D$D$1$Fragment extends Fragment {
    EditText editText_lamda;
    EditText editText_mu;
    EditText editText_ti;
    TextView nt;

    public D$D$1$Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dd1, container, false);
        editText_lamda = (EditText) view.findViewById(R.id.dd1_λ);
        editText_mu    = (EditText) view.findViewById(R.id.dd1_μ);
        editText_ti    = (EditText) view.findViewById(R.id.dd1_ti);
        nt             = (TextView) view.findViewById(R.id.dd1_nt);
               view.findViewById(R.id.dd1_btn)
                       .setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            display();
                                        }});
        return view;
    }


    public void display() {

        /**LAMDA =1/λ */
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
            Toast.makeText(this.getActivity(), "You did not enter a MU", Toast.LENGTH_LONG).show();
            return; }
        int mu = Integer.parseInt(string_mu);

        /**Ti*/
        String string_ti = editText_ti.getText().toString().trim();
        if(string_ti.isEmpty() || string_ti.length() == 0 || string_ti.equals("") || string_ti == null){
            //EditText is empty
            Toast.makeText(this.getActivity(), "You did not enter a Ti", Toast.LENGTH_SHORT).show();
            return; }
        int ti = Integer.parseInt(string_ti);

        /**Set n(t)*/
        int x =(ti-lamda)/mu;
        int y = ti/lamda;
        nt.setText(String.valueOf(y-x));

        }

}