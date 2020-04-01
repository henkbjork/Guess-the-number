package bjork.henrik.config;

import bjork.henrik.GuessCont;
import bjork.henrik.MaxNumber;
import bjork.henrik.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "bjork.henrik")
public class GameConfig {

    @Value("${game.maxNumber:20}")
    private int maxNumber;
    @Value("${game.minNumber:1}")
    private int minNumber;
    @Value("${game.guessCount:5}")
    private int guessCount;

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @GuessCont
    public int guessCount() {
        return guessCount;
    }

}
