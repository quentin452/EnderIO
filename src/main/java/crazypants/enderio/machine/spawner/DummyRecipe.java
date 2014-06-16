package crazypants.enderio.machine.spawner;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.ItemStack;
import crazypants.enderio.ModObject;
import crazypants.enderio.crafting.IEnderIoRecipe;
import crazypants.enderio.machine.IMachineRecipe;
import crazypants.enderio.machine.MachineRecipeInput;
import crazypants.enderio.machine.IMachineRecipe.ResultStack;
import crazypants.enderio.power.Capacitors;

public class DummyRecipe implements IMachineRecipe {

  @Override
  public String getUid() {
    return "PoweredTaskRecipe";
  }

  @Override
  public float getEnergyRequired(MachineRecipeInput... inputs) {
    //NB: This value is not actually used, see createTask in the tile
   return TilePoweredSpawner.POWER_PER_TICK_ONE * 800;
  }

  @Override
  public boolean isRecipe(MachineRecipeInput... inputs) {
    return true;
  }

  @Override
  public ResultStack[] getCompletedResult(float randomChance, MachineRecipeInput... inputs) {
    return new ResultStack[0];
  }

  @Override
  public float getExperianceForOutput(ItemStack output) {
    return 0;
  }

  @Override
  public boolean isValidInput(MachineRecipeInput input) {
    return false;
  }

  @Override
  public String getMachineName() {
    return ModObject.blockPoweredSpawner.unlocalisedName;
  }

  @Override
  public List<MachineRecipeInput> getQuantitiesConsumed(MachineRecipeInput[] inputs) {
    return Collections.emptyList();
  }

  @Override
  public List<IEnderIoRecipe> getAllRecipes() {
    return Collections.emptyList();
  }

}