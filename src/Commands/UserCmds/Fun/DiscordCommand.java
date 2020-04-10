package Commands.UserCmds.Fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import utils.Files.Messages;
import utils.Utils;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        FileConfiguration m = Messages.get();

        if (command.getName().equalsIgnoreCase("discord")) {
            Player player = (Player) sender;
            player.sendMessage(Utils.chat(m.getString("Discord")));
        }
        return false;
    }
}
