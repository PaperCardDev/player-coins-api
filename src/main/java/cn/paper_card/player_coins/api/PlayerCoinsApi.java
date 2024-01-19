package cn.paper_card.player_coins.api;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@SuppressWarnings("unused")
public interface PlayerCoinsApi {

    // 添加玩家的硬币数量
    boolean addCoins(@NotNull UUID playerId, long coins) throws Exception;

    // 设置玩家硬币数量
    boolean setCoins(@NotNull UUID playerId, long coins) throws Exception;

    // 消费硬币，会保证有足够的硬币才能进行消费
    void consumeCoins(@NotNull UUID playerId, long coins) throws Exception;

    // 查询硬币数量
    long queryCoins(@NotNull UUID playerId) throws Exception;

    // 转账
    void transferCoins(@NotNull UUID fromId, @NotNull UUID toId, long coins) throws Exception;
}
