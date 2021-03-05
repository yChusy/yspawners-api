# ySpawners API

Nesse tópico você irá encontrar os métodos e explicações sobre a API do ySpawners.

## Verificando se é um mob do plugin

    Entity entity = e.getEntity(); // pegando uma entidade de um evento
    boolean isSpawnerMob = YSpawnersAPI.isSpawnerMob(entity); // retornando o valor afirmativo ou negativo.

## Gerindo um Player

    Player p = e.getPlayer(); // pegando um player de um evento
    PlayerSpawner player = YSpawnersAPI.getPlayer(p); // gerindo um player do plugin.
    
## Gerindo os atributos principais do jogador

    Player p = e.getPlayer(); // pegando um player de um evento
    double limiteCompra = getLimiteCompra.getXp(p); // retorna a quantia de limite de compra de spawners do jogador
    double limiteSpawners = YSpawnersAPI.getLimiteSpawners(p); // retorna a quantia de limite de spawners do jogador
    double limiteDrops = YSpawnersAPI.getLimiteDrops(p); // retorna a quantia de limite de drops armazenados do jogador
    double xp = YSpawnersAPI.getXp(p); // retorna a quantia de xp para evolução da matadora do jogador.
