package pl.edu.wszib.springhelloworld.model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;


public class MyConfiguration {

   @Bean
   @Scope(SCOPE_PROTOTYPE)
   public KartaDoGlosowania kartaDoGlosowania(){
       return new KartaDoGlosowania();
   }
    @Bean
    public Wyborca wyborca(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania());
    }

    @Bean
    public Urna urna(Wyborca wyborca){
       Urna u = new Urna();
       wyborca.oddajGlos(u);
       u.zlicz();
       return u;
    }

}
