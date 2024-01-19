package cn.paper_card.player_coins.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class NotEnoughCoinsException extends Exception {

    private final long leftCoins;

    public NotEnoughCoinsException(long leftCoins, @NotNull String message) {
        super(message);
        this.leftCoins = leftCoins;
    }

    public long getLeftCoins() {
        return this.leftCoins;
    }
}
