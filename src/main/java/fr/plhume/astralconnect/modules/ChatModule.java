package fr.plhume.astralconnect.modules;

import fr.plhume.astralconnect.config.PluginConfig;

public class ChatModule {

    public static void setChatModule(boolean status) {
        PluginConfig.getConfig().set("modules.chat", status);
    }
}
