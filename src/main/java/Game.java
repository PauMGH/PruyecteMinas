public class Game {
    public static void main(String[] args) {
        char[][] tablero = new char[10][2]; //recibirá su tema con el generador
        String coordenadas;

        Funcionalidades.generarTablero();

        //y aqui ya jugaremos, un while(hayanMinas) para que siga el juego mientras hayan minas
        //en el bucle iremos preguntando cordenada  la meteremos en la variable.
        //comprobaremos la coordenada hasta que sea valida(este dentro del tablero y no este usada
        //Despues recursivamente tendremos el metodo mágico
    }
}
