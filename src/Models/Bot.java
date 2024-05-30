package src.Models;

import src.Stratetgy.BotStrategy.BotStrategyFactory;
import src.Stratetgy.BotStrategy.botStrategy;

public class Bot extends Player {
    private BotDifficulity botDifficulity;
    private botStrategy strategy;

    public Bot(int id, String name, Symbol s, BotDifficulity b){
        super(id, name,s,PlayerType.BOT);
        this.botDifficulity = b;
        this.strategy = BotStrategyFactory.getStrategyBasedOnLevel(b);
    }
    public BotDifficulity getBotDifficulity() {
        return botDifficulity;
    }

    public void setBotDifficulity(BotDifficulity botDifficulity) {
        this.botDifficulity = botDifficulity;
    }

    public Move makeMove(Board b){
        Move m = strategy.makeMove(b);
        m.setPlayer(this);
        return m;
    }
}
