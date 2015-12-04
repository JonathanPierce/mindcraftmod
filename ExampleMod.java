package com.example.examplemod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import com.example.examplemod.Experiment;
import com.example.examplemod.Pmatch;
import com.example.examplemod.Tmaze;

@Mod(name = "Mindcraft", modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "mindcraft";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		System.out.println("STARTED MINDCRAFT MOD!\n\n\n\n");
    }
    
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    	// register our custom commands
    	Pmatch pmatchcommand = new Pmatch();
    	Tmaze tmazecommand = new Tmaze();
    	event.registerServerCommand(pmatchcommand);
    	event.registerServerCommand(tmazecommand);
    	event.registerServerCommand(new Experiment(pmatchcommand, tmazecommand));
    }
}
