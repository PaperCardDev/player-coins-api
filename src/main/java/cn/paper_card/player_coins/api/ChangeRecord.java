package cn.paper_card.player_coins.api;

import java.util.UUID;

public record ChangeRecord(
        int id, // 记录ID
        UUID playerId, // 玩家
        long change, // 变动
        long coins, // 剩余硬币
        long time, // 时间
        String remark // 备注
) {
}
