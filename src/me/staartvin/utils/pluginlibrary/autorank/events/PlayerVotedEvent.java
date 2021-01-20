package me.staartvin.utils.pluginlibrary.autorank.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerVotedEvent extends Event {

    private Player player;

    public PlayerVotedEvent(Player player) {
        this.player = player;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    @NotNull
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
