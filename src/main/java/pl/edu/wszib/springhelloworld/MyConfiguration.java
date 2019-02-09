package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;


@Configuration
public class MyConfiguration {

    @Bean
    public Samochod samochod(Karoseria karoseria, Zawieszenie zawieszenie){
        return new Samochod(karoseria, zawieszenie);

    }


    @Bean
    public Karoseria karoseria(Drzwi drzwi){
        return new Karoseria(drzwi);
    }

    @Bean
    public Drzwi drzwi(){
        return new Drzwi();
    }

    @Bean
    public Zawieszenie zawieszenie(Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, UkladSterowania ukladSterowania){
        return new Zawieszenie(silnik, skrzyniaBiegow, ukladSterowania);
    }

    @Bean
    public SkrzyniaBiegow skrzyniaBiegow(){
        return new SkrzyniaBiegow();
    }

    @Bean
    public UkladSterowania ukladSterowania(Kierownica kierownica){
        return new UkladSterowania(kierownica);
    }

    @Bean
    public Kierownica kierownica(){
        return new Kierownica();
    }

    @Bean
    public Silnik silnik(){
        return new Silnik();
    }
}
