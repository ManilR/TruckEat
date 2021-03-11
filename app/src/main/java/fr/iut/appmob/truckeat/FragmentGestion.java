package fr.iut.appmob.truckeat;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.Nullable;

public class FragmentGestion extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gestion, container, false);
        this.openAdd(v);
        return v;
    }

    private void openAdd(View v){
        Button buttonMap =(Button)v.findViewById(R.id.buttonAdd);
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddTruckActivity.class);
                startActivity(intent);
            }

        });
    }
}