package bjork.henrik;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Getter
@Component
public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();

    @MaxNumber
    private final int maxNumber;
    @MinNumber
    private final int minNumber;

    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    @Override
    public int next() {
        return random.nextInt((maxNumber - minNumber) + minNumber);
    }

}
