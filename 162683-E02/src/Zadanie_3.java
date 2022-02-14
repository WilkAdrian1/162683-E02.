import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadanie_3 {
    public static String[] podkatalogi(String path){
        File f = new File(path);
        return f.list(((dir, name) -> dir.isDirectory()));
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(podkatalogi("C:\\Users\\Adrian\\IdeaProjects\\162683-E02\\out")));
        System.out.println(Arrays.toString(podkatalogi("C:\\Users\\Adrian\\Desktop\\asd")));
    }
}
