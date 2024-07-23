import java.io.File;
public class FileCreate {
    public static void main(String[] args) {
        File f=new File("firstfile.txt",true);
        try {
            if (f.createNewFile()) {
                System.out.println("Created Successfully");
            } else {
                System.out.println("Already created");
            }
        }
        catch (Exception e)
        {
            System.out.println("An error occured" + e.getMessage());
        }
    }
}
