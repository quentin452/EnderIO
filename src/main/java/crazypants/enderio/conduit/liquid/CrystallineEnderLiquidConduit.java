package crazypants.enderio.conduit.liquid;

import com.enderio.core.client.render.IconUtil;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class CrystallineEnderLiquidConduit extends AbstractEnderLiquidConduit {

  public static final Type TYPE = Type.CRYSTALLINE;
  public static final int METADATA = 3;
  public static final String ICON_KEY = "enderio:liquidConduitCrystallineEnder";
  public static final String ICON_CORE_KEY = "enderio:liquidConduitCoreCrystallineEnder";

  static IIcon iconKey;
  static IIcon iconCoreKey;

  @SideOnly(Side.CLIENT)
  public static void initIcons() {
    IconUtil.addIconProvider(new IconUtil.IIconProvider() {

      @Override
      public void registerIcons(IIconRegister register) {
        iconKey = register.registerIcon(ICON_KEY);
        iconCoreKey = register.registerIcon(ICON_CORE_KEY);
      }

      @Override
      public int getTextureType() {
        return 0;
      }

    });
  }

  @Override
  public Type getType() {
    return TYPE;
  }

  @Override
  public int getMetadata() {
    return METADATA;
  }

  @Override
  protected IIcon getIconKey() {
    return iconKey;
  }

  @Override
  protected IIcon getIconCoreKey() {
    return iconCoreKey;
  }
}