package com.example.manolo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentInicial fragmentInicial = new FragmentInicial();

        transaction.add(R.id.LinearLayoutContenendorDeFragments, fragmentInicial);
        transaction.commit();

    }

    public void seleccionarFragmento(View v){
        Fragment miFragmento;

        if(v==findViewById(R.id.btnFragmentInicial)){
            miFragmento=new FragmentInicial();
        }
        else if(v==findViewById(R.id.btnFragmentSegundo)) {
            miFragmento = new FragmentSegundo();
        }
        else if(v==findViewById(R.id.btnFragmentTercero)) {
            miFragmento = new FragmentTercero();
        }
        else {
            miFragmento = new FragmentInicial();
        }

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.LinearLayoutContenendorDeFragments, miFragmento);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
