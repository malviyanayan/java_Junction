import java.io.File;

class DeleteFolders{
    public static void main(String[] args){
        File file = new File("E:\\java_prac\\java codes\\file_handling\\nayan");
        delDirs(file,0,file.list());
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