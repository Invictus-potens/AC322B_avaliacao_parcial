# GameNews

Aplicativo Android (Kotlin) de demonstração que exibe uma lista de notícias sobre jogos, permite marcar favoritos e ver o detalhe de cada notícia. Os dados são mockados localmente (sem backend).

## Stack

- Kotlin
- Android Views + ViewBinding (`buildFeatures.viewBinding = true` em `app/build.gradle.kts`) — não usa DataBinding nem `findViewById`
- AndroidX (AppCompat, Fragment, RecyclerView, Material Components)
- Gradle 8.9 (via wrapper, `gradlew`/`gradlew.bat`)
- compileSdk / targetSdk 35, minSdk 24

## Estrutura principal

```
app/src/main/java/com/example/gamenews/
├── model/Noticia.kt                 # data class da notícia (inclui imagemResId -> drawable local)
├── data/
│   ├── NoticiasMock.kt              # lista mockada de notícias (8 itens)
│   └── FavoritosRepository.kt       # guarda ids de notícias favoritas em memória
└── ui/
    ├── MainActivity.kt              # Activity principal, hospeda o fragment da lista
    ├── ListaNoticiasFragment.kt     # Fragment com RecyclerView da lista de notícias
    ├── NoticiaAdapter.kt            # Adapter do RecyclerView
    ├── DetalheNoticiaActivity.kt    # Tela de detalhe de uma notícia
    └── componentes/FavoritoComponente.kt  # botão de favoritar reutilizável
```

As imagens de capa das notícias 6, 7 e 8 (coletadas do blog da Instant Gaming) ficam em `app/src/main/res/drawable/` como arquivos locais (`noticia_zombie_games.jpg`, `noticia_mythology_games.jpg`, `noticia_october_games.jpg`), referenciados via `R.drawable.*` — o app funciona 100% offline, sem permissão de internet.

## Pré-requisitos

- Android Studio (recomendado: a versão mais recente estável) **ou** apenas o JDK 17 + Gradle wrapper para build via linha de comando.
- JDK 17 configurado (`JAVA_HOME`).
- Um emulador Android (API 24+) ou um dispositivo físico com depuração USB habilitada.

Não é necessária conexão com a internet para rodar o app (as imagens são locais); a internet só é usada na primeira vez para o Gradle baixar as dependências.

## Como testar pelo Android Studio (mais simples)

1. Abra o Android Studio → **Open** → selecione a pasta raiz do projeto (`AC322B_avaliacao_parcial`).
2. Aguarde o Gradle sincronizar (primeira vez baixa as dependências, precisa de internet).
3. Selecione um emulador na barra superior (ou conecte um celular Android com depuração USB) e clique em **Run ▶** (ou Shift+F10).
4. O app `GameNews` abre mostrando a lista de notícias.

## Como testar via linha de comando (sem abrir o Android Studio)

Na raiz do projeto:

```bash
# Windows
gradlew.bat assembleDebug

# Linux/Mac
./gradlew assembleDebug
```

O APK de debug é gerado em:

```
app/build/outputs/apk/debug/app-debug.apk
```

Para instalar num emulador/dispositivo já conectado (com `adb` no PATH):

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Para rodar os testes/checagens de compilação sem gerar o APK:

```bash
gradlew.bat compileDebugKotlin
```

## Roteiro de teste manual (fluxo esperado)

1. **Lista de notícias**: ao abrir o app, a tela inicial (`MainActivity` → `ListaNoticiasFragment`) mostra um `RecyclerView` com 8 notícias mockadas, cada card com categoria, título, resumo, data e imagem de capa.
2. **Favoritar**: toque no ícone de estrela em qualquer card — ele alterna entre estrela vazia/preenchida (estado mantido em memória via `FavoritosRepository`, não persiste entre reaberturas do app).
3. **Abrir detalhe**: toque em qualquer card (fora do botão de favorito) — abre `DetalheNoticiaActivity` com categoria, título, autor, data, imagem e o texto completo da notícia.
4. **Voltar**: use o botão de voltar da toolbar ou o botão de voltar do sistema para retornar à lista; o estado de favorito deve ser mantido.
5. **Notícias reais incluídas**: as notícias de id 6, 7 e 8 foram coletadas do blog da Instant Gaming (https://www.instant-gaming.com/en/blog/) como exemplo de conteúdo "real" misturado ao mock:
   - "The best zombie games (part 3)"
   - "The Best Mythology Games"
   - "The best games from October 2026 (Part 3)"

## Observações

- Não há persistência (banco de dados ou SharedPreferences): ao fechar e reabrir o app, os favoritos são resetados, pois `FavoritosRepository` guarda tudo em memória.
- Não há chamadas de rede: todas as notícias e imagens são estáticas, embutidas no APK — ideal para demonstração sem depender de backend ou internet em tempo de execução.
