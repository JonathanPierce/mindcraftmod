package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class Experiment implements ICommand
{
  private List aliases;
  private Pmatch pmatchcommand;
  private Tmaze tmazecommand;
  
  public Experiment(Pmatch _pmatchcommand, Tmaze _tmazecommand)
  {
    this.aliases = new ArrayList();
    this.aliases.add("experiment");
    
    this.pmatchcommand = _pmatchcommand;
    this.tmazecommand = _tmazecommand;
  }

  @Override
  public String getCommandName()
  {
    return "experiment";
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "experiment <tba>";
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
    
    this.pmatchcommand.start();
    icommandsender.addChatMessage(new ChatComponentText("Experiment: [" + astring[0] + "]"));
    
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
}
