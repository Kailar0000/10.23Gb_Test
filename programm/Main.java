package programm;

import programm.controller.AnimalController;
import programm.services.AnimalList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        AnimalController controller = new AnimalController();

        controller.Run();
    }
}