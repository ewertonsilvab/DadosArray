package com.example.user.dadosarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    EditText prod, armz, docs, inv, qnt, lot;
    ArrayList<Atribbs> dados;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DataAtual

        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = sdf.format(date);


        prod = findViewById(R.id.prod);
        armz = findViewById(R.id.armazem);
        docs = findViewById(R.id.documentos);
        inv  = findViewById(R.id.inventario);
        qnt = findViewById(R.id.quantidade);
        lot = findViewById(R.id.lote);

        inv.setText(dateString);
        inv.setEnabled(false);

        //results = findViewById(R.id.stringtxt);

        dados = new ArrayList<>();

    }

    //Botão para adicionar os dados
    public void botaoadd(View v){

        String produto = prod.getText().toString();
        String amz = armz.getText().toString();
        String dcs = docs.getText().toString();
        String inve = inv.getText().toString();
        String qntd = qnt.getText().toString();
        String lote = lot.getText().toString();


        Atribbs atb = new Atribbs(produto,amz,dcs,inve,qntd,lote);
        dados.add(atb);

        Toast.makeText(MainActivity.this,"Adicionado com sucesso !!", Toast.LENGTH_SHORT).show();


    }

// Botão para salvar os dados
    public void botaosave(View v){

        try{
            FileOutputStream file = openFileOutput("Data.txt", MODE_APPEND);
            OutputStreamWriter outputfile = new OutputStreamWriter(file);

            for(int i =0; i < dados.size(); i++){
                outputfile.write(dados.get(i).getProduto()+","+dados.get(i).getArmazem()+","+dados.get(i).getDocumentos()
                        +","+dados.get(i).getInventario()+","+dados.get(i).getQuantidade()+","+dados.get(i).getLote() +","+ "\n");
            }

            outputfile.flush();
            outputfile.close();

            Toast.makeText(MainActivity.this,"Salvo com sucesso !!", Toast.LENGTH_SHORT).show();


        }catch (IOException e){

        }

    }
}
