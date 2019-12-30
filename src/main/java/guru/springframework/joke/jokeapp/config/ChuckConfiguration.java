package guru.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //wylaczamy bo teraz przerzucamy sie na xml-owa configurajce i trzeba bylo wylaczy zeby spring nie widzial tej klasy jako configuracji
public class ChuckConfiguration {

   //@Bean //wylaczamy bo teraz przerzucamy sie na xml-owa configurajce i trzeba bylo wylaczy zeby spring nie widzial tej klasy jako configuracji
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
