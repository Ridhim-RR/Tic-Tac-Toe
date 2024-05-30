package src.Stratetgy.BotStrategy;

import src.Models.BotDifficulity;

public class BotStrategyFactory {
    public static  botStrategy getStrategyBasedOnLevel(BotDifficulity b){
        if(b.equals(BotDifficulity.EASY)){
            return new EasyBotStrategy();
        }
        return null;
    }
}
