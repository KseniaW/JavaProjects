package com.syntax1.class16;

public abstract class File {
    public abstract  void open();
    public void edit(){
        System.out.println("I can edit");
    }
    public void close(){
        System.out.println("I can close");
    }
}
class JavaFile extends File{
    public void open(){
        System.out.println("we need notepad");
    }
}

class WordFile extends File{
    public void open(){
        System.out.println("you need microsoft");
    }
}
class PdfFile extends File{
    public void open(){
        System.out.println("you need PDF program");
    }
}
class CallFile{
    public static void main(String[] args) {
        File[] allFiles={new JavaFile(),new PdfFile(),new WordFile()};
        for(File file:allFiles){
            file.open();
            file.edit();
            file.close();
        }
    }
}
