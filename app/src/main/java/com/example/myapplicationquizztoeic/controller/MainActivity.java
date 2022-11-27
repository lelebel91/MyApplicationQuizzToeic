package com.example.myapplicationquizztoeic.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationquizztoeic.R;
import com.example.myapplicationquizztoeic.model.model.joueur;

public class MainActivity extends AppCompatActivity {

    // Declaration des variables utilisées
    ImageView mDrapImage;
    TextView mTitleAppTextView;
    EditText mNameEditText;
    TextView mDescriptionTextView;
    Button mGoButton;

    //joueur mJoueur;


    // La méthode OnCreate() est appelée lorsque l'activité est créee
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // cette méthode permet de determiner quel fichier layout utiliser

        // Utilisation de la méthode findViewById()
        // pour recuperer les élements graphiques du layout vers le code
        mDrapImage = findViewById(R.id.DrapImage);
        mTitleAppTextView = findViewById(R.id.Title_App);
        mNameEditText = findViewById(R.id.user_name);
        mDescriptionTextView = findViewById(R.id.description_game);
        mGoButton = findViewById(R.id.GoButton);

        mGoButton.setEnabled(false); // Bouton go rendu inactif tant que saisie nom utilisateur incorrecte



        // Cette méthode permet de savoir qd l'utilisateur commence à saisir son prenom
        mNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // Detection d'un changement de texte dans un EditText
            // Par utilisation de la méthode afterTextChanged
            @Override
            public void afterTextChanged(Editable editable) {
                mGoButton.setEnabled(!editable.toString().isEmpty());
                // ligne de code qui activera ou desactivera le bouton
                // en fonction de la longueur du texte saisi  pour le prenom
                // Si rien est renseigné dans prénom , le bouton reste desactivité
            }

        });

        // Detection d'un clic sur le bouton par implementation d'un View.OnClickListener
        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création objet Intent pour préciser nouvelle activité à démarrer sur une action donnée
                // avec 1er paramètre = contexte MainActivity
                // et 2eme paramètre = Activity2 à démarrer
                // qui permet passage sur 2eme ecran qd clic sur bouton Go
                Intent MainActivity2Intent = new Intent(MainActivity.this, MainActivity2.class);
                // Utilisation de la méthode StartActivity pour lancer le nouvel écran grâce à l'Intent créé
                startActivity(MainActivity2Intent);
                // Ces 2 précédentes lignes permettent aussi de revenir à l'activité précédente
                // en utlisant le bouton de retour du telephone

                // Memorisation du prénom du joueur lorsqu'il clique sur le bouton go
                //mJoueur.setPrénom(mNameEditText.getText().toString());

            }
        });
    }
}