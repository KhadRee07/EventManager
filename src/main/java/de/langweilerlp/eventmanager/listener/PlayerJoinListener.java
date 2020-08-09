package de.langweilerlp.eventmanager.listener;

import de.langweilerlp.eventmanager.EventManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    private EventManager main;
    // ❘ » •

    public PlayerJoinListener(EventManager main) {
        this.main = main;
        Bukkit.getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        e.setJoinMessage(null);

        p.sendMessage(" ");
        p.sendMessage("§7§m«§8 ---------- §9Pleb§bCraft§8 ---------- §7§m»");
        p.sendMessage(main.getPrefix() + "§7Willkommen, §a" + p.getName());

        p.setPlayerListHeader("\n" +
                "§8» §9Pleb§bCraft.de §8«\n" +
                "\n " +
                "§8» §7Du spielst auf §8• §a" + p.getWorld().getName() + "\n" +
                "");
        p.setPlayerListFooter("\n" +
                "§8» §eForum §8• §cComing soon\n" +
                "§8» §eDiscord §8• §a/Discord\n" +
                "");
    }

}