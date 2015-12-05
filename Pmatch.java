package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import sun.net.www.http.*;


public class Pmatch implements ICommand
{
  private List aliases;
  public Pmatch()
  {
    this.aliases = new ArrayList();
    this.aliases.add("pmatch");
  }

  @Override
  public String getCommandName()
  {
    return "pmatch";
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "pmatch <tba>";
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
    
    icommandsender.addChatMessage(new ChatComponentText("Pmatch: [" + astring[0] + "]"));
    start();
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
	  JSONhandler.sendJSON(125, "Start", "null");
  }
  
  public void end() {
  }
  
}
