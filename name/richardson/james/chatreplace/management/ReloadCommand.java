/*******************************************************************************
 * Copyright (c) 2011 James Richardson.
 * 
 * ReloadCommand.java is part of TimedMessages.
 * 
 * TimedMessages is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * TimedMessages is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * TimedMessages. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package name.richardson.james.chatreplace.management;

import java.io.IOException;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

import name.richardson.james.bukkit.util.command.CommandUsageException;
import name.richardson.james.bukkit.util.command.PlayerCommand;
import name.richardson.james.chatreplace.ChatReplace;

public class ReloadCommand extends PlayerCommand {

  public static final String NAME = "reload";
  public static final String DESCRIPTION = "Reload patterns and configuration.";
  public static final String PERMISSION_DESCRIPTION = "Allow users to reload patterns and configuration.";
  public static final String USAGE = "";

  public static final Permission PERMISSION = new Permission("chatreplace.reload", PERMISSION_DESCRIPTION, PermissionDefault.OP);

  private final ChatReplace plugin;

  public ReloadCommand(ChatReplace plugin) {
    super(plugin, NAME, DESCRIPTION, USAGE, PERMISSION_DESCRIPTION, PERMISSION);
    this.plugin = plugin;
  }
  
  @Override
  public void execute(CommandSender sender, Map<String, Object> arguments) throws CommandUsageException {
    try {
      plugin.reload();
    } catch (IOException exception) {
      throw new CommandUsageException("Unable to reload configuration!");
    }
    sender.sendMessage(ChatColor.GREEN + "ChatReplace has been reloaded.");
  }

}
