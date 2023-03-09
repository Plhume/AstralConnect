package fr.plhume.astralconnect.modules;

import fr.plhume.astralconnect.AstralConnect;

public class ChatModule {

    public static boolean isChatEnabled() {
        return AstralConnect.getInstance().getConfig().getBoolean("modules.chat");
    }
}
