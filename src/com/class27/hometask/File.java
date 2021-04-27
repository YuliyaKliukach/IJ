package com.class27.hometask;

abstract public class File {
    abstract void open();
    public void edit() {
        System.out.println("This file could be edited");
    }
    public void close() {
        System.out.println("This file should be saved before closing");
    }
}
class JavaFile extends File {
    @Override
    void open() {
        System.out.println("To open an Java file we need Notepad++ to be installed");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("To open an Word file we need Microsoft Office to be installed");
    }
}
class PDFFile extends File {
    @Override
    void open() {
        System.out.println("To open an PDF file we need Adobe app to be installed");
    }

    public static void main(String[] args) {
        File [] filearr={new PDFFile(), new JavaFile(), new WordFile()};
        for (File file:filearr
             ) {
            file.close();
            file.open();
            file.edit();
        }
    }
}
