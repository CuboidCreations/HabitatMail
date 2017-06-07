/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.Xeiotos.HabitatMail;

import java.util.LinkedList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Chris
 */
public class Mail extends JavaPlugin {
    
    LinkedList<ItemStack> items;
    
    public String serialise() {
        for (ItemStack itemStack : items) {
            itemStack.serialize();
        }
        return null;
    }
}
