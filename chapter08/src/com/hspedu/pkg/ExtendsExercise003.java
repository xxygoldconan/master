package com.hspedu.pkg;

public class ExtendsExercise003 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 64, 1024, "Lenovo");
        pc.printInfo();

        NotePad notePad = new NotePad("AMD", 6, 128, "blue");
        notePad.printInfo();
    }
}


