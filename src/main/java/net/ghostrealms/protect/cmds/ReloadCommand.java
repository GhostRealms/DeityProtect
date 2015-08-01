package net.ghostrealms.protect.cmds;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.ghostrealms.protect.RealmsProtect;
import net.md_5.bungee.api.ChatColor;

public class ReloadCommand {
    
    private final RealmsProtect plugin;
    
    public ReloadCommand(RealmsProtect plugin) {
        this.plugin = plugin;
    }
    
    public void run(CommandSender sender) {
        if(sender instanceof Player) {
            if(sender.isOp()) {
                //todo reload
                sender.sendMessage(plugin.getLanguage("prefix") + ChatColor.GREEN +
                                   "RealmsProtection has been reloaded.");
            } else {
                sender.sendMessage(plugin.getLanguage("prefix") + "no permission");
            }
        } else {
            //todo reload
            sender.sendMessage(plugin.getLanguage("prefix") + ChatColor.GREEN +
                "RealmsProtect has been reloaded.");
        }
    }
        
    
}
