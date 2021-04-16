package me.frogcorp.frogfacts.commands;

import me.frogcorp.frogfacts.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

public class frogfact implements CommandExecutor {
    private final Main main;

    public frogfact(Main main){
        this.main = main;
    }

    String[] facts = {"There is evidence that frogs have roamed the Earth for more than 200 million years","The world's largest frog is the goliath frog of West Africa—it can grow to 15 inches and weigh up to 7 pounds.","One of the smallest frogs is the Cuban tree toad, which grows to half an inch long.","While the life spans of frogs in the wild are unknown, frogs in captivity have been known to live more than 20 years.","There are over 6,000 species of frogs worldwide."};
    Random rand = new Random();
    int num = 0;


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
        Player player = (Player) sender;

        num = rand.nextInt(facts.length);
        player.sendMessage(ChatColor.GREEN + facts[num]);

        return true;
        }
        else{
        main.getLogger().info("You have to be a player to use this command");
        return true;
        }
    }
}
