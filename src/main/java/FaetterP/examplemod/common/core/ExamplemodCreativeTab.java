package FaetterP.examplemod.common.core;

import FaetterP.examplemod.client.lib.LibResources;
import FaetterP.examplemod.common.item.ModItems;
import FaetterP.examplemod.common.lib.LibMisc;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

public class ExamplemodCreativeTab extends CreativeTabs {
    public static final ExamplemodCreativeTab INSTANCE = new ExamplemodCreativeTab();
    NonNullList<ItemStack> list;

    public ExamplemodCreativeTab() {
        super(LibMisc.MOD_ID);
        //setNoTitle();
        setBackgroundImageName(LibResources.GUI_CREATIVE);
    }

    @Nonnull
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.pestleAndMortar);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public void displayAllRelevantItems(@Nonnull NonNullList<ItemStack> list) {
        this.list = list;

        addItem(ModItems.pestleAndMortar);
        addItem(ModItems.clip);
    }

    private void addItem(Item item) {
        item.getSubItems(this, list);
    }
}
