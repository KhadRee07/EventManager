package de.langweilerlp.eventmanager.listener;

import de.langweilerlp.eventmanager.EventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.server.ServerListPingEvent;

public class MotdListener implements Listener {

    private EventManager main;

    // ❘ » •

    public MotdListener(EventManager main) {
        this.main = main;
        Bukkit.getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onPing(ServerListPingEvent e) {
        e.setMotd(main.getPrefix() + "§eSkyPvP§7-§eNetzwerk                              " +
                "§8» §aRelease §8• §c§k00§c.0782020 §7[§e1.16.1§7]");
    }

}