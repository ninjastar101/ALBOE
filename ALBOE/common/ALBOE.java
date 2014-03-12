package ninjastar101.ALBOE.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import ninjastar101.ALBOE.common.ALBOECommonProxy;
import ninjastar101.ALBOE.common.handlers.ALBOEClientPacketHandler;
import ninjastar101.ALBOE.common.handlers.ALBOEServerPacketHandler;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"TutorialMod"}, packetHandler = ALBOEClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"TutorialMod"}, packetHandler = ALBOEServerPacketHandler.class)) //For serverside packet handling

//MOD BASICS
@Mod(modid="ALBOE",name="A Little Bit Of Everything",version="Release")

public class ALBOE {

@Instance("ALBOE") //The instance, this is very important later on
public static ALBOE instance = new ALBOE();

@SidedProxy(clientSide = "fisherman77.TutorialMod.client.TutorialModClientProxy", serverSide = "fisherman77.TutorialMod.common.TutorialModCommonProxy") //Tells Forge the location of your proxies
public static ALBOECommonProxy proxy;

@PreInit
public void PreInit(FMLPreInitializationEvent e){

}

@Init
public void InitALBOE(FMLInitializationEvent event){ //Your main initialization method

//MULTIPLAYER ABILITY
NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

}
}
