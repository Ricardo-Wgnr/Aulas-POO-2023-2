package engtelecom.poo;

import raytracer.ABunchOfSpheres;

public class Filme implements Runnable{

    private int num_quadro = 0;
    private ABunchOfSpheres movie = new ABunchOfSpheres();

    public void run() {
        movie.render_scene("./frame_" + String.format("%05d", num_quadro) + ".png", num_quadro);
        num_quadro++;
    }
}
