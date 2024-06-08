import java.io.File;
import java.utils.Scanner;

class DeleteFolders{
    public static void main(String[] args){
        System.out.println("Deleting folder using java program....!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter location of file/Folder : ");
        String location = sc.nextLine();
        sc.close();
        File file = new File(location);
        delDirs(file,0,file.list());
        System.out.println("\n........Folder is deleted successfully");
    }

    

    static void delDirs(File file,int idx, String[] list){
        if(idx >= list.length){ 
            file.delete();
            return;
        }

        File nf = new File(file,list[idx]);

        if(nf.isFile()){
            nf.delete();
        }else{
            delDirs(nf,0,nf.list()); 
        }

        delDirs(file,++idx,list);
    }
}
