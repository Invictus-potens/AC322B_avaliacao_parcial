package com.example.gamenews.data

import com.example.gamenews.R
import com.example.gamenews.model.Noticia

object NoticiasMock {

    val noticias: List<Noticia> = listOf(
        Noticia(
            id = 6,
            titulo = "The best zombie games (part 3)",
            resumo = "Fechando a série, mais dez jogos que mostram toda a diversidade do gênero zumbi.",
            conteudo = "Depois de duas listas dedicadas aos mortos-vivos, chegou a hora de pegar os bastões, " +
                "espingardas e coquetéis molotov uma última vez. Para encerrar essa série, reunimos mais dez jogos " +
                "que mostram toda a diversidade do gênero, da sobrevivência implacável à ação cooperativa, " +
                "passando por estratégia, puro horror e até algumas reviravoltas bem originais.\n\n" +
                "Back 4 Blood expande a fórmula de hordas de zumbis e cooperação para quatro jogadores com um " +
                "sistema de mapas personalizável. Resident Evil 2 Remake e Resident Evil 4 Remake seguem entre " +
                "as melhores portas de entrada para o survival horror moderno. Já They Are Billions traz o " +
                "apocalipse zumbi para os fãs de estratégia, enquanto Dying Light: The Beast mistura parkour e " +
                "combate brutal em um mundo infestado.",
            categoria = "Listas",
            dataPublicacao = "07/10/2026",
            autor = "Enzo",
            imagemResId = R.drawable.noticia_zombie_games,
        ),
        Noticia(
            id = 7,
            titulo = "The Best Mythology Games",
            resumo = "Uma seleção de jogos que exploram diferentes mitologias ao redor do mundo.",
            conteudo = "Os jogos eletrônicos também recorrem à mitologia como fonte de inspiração para criar " +
                "mundos ricos e interessantes, sem necessariamente buscar recriá-los fielmente. Alguns jogos " +
                "realmente recontam mitos, enquanto outros os usam apenas como inspiração.\n\n" +
                "Começando pela mitologia grega, God of War III Remastered coloca Kratos para destruir o " +
                "Monte Olimpo em busca de vingança, enquanto Hades oferece uma abordagem mais leve. " +
                "Assassin's Creed Origins leva os jogadores ao Egito Antigo, e Raji: An Ancient Epic explora " +
                "a mitologia hindu. Hellblade: Senua's Sacrifice mistura crenças celtas e nórdicas, e " +
                "Black Myth: Wukong se destaca na mitologia chinesa.",
            categoria = "Listas",
            dataPublicacao = "05/10/2026",
            autor = "Enzo",
            imagemResId = R.drawable.noticia_mythology_games,
        ),
        Noticia(
            id = 8,
            titulo = "The best games from October 2026 (Part 3)",
            resumo = "Terceira e última parte da seleção dos melhores lançamentos de outubro de 2026.",
            conteudo = "Chegou a hora de apresentar a terceira e última parte da seleção dos melhores jogos de " +
                "outubro de 2026, destacando os lançamentos mais interessantes entre os dias 20 e 31 do mês.\n\n" +
                "Final Fantasy Resonance revisita a estética dos primeiros jogos da saga com um RPG em pixel art. " +
                "Call of Duty: Modern Warfare 4 leva a série a um conflito global com uma invasão em larga escala " +
                "da Península Coreana. Já Phantom Blade Zero se destaca como um dos lançamentos mais aguardados, " +
                "um RPG de ação inspirado em wuxia com combate veloz e visual cinematográfico feito em " +
                "Unreal Engine 5.\n\nNa frente de DLCs, Farming Simulator 25 recebe a expansão Beans & Alpacas, " +
                "ambientada em uma região inspirada na América do Sul.",
            categoria = "Lançamentos",
            dataPublicacao = "02/10/2026",
            autor = "Enzo",
            imagemResId = R.drawable.noticia_october_games,
        ),
        Noticia(
            id = 1,
            titulo = "Novo RPG de mundo aberto ganha data de lançamento",
            resumo = "Estúdio revela trailer inédito e confirma lançamento para o próximo ano.",
            conteudo = "Durante uma transmissão ao vivo, o estúdio apresentou um novo trailer do aguardado RPG de mundo aberto. " +
                "O jogo contará com mapa até três vezes maior que o do título anterior, sistema de clima dinâmico e " +
                "escolhas que afetam o rumo da história.\n\nA pré-venda começa no mês que vem em todas as plataformas.",
            categoria = "Lançamentos",
            dataPublicacao = "09/10/2026",
            autor = "Ana Souza",
        ),
        Noticia(
            id = 2,
            titulo = "Final do campeonato mundial bate recorde de audiência",
            resumo = "Mais de 5 milhões de espectadores simultâneos acompanharam a decisão.",
            conteudo = "A grande final do campeonato mundial de e-sports foi decidida em uma série melhor de cinco partidas. " +
                "A equipe campeã virou o confronto após perder os dois primeiros mapas.\n\n" +
                "A organização já anunciou que a próxima edição será realizada na América do Sul.",
            categoria = "E-sports",
            dataPublicacao = "08/10/2026",
            autor = "Carlos Lima",
        ),
        Noticia(
            id = 3,
            titulo = "Atualização gratuita adiciona modo cooperativo",
            resumo = "Jogadores poderão explorar a campanha com até quatro amigos.",
            conteudo = "A nova atualização gratuita traz um modo cooperativo para até quatro jogadores, novas armas e " +
                "melhorias de desempenho em todas as plataformas.\n\nO patch já está disponível para download.",
            categoria = "Atualizações",
            dataPublicacao = "07/10/2026",
        ),
        Noticia(
            id = 4,
            titulo = "Indie brasileiro conquista prêmio internacional",
            resumo = "Jogo de plataforma feito por equipe de cinco pessoas foi eleito o melhor indie do ano.",
            conteudo = "Desenvolvido por um pequeno estúdio de São Paulo, o jogo de plataforma em pixel art venceu a " +
                "categoria de melhor jogo independente em uma premiação internacional.\n\n" +
                "A equipe planeja lançar uma versão para consoles ainda este ano.",
            categoria = "Indies",
            dataPublicacao = "05/10/2026",
            autor = "Beatriz Rocha",
        ),
        Noticia(
            id = 5,
            titulo = "Nova geração de consoles portáteis é anunciada",
            resumo = "Fabricante promete tela maior e bateria com o dobro de duração.",
            conteudo = "O novo console portátil terá tela de 8 polegadas, armazenamento expansível e bateria com " +
                "autonomia de até 10 horas.\n\nO preço oficial ainda não foi divulgado.",
            categoria = "Hardware",
            dataPublicacao = "03/10/2026",
        ),
    )

    fun buscarPorId(id: Int): Noticia? = noticias.find { it.id == id }
}
