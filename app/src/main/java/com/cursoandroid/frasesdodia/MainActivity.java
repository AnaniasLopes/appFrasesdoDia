package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "A persistência é o caminho do êxito.",
                "A coragem não é ausência do medo; é a persistência apesar do medo.",
                "Tudo o que fizerem, façam de todo o coração, como para o Senhor, e não para os homens,\n" +
                        "Colossenses 3:23",
                "O que as suas mãos tiverem que fazer, que o façam com toda a sua força, pois na sepultura, para onde você vai, não há atividade nem planejamento, não há conhecimento nem sabedoria.\n" +
                        "Eclesiastes 9:10",
                "Tudo posso naquele que me fortalece.\n" +
                        "Filipenses 4:13",
                "pois é Deus quem efetua em vocês tanto o querer quanto o realizar, de acordo com a boa vontade dele.\n" +
                        "Filipenses 2:13",
                "Porque sou eu que conheço os planos que tenho para vocês', diz o Senhor, 'planos de fazê-los prosperar e não de causar dano, planos de dar a vocês esperança e um futuro.\n" +
                        "Jeremias 29:11",
                "Sejam fortes e corajosos. Não tenham medo nem fiquem apavorados por causa delas, pois o Senhor, o seu Deus, vai com vocês; nunca os deixará, nunca os abandonará\".\n" +
                        "Deuteronômio 31:6",
                "Estejam vigilantes, mantenham-se firmes na fé, sejam homens de coragem, sejam fortes.\n" +
                        "1 Coríntios 16:13",
                "Pois Deus não nos deu espírito de covardia, mas de poder, de amor e de equilíbrio.\n" +
                        "2 Timóteo 1:7"
        };
        int numero = new Random().nextInt(10);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero]);
    }

}
