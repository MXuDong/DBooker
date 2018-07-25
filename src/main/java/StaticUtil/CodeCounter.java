package StaticUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CodeCounter {
    public static void main(String[] args){
        CodeCounter codeCounter = new CodeCounter();
        ArrayList<File> files = codeCounter.getFiles();
        CounterRes counterRes = new CounterRes();
        for(File F : files){
            CounterRes res = codeCounter.Reader(F);
            counterRes.addRes(res);
        }

        System.out.println(counterRes.Lines + ":" + counterRes.Letters);
    }

    public ArrayList getFiles(){
//        File dictory = new File(new File("").getAbsolutePath() + "\\");
        File dictory = new File("G:\\IntellijWorkSpace\\DBooker");
        File [] files = dictory.listFiles();
        ArrayList<File> path = new ArrayList<File>(), filesRes = new ArrayList<File>();
        ArrayList<File> newPath = new ArrayList<File>();
        addPathOrFiles(files, path, filesRes);
        getFiles(path, filesRes);
        return filesRes;
    }

    private boolean getIsCanBeCount(File F){
        return F.getAbsolutePath().endsWith(".xml") ||
                F.getAbsolutePath().endsWith(".java")||
                F.getAbsolutePath().endsWith(".jsp");
    }

    private void addPathOrFiles(File[] allFile ,ArrayList<File> newPath, ArrayList<File> files){
        for(File F : allFile){
            if(F.isDirectory()){
                newPath.add(F);
            }else{
                if(getIsCanBeCount(F))
                    files.add(F);
            }
        }
    }

    private void getFiles(ArrayList<File> path, ArrayList<File> files){
        for(File f : path){
            File[] nowFiles = f.listFiles();
            ArrayList<File> newPath = new ArrayList<File>();
            addPathOrFiles(nowFiles, newPath, files);
            getFiles(newPath, files);
        }
    }

    public CounterRes Reader(File file){
        CounterRes Res = new CounterRes();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String temp = "";
            while((temp = br.readLine()) != null){
                Res.Lines++;
                Res.Letters += temp.length();
            }
        }catch (IOException E){

        }

        return Res;
    }
}

class CounterRes{
    public int Lines;
    public int Letters;

    public CounterRes(){
        Lines = 0;
        Letters = 0;
    }

    public void addRes(CounterRes counterRes){
        Lines += counterRes.Lines;
        Letters += counterRes.Letters;
    }

    public CounterRes getCounterRes(){
        return this;
    }
}
