package main;

import model.Musica;
import model.Podcast;
import model.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Beyoncé");
        musica.setAlbum("XOXO");

        for (int i = 0; i < 400; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 120; i++) {
            musica.curtir();
        }
        
        Podcast podcast = new Podcast();
        podcast.setTitulo("Inteligencia Limitada");
        podcast.setDescricao("É um podcast que combina humor e diversidade de temas, com Rogério Vilela como apresentador e um convidado diferente em cada episódio.");
        
        for (int i = 0; i < 220; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 35; i++) {
            podcast.curtir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
        


    }
}
