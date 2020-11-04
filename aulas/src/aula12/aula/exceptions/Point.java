package aula12.aula.exceptions;

class Point {
    final int x;
    final int y;
    Point(int x, int y) {
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Valores não negativos!");
        }
        this.x = x;
        this.y = y;
    }

    // Testes (remover comentarios para testar)
    public static void main(String[] args) {
        // Teste exceçao coordenada invalida
        // Deve emitir erro na consola
        // Point p = new Point(-1, 1);
    }
}