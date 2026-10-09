package com.example.gamenews.data

import com.example.gamenews.model.Noticia

object NoticiasMock {

    val noticias: List<Noticia> = listOf(
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
