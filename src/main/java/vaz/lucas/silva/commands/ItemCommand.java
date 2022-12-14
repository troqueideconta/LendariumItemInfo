package vaz.lucas.silva.commands;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("iteminfo"))
         if (!player.hasPermission("plugins.admin")){
            sender.sendMessage("§cVocê não tem permissão.");
            return true;
        }
        ItemStack item = player.getItemInHand();
        if (item == null || item.getType() == Material.AIR) {
            player.sendMessage("§cVocê precisa segurar um item para isso.");
            player.playSound(player.getLocation(), Sound.VILLAGER_NO, 10, 1);
            return true;
        }
        player.sendMessage("§eItem: §f" + item.getType().toString() + ":" + item.getData().getData() + "§e.");
        player.playSound(player.getLocation(), Sound.ORB_PICKUP, 10, 1);
        return false;
    }
}
