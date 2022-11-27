package com.example.myapplicationquizztoeic.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplicationquizztoeic.R;
import com.example.myapplicationquizztoeic.model.model.EnglishWord;
import com.example.myapplicationquizztoeic.model.model.TraductionBank;

import java.util.Arrays;

// implémentation de l'interface View.OnClickListener
// pour intercepter le clic du joueur sur l'une des traductions
// sans avoir besoin d'ajouter un onclicklistener sur chaque bouton
// ainsi la méthode onClick() ne sera definie qu'une seule fois
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    // Declaration des variables utilisées
    TextView mEnglishWordTextView;
    Button mButton1Button;
    Button mButton2Button;
    Button mButton3Button;
    Button mButton4Button;
    Button mButton5Button;

    //Création de l'attribut de classe de MainActivity2 de type TraductionBank
    TraductionBank mTraductionBank= genererEnglishWord();

    // Creation d'un attribut qui permet de garder en mémoire l'english word courant de notre activity
    EnglishWord mCurrentEnglishWord;

    // declaration du nombre d'englishword à parcourir pour le test
    int mcompteur;

    // Declaration du score du joueur
    int mscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Utilisation de la méthode findViewById()
        // pour recuperer les élements graphiques du layout vers le code
        mEnglishWordTextView = findViewById(R.id.EnglishWord);
        mButton1Button = findViewById(R.id.button_1);
        mButton2Button = findViewById(R.id.button_2);
        mButton3Button = findViewById(R.id.button_3);
        mButton4Button = findViewById(R.id.button_4);
        mButton5Button = findViewById(R.id.button_5);

        // Complément pour utilisation du meme listener pour les 5 boutons
        // Pour chaque bouton, appel de la meme methode pour savoir si le bouton a été cliqué/declenché ou pas
        mButton1Button.setOnClickListener(this);
        mButton2Button.setOnClickListener(this);
        mButton3Button.setOnClickListener(this);
        mButton4Button.setOnClickListener(this);
        mButton5Button.setOnClickListener(this);

        // Initalisation de la variable mCurrentEnglihWord
        mCurrentEnglishWord = mTraductionBank.getCurrentEnglishWord();
        // Permet l'affichage des infos du model dans l'activity 2
        //displayEnglishWord(mTraductionBank.getCurrentEnglishWord());
        // remplacement du paramètre de la méthode displayEnglishWord par la variable Current EnglisWord
        displayEnglishWord(mCurrentEnglishWord);


        // Le nombre total d'englishword est fixé à 10
        mcompteur =10;

        // Initalisation de la variable score
        mscore=0;



        }

    // Pour afficher un englishword et les differentes traductions
    // Utilisation de la méthode getEnglishword()
    // qui prend en paramètre une instance de EnglishWord et en affiche les valeurs
    private void displayEnglishWord(final EnglishWord englishword) {
        // Set the text for the question text view and the four buttons
        mEnglishWordTextView.setText(englishword.getEnglishWord());
        mButton1Button.setText(englishword.getTraductionListe().get(0));
        mButton2Button.setText(englishword.getTraductionListe().get(1));
        mButton3Button.setText(englishword.getTraductionListe().get(2));
        mButton4Button.setText(englishword.getTraductionListe().get(3));
        mButton5Button.setText(englishword.getTraductionListe().get(4));

        // On rend de nouveau accessible tous les boutons pour permettre le choix
        mButton1Button.setEnabled(true);
        mButton2Button.setEnabled(true);
        mButton3Button.setEnabled(true);
        mButton4Button.setEnabled(true);
        mButton5Button.setEnabled(true);
    }



    // creation méthode genererEnglishWord qui renvoie un objet de type TraductionBank
    private TraductionBank genererEnglishWord(){
        EnglishWord englishword1 = new EnglishWord("deter",
                Arrays.asList("dissuader",
                        "être déterminé",
                        "déterrer",
                        "décider",
                        "decomposer"),
                0);

        EnglishWord englishword2 = new EnglishWord("a figure",
                Arrays.asList("une face",
                        "un chiffre",
                        "un dessin",
                        "une forme",
                        "un graphique"),
                1);

        EnglishWord englishword3 = new EnglishWord("The pain",
                Arrays.asList("la patisserie",
                        "le pain",
                        "le coup de poing",
                        "la douleur",
                        "la pâte"),
                3);

        EnglishWord englishword4 = new EnglishWord("a cellar",
                Arrays.asList("une cellule de prison",
                        "un alcool",
                        "un poisson exotique",
                        "une cave",
                        "un type de globule blanc"),
                3);

        EnglishWord englishword5 = new EnglishWord("a bribe",
                Arrays.asList("un reste",
                        "une bride",
                        "un pot de vin",
                        "une partie",
                        "un lien"),
                2);

        EnglishWord englishword6 = new EnglishWord("a commodity",
                Arrays.asList("une facilité",
                        "un avantage",
                        "des toilettes",
                        "une friandise",
                        "une marchandise"),
                4);

        EnglishWord englishword7 = new EnglishWord("a demonstration",
                Arrays.asList("une manifestation",
                        "une démonstration",
                        "une présentation",
                        "un spectacle",
                        "une resolution mathématique"),
                0);

        EnglishWord englishword8 = new EnglishWord("a groom",
                Arrays.asList("un valet de chambre",
                        "un maitre d'hotel",
                        "un service",
                        "une mariée",
                        "un marié"),
                4);

        EnglishWord englishword9 = new EnglishWord("a venue",
                Arrays.asList("une naissance",
                        "un lieu de réunion",
                        "une arrivée imminente",
                        "une action",
                        "une venue"),
                1);

        EnglishWord englishword10 = new EnglishWord("a little coin",
                Arrays.asList("un petit fruit",
                        "un petit coin",
                        "les toilettes",
                        "une petite pièce de monnaie",
                        "un billet de banque"),
                3);

        return new TraductionBank(Arrays.asList(englishword1,
                englishword2,
                englishword3,
                englishword4,
                englishword5,
                englishword6,
                englishword7,
                englishword8,
                englishword9,
                englishword10));
    }


    // méthode générée automatiquement suite à l'implementation de ViewOnClickListener
    // le paramètre passé est une vue qui correspond au bouton sur lequel l'utilisateur a cliqué
    @Override
    public void onClick(View view) {

        int index;
        // Recherche de l'index correspondant au bouton cliqué
        // Chaque bouton non cliqué est egalement rendu inaccessible,
        // pour empecher un nouveau clic sur une autre traduction du même englishword
        if (view == mButton1Button) {
            index = 0;
            mButton2Button.setEnabled(false);
            mButton3Button.setEnabled(false);
            mButton4Button.setEnabled(false);
            mButton5Button.setEnabled(false);
        } else if (view == mButton2Button) {
            index = 1;
            mButton1Button.setEnabled(false);
            mButton3Button.setEnabled(false);
            mButton4Button.setEnabled(false);
            mButton5Button.setEnabled(false);
        } else if (view == mButton3Button) {
            index = 2;
            mButton1Button.setEnabled(false);
            mButton2Button.setEnabled(false);
            mButton4Button.setEnabled(false);
            mButton5Button.setEnabled(false);
        } else if (view == mButton4Button) {
            index = 3;
            mButton1Button.setEnabled(false);
            mButton2Button.setEnabled(false);
            mButton3Button.setEnabled(false);
            mButton5Button.setEnabled(false);
        } else if (view == mButton5Button) {
            index = 4;
            mButton1Button.setEnabled(false);
            mButton2Button.setEnabled(false);
            mButton3Button.setEnabled(false);
            mButton4Button.setEnabled(false);
        }

        else {
            throw new IllegalStateException("Unknown clicked view : " + view);
        }

        // Comparaison de l'index avec la valeur correcte stockee dans le model
        if (index== mTraductionBank.getCurrentEnglishWord().getChoixIndex()){
            // si reponse correcte ==> affichage d'un toast avec mention "Bonne reponse"
            Toast.makeText(this,"Bonne réponse!",Toast.LENGTH_SHORT).show();
            mscore++;
        } else{
            Toast.makeText(this,"Mauvaise réponse!",Toast.LENGTH_SHORT).show();
        }


        mcompteur--;

        if(mcompteur>0){
            // On continue le jeu
            // Avec une temporisation de 4s avant d'acceder à l'englishword suivant
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    mCurrentEnglishWord=mTraductionBank.getNextEnglishWord();
                    displayEnglishWord(mCurrentEnglishWord);
                }
            }, 4000);


        } else{
            // Plus d'englishword à presenter, fin du jeu
            // Affichage du score du joueur
            Toast.makeText(this,"Le jeu est terminé ! ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"Votre score est : "+ mscore + "/10", Toast.LENGTH_SHORT).show();
            //Temporisation de 10s avant de revenir à l'écran principal
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    finish();
                }
            }, 10000);
        }

        /* while (mcompteur<10){
            mCurrentEnglishWord=mTraductionBank.getNextEnglishWord();
            displayEnglishWord(mCurrentEnglishWord);
            mcompteur--;
        }
         */

    }
}