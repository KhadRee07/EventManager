package de.langweilerlp.eventmanager.listener;

import de.langweilerlp.eventmanager.EventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class CommandListener implements Listener {

    private EventManager main;

    // ❘ » •

    public CommandListener(EventManager main) {
        this.main = main;
        Bukkit.getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent e) {

        String[] args = e.getMessage().split(" ");

        if (Bukkit.getHelpMap().getHelpTopic(e.getMessage()) == null) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(main.getPrefix() + "§7Der Befehl §a" + e.getMessage() +  " §7existiert nicht auf dem Netzwerk");
        }

    }

}