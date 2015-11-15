package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class Tmaze implements ICommand
{
  private List aliases;
  public Tmaze()
  {
    this.aliases = new ArrayList();
    this.aliases.add("tmaze");
  }

  @Override
  public String getCommandName()
  {
    return "tmaze";
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "tmaze <tba>";
  }

  @Override
  public List getCommandAliases()
  {
    return this.aliases;
  }

  @Override
  public void processCommand(ICommandSender icommandsender, String[] astring)
  {
    if(astring.length == 0)
    {
    	icommandsender.addChatMessage(new ChatComponentText("Invalid command."));
      return;
    }
    
    icommandsender.addChatMessage(new ChatComponentText("tmaze: [" + astring[0] + "]"));
    
  }

  @Override
  public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
  {
    return true;
  }

  @Override
  public List addTabCompletionOptions(ICommandSender icommandsender,
      String[] astring)
  {
    return null;
  }

  @Override
  public boolean isUsernameIndex(String[] astring, int i)
  {
    return false;
  }

  @Override
  public int compareTo(Object o)
  {
    return 0;
  }
  
  public void start() {
	  
  }
  
  public void end() {
	  
  }
}
