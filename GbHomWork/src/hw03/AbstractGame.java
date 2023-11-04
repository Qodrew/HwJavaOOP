package hw03;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private Integer sizeWord;
    private Integer maxTry;
    private GameStatus status;
    private String word;
    int currentTry;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.status = GameStatus.ACTIVE;
        this.word = generateWord(sizeWord);
        
        this.currentTry = 0;
    }

    private String generateWord(Integer sizeWord) {
        List<String> alph = generateCharList();
        String resultWord = "";
        for (int i = 0; i < sizeWord; i++) {
            Integer index = new Random().nextInt(alph.size());
            resultWord += alph.get(index);
            alph.remove(index);
        }
        return resultWord;
    }

    protected abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        Integer coinCow = 0;
        Integer coinBull = 0;

        if (coinBull.equals(word.length())) {
            status = GameStatus.WIN;
            System.out.println("Вы Победили!");
            return new Answer(maxTry, coinCow, coinBull);
        }
        currentTry++;
        if (maxTry == 0) {
            status = GameStatus.LOSE;
            System.out.println("Вы проиграли по количеству попыток");
            return new Answer(maxTry, coinCow, coinBull);
        }
        return new Answer(maxTry, coinBull, coinCow);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }
}
