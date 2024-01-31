package cn.paper_card.player_coins.api;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface ChangeRecordService {

    @NotNull List<ChangeRecord> queryLatest(@NotNull UUID uuid, int limit, int offset) throws Exception;

    @NotNull List<ChangeRecord> queryLatestOut(@NotNull UUID uuid, int limit, int offset) throws Exception;

}
