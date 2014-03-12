package ninjastar101.ALBOE.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockConveyer extends Block
{
        public BlockConveyer(int par1)
        {
                super(par1, Material.ice); //You can set different materials, check them out!
        }
        public void registerIcons(IconRegister iconRegister)
        {
                         blockIcon = iconRegister.registerIcon("ALBOE:Conveyer");//Telling Forge where our texture is
        }
}