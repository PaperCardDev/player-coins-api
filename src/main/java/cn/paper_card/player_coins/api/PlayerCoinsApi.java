package cn.paper_card.player_coins.api;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@SuppressWarnings("unused")
public interface PlayerCoinsApi {

    // 添加玩家的硬币数量
    @Deprecated
    boolean addCoins(@NotNull UUID playerId, long coins) throws Exception;

    // 添加或减少玩家的硬币数量
    long addCoins(@NotNull UUID playerId, long coins, @NotNull String comment) throws Exception;

    // 设置玩家硬币数量
    @Deprecated
    boolean setCoins(@NotNull UUID playerId, long coins) throws Exception;

    // 消费硬币，会保证有足够的硬币才能进行消费
    @Deprecated
    void consumeCoins(@NotNull UUID playerId, long coins) throws Exception;

    // 消费硬币，会保证有足够的硬币才能进行消费
    long consumeCoins(@NotNull UUID playerId, long coins, @NotNull String comment) throws Exception;

    // 查询硬币数量
    long queryCoins(@NotNull UUID playerId) throws Exception;

    // 转账
    @Deprecated
    void transferCoins(@NotNull UUID fromId, @NotNull UUID toId, long coins) throws Exception;

    // 转账，返回自己的剩余硬币，如果硬币不够，抛出异常
    long transferCoins(@NotNull UUID fromId, @NotNull UUID toId, long coins, @NotNull String comment) throws Exception;

    @NotNull ChangeRecordService getChangeRecordService();

    @NotNull String getCoinsName();
}
