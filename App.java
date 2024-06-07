/*
 * À REMPLACER AVEC VOTRE PROPRE EN-TÊTE DE PROJET
 * 
 * Un programme de démarrage pour l'exploration de JavaFX.
 * Il présume que votre version de Java est une version ZuluFX
 * qui inclut les bibliothèques `javafx` déjà.
 * 
 * Utilisez les outils Java de votre éditeur pour lancer le programme.
 * 
 * Voyez ce site pour des références et exemples avec les différents
 * objets de l'interface utilisateur (accessible via la barre latérale gauche) :
 * https://jenkov.com/tutorials/javafx/your-first-javafx-application.html
 * 
 * Pour une vie simple, évitez pour le moment les exemples basés 
 * sur FXML. Déclarant votre structure directement dans votre code
 * ressemble plus à ce que nous avons fait ce semestre.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * La partie `extends Application` donne à cette classe tout
 * le code définit dans javafx.application.Application et toutes
 * les obligations associées.
 */
public class App extends Application {

    /**
     * On dit `Override` parce que `Application` déclare cette
     * méthode mais ne le définit pas. Il nous oblige à le définir.
     * En le définissant, on programme le noyau de notre application
     * JavaFX.
     */
    @Override
    public void start(Stage stage) {

        // créer les éléments de la page
        Label label = new Label("Bienvenue à JavaFX.");
        TextArea write = new TextArea();
        Button button = new Button("Imprimer à la console");

        // définir quoi faire selon les événements possibles
        // avec une expression lambda (param -> {action})
        button.setOnAction(actionEvent -> {
            System.out.println(write.getText());
            write.clear();
        });

        // organiser les éléments de la page
        VBox layout = new VBox(label, write, button);
        int space = 20;
        layout.setSpacing(space); // éléments internes
        layout.setPadding(new Insets(space)); // autour de l'objet

        // définir l'objet racine de la fenêtre et l'afficher
        Scene scene = new Scene(layout, 400, layout.getMaxHeight());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // pré-définit dans `Application`
    }

}
