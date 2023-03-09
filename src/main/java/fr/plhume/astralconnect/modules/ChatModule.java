package fr.plhume.astralconnect.modules;

import fr.plhume.astralconnect.AstralConnect;
import org.bukkit.entity.Player;

import java.util.Objects;

public class ChatModule {

    public static boolean isChatEnabled() {
        return AstralConnect.getInstance().getConfig().getBoolean("modules.chat");
    }

    public static String getBroadcastPrefix(Player player, String msg) {
        return Objects.requireNonNull(AstralConnect.getInstance().getConfig().getString("messages.broadcast-prefix"))
                .replace("%player%", player.getDisplayName())
                .replace("%msg%", msg);
    }
}
