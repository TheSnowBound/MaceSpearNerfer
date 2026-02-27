package me.ltshadowtm.SpearMaceNerfer.event;

import org.bukkit.damage.DamageType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeath implements Listener {
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        if (e.getDamageSource().getDamageType() == DamageType.MACE_SMASH) {
            e.setCancelled(true);
            e.setReviveHealth(2);
        } else if (e.getDamageSource().getDamageType() == DamageType.SPEAR) {
            e.setCancelled(true);
            e.setReviveHealth(2);
        }
    }
}
