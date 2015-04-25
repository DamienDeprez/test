import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

/**
 * Created by damien on 24/04/15.
 */
public class launcher {

    public static void main (String [] args)
    {
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        final Mod mod = new Mod(1,"test", Arrays.asList("test0,test1"));

        String string = gson.toJson(mod,Mod.class);
        System.out.println(string);

        final Mod mod1 = gson.fromJson(string,Mod.class);
        System.out.print(mod1);
    }
}
