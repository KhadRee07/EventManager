package de.langweilerlp.eventmanager;

import de.langweilerlp.eventmanager.listener.HitDelayManager;
import de.langweilerlp.eventmanager.listener.MotdListener;
import de.langweilerlp.eventmanager.listener.PlayerJoinListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class EventManager extends JavaPlugin implements Listener {

    private static final String PREFIX = "§8» §9Pleb§bCraft §8❘ §r";

    @Override
    public void onEnable() {
        new HitDelayManager(this);
       new MotdListener(this);
        new PlayerJoinListener(this);
    }

    @Override
    public void onDisable() {

    }

    public String getPrefix() {
        return PREFIX;
    }
}
