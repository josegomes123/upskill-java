package testemodelo1;

// Pergunta 4 a' e b'
public class Armour extends GameItem implements ImageTile {
    private DamageType type;
    private int damage;
    private int durability;

    public Armour(DamageType type, int damage, int durability) {
        this.type = type;
        this.damage = damage;
        this.durability = 10; // Começa durability a 10
    }

    // Decresce durabilidade com cada ataque
    public void decreaseDurability(int durability) {
        this.durability -= durability;
    }


    public int getDurability() {
        return durability;
    }

    // Implementaçao metodos da classe abstracta GameItem
    public boolean isProtection() {
        return true;
    }

    public int getDamage() {
        return damage;
    }
}

/**
 * Classe que representa o heroi
 */
public class Hero {
    // Guarda items que o heroi tem actualmente
    private ArrayList<GameItem> itemsHeroi;
    private int vida; // Vida actual do heroi


    /**
     * Danifica o heroi com uma determinada quantidade de dano
     * que pode ser do tipo ARMA ou FOGO
     */
    public void takeDamage(int quantidadeDeDano, DamageType tipo) {
        //Guarda dano protegido no total das armours todas
        int danoProtegidoTotal = 0;
        // Percorre a lista de items do heroi,
        for (GameItems item : itemsHeroi){
            // Se tiver armour nos items, faz calculos
            if (item.isProtection()) {
                // adiciona o dano protegido por cada armour ao total
                danoProtegidoTotal += armour.getDamage();
                // Diminui a durability da armour
                item.decreaseDurability(1);
                //Se ja nao tiver durability, entao remove a armour do heroi
                if (item.getDurability() == 0) {
                    itemsHeroi.remove(item);
                }
            }
        }
        // Calcula o dano real (quantidade de dano menos o dano protegido)
        int danoReal = quantidadeDeDano - danoProtegidoTotal;
        // Só dá dano se nao for tudo protegido pela armour
        if (danoReal > 0){
            this.vida -= danoReal;

        }
    }
}



// PERGUNTA 5 a' e b'

public class Bat extends Enemy {
    int damage = 2; //dano do bat
    DamageType type = ARMA; //Tipo de dano do bat

    @Override
    public void move() {
        Vector2D distanciaPraHeroi = directionToHero(this.position);
        // Se o x ou y deste vector distancia foi superior a 2 ou inferior a -2
        // quer dizer que tem distancia maior de 2 quadrados
        if (((distanciaPraHeroi.getX() > 2) || (distanciaPraHeroi.getX() < -2)) || ((distanciaPraHeroi.getY() > 2) || (distanciaPraHeroi.getY() < -2))){
            //Nesse caso faz o movimento normal da classe base para o movimento aleatorio
            super.move();
            // Caso contrario faz movimento em direçao ao heroi
        } else {
            //Obtem  o vector minimo a andar na direçao do heroi com o maximal direction
            // e obtem a nova posiçao para o inimigo andar com base nessa direçao com o position.plus
            Position novaPosicao = position.plus(maximalDirection(distanciaPraHeroi));
            // Se conseguir, entao move para essa posiçao (nao colidir com nada)
            if (game.canMoveTo(novaPosicao)){
                this.setPosition(novaPosicao);
                // Caso contrario verifica se colide com o heroi, assumindo que o heroi
                // tem inspector no game e temos um  getPosition() no heroi
                // e tambem temos o equals() na classe Position para testar se 2 posicoes sao iguais
            } else if (game.getHero().getPosition().equals(novaPosicao)){
                // a nova posiçao do inimigo e a posicao actual do heroi colidem, nesse caso dar dano ao heroi
                game.getHero().takeDamage(this.damage, this.type);
            }
        }


    }
}


public class Game {
    private Hero hero; //o atributo hero tem inspector
    private List<Enemy> enemies; //o atributo enemies n~ao tem inspector


    // Metodo que move todos os inimigos da sala
    public void moveAllEnemies(){
        for (Enemy e: enemies){
            e.move();
        }
    }



}





