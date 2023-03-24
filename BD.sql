use streamingvaldisnei;

insert into ator(nome, genero, data_de_nascimento, premiacao, formacao ) values
("jenifer Santos", "Feminino", "07/01/1990", "Oscar", "Teatro"), 
("Lindsey Rogers", "Não Binário", "02/04/1982", "Oscar", "Cinema"), 
("Lorran Torres", "Masculino", "07/03/1970", "Oscar", "Cinema"), 
("Michael Gomez", "Não Binário", "03/12/1975", "Oscar", "Teatro"), 
("Larissa Lisboa", "Feminino", "20/09/1991", "Oscar", "Cinema"), 
("Carlos Alberto", "Masculino", "23/11/1988", "Oscar", "Cinema");


insert into musico(nome, genero, data_de_nascimento, premiacao, atuacao ) values
("Alef Ferreira", "Masculino", "05/12/1985", "Gremmy Awards", "vocal"), 
("Julia Santos", "Feminino", "07/01/1990", "Gremmy Awards", "instrumental"),
("Grace Rogers", "Não Binário", "02/04/1982", "Gremmy Awards", "instrumental"), 
("Jhonatan Torres", "Masculino", "07/03/1970", "Gremmy Awards", "vocal"), 
("Matheus Gomez", "Não Binário", "03/12/1975", "Gremmy Awards", "vocal"), 
("Fernanda Lisboa", "Feminino", "20/09/1991", "Gremmy Awards", "instrumental"), 
("Icaro Alberto", "Masculino", "23/11/1988", "Gremmy Awards", "vocal");


insert into usuario(email, nome, senha) values
("arthur_carvalh4@exemplo.com", "Arthur Gomes", "Gare1986"),
("brucastro2002@exemplo.com", "Bruna Martins", "Stergue69"),
("amelosong@exemplo.com", "Amanda Gomes", "Gare1986");


insert into filme(titulo, ano, duracao, genero, tipo, diretor, produtor, sinopse, capa, banner) values
("The Batman", 2021, 160.0, "ação/super-heroi", "Longa metragem", "Matt Reevess", "Dylan Clark", "No Halloween, o prefeito de Gotham City, Don Mitchell Jr...",
 "url(https://lh3.googleusercontent.com/-Fzu5QEQ98hM/YYvcfgpoEWI/AAAAAAAAPhI/W1eDcYJ41KcmHOYrvJLt6ArK6mupqNtWwCLcBGAsYHQ/w429-h640/FD1uKE8WUA4vWAE.jpg" ,
 "url(https://www.masslive.com/resizer/jtZHY24_FiK5zfGsbaxvr7Ihza0=/1280x0/smart/cloudfront-us-east-1.images.arcpublishing.com/advancelocal/FJIADZXU7VEITMWWKC333GR23A.png)"),

("Spider-Man: Sem volta pra casa", 2021, 148.0, "ação/super-heroi", "Longa metragem" ,"Josef Jhonson", "Josh Morales", "Peter Parker tem a sua identidade secreta revelada e pede ajuda ao Doutor Estranho...",
"url(https://i0.wp.com/www.popsfera.com.br/wp-content/uploads/2021/11/BB266E4D-ECD6-474B-98A0-9E40077732B7.jpeg?resize=800%2C1000&ssl=1)" , "url(https://becoliterario.com/wp-content/uploads/2022/03/i542482.jpeg)"),

("Uncharted: Fora do Mapa", 2022, 116.0, "ação", "Longa metragem", "Ruben Fleischers", "Charles Roven", "Nathan Drake e seu parceiro canastrão Victor (Sully) Sullivan embarcam em uma perigosa busca para encontrar omaior tesouro jamais encontrado...", 
"url(https://www.sonypictures.com.br/sites/brazil/files/2022-04/UNCHARTED%20KEY%20ART.JPG)" , "url(https://adrenaline.com.br/uploads/chamadas/Filme_Uncharted_Fora_do_Mapa_Estreia_HBO_Max.jpg)"),

("Adão Negro", 2022, 125.0, "ação/super-heroi", "Longa metragem", "Jaume Collet-Serra", "Dany Garcia", "O poderoso Adão Negro é libertado de sua tumba para lançar sua justiça cruel sobre a Terra...",
 "url(https://www.ultimato.com.br/image/atualiza_home/principal/ultimas/opiniao/2022/10_out/opi_1-11-22_carlos_caldas_adao_negro.jpg)" , "url(https://cinepop.com.br/wp-content/uploads/2022/09/adao-negro-poster-1.jpg)"),

("Viva - A vida é uma festa", 2017, 105.0, "Animação", "Longa metragem", "Adrian Molina", "Darla K. Anderson", "Apesar da proibição da música por gerações de sua família, o jovem Miguel sonha em se tornar um músico talentoso como seu ídolo Ernesto de la Cruz...", 
"url(https://br.web.img3.acsta.net/pictures/17/12/07/11/33/0502209.jpg)" , "url(https://disneyplusbrasil.com.br/wp-content/uploads/2022/08/Viva-A-Vida-e-uma-Festa-Disney-Plus.jpg)"),

("Como Eu Era Antes de Você", 2016, 110.0, "Romance", "Longa metragem", "Scott Neustadter", "James Kameron", "De origem modesta e sem grandes aspirações, a peculiar Louisa Clark é contratada para ser cuidadora de Will, um jovem tetraplégico depressivo e cínico...",
 "url(https://br.web.img2.acsta.net/pictures/16/02/03/19/11/303307.jpg)" , "url(https://spdm.org.br/wp-content/uploads/2017/03/k2_items_src_13d7a3398dc7b388aef2399aed0ae945.jpg)");
 
 

insert into serie(titulo, ano, duracao, quantidade_temporadas, genero, diretor, produtor, sinopse, capa, banner) values
("Anne with an E", 2017, 45.0, 3, "amadurecimento", "Niki Caro", "Susan Murdoch", "Uma impetuosa órfã é adotada por engano por irmãos solteirões do interior.", "url(https://flxt.tmsimg.com/assets/p17155833_b_v13_aa.jpg)", "url(https://www.legiaojovem.com.br/wp-content/uploads/2019/11/destaque-anne.jpg)" ),
("The Witcher", 2019, 50.0, 2, "fantasia", "Tomasz Bagiński", "Sean Daniel", "O mutante Geralt de Rívia é um caçador de monstros que luta para encontrar seu lugar....", "url(https://sm.ign.com/ign_br/screenshot/default/the-witcher-poster_8432.jpg)", "url(https://cinepop.com.br/wp-content/uploads/2019/11/the-witcher-2-1-e1574278852376.jpg)" ),
("La casa de papel", 2017, 45.0, 5, "ação", "Jesús Colmenar", "Álex Pina", "Oito ladrões se trancam com reféns na Casa da Moeda da Espanha...", "url(https://portalpopline.com.br/wp-content/uploads/2021/09/la-casa-de-papel-15-minutos-parte-5-800x763.jpg)", "url(https://assets.propmark.com.br/uploads/2021/12/LA-CASA-NETFLIX.jpg)" ),
("The Last of Us", 2014, 60.0, 1, "ficção", "Neil Druckmann", "Greg Spence", "Joel, um sobrevivente duro e cínico, e a jovem e impetuosa Ellie se conectam pela dificuldade do mundo...", "url(https://jovemnerd.com.br/wp-content/uploads/2022/11/finkmlhvqaa1fb3__16l26o6f-760x1126.jpeg)", "url(https://www.onoticiado.com.br/wp-content/uploads/2023/01/the-last-of-us-capa.jpg)" ),
("The Flash", 2017, 45.0, 9, "ficção", "David Nutte", "Glen Winter", "Após testemunhar o estranho assassinato de sua mãe e a injusta acusação de seu pai pelo...", "url(https://br.web.img2.acsta.net/pictures/17/09/29/21/15/4233147.jpg)", "url(https://gkpb.com.br/wp-content/uploads/2023/01/the-flash-temporada-final-trailer-e1673531538570.jpg)" ),
("The Crown", 2016, 45.0, 5, "drama", "Stephen Daldry", "Julian Jarrold", "A trajetória da rainha Elizabeth II do Reino Unido, desde o seu casamento em 1947 ao inicio dos anos 2000...", "url(https://www.ecranlarge.com/media/cache/1600x1200/uploads/image/001/453/snrhom9joy3i7ugndzbfbakiq4n-388.jpg)", "url(https://i0.wp.com/wp.ufpel.edu.br/artenosul/files/2017/08/1-2.png?fit=571%2C323&ssl=1)" );
 
 
insert into musica(titulo, ano, genero,  duracao, artista, nota, capa) values
("Flash Pose", 2020, "Pop",  2.33, "Pabllo Vittar", 3, "url(https://i1.sndcdn.com/artworks-000588471680-pnx69c-t500x500.jpg)" ),
("Deleta", 2015, "funk",  2.58, "Lexa", 4, "url(https://upload.wikimedia.org/wikipedia/pt/thumb/8/83/Capa_de_Dispon%C3%ADvel.png/220px-Capa_de_Dispon%C3%ADvel.png)" ),
("Terceiro Céu", 2019, "Gospel",  4.5, "Fernanda Brum", 5, "url(https://m.media-amazon.com/images/I/91CaZc0felL._AC_SL1500_.jpg)" ),
("On the run", 1972, "Eletronica",  3.45, "Pink Floyd", 4, "url(https://sagittariusrecords.com.br/wp-content/uploads/2021/10/R-9296607-1479032194-2661.jpeg.jpg)" ),
("Big Jack", 2008, "Rock",  3.57, "AC/DC", 4, "url(https://upload.wikimedia.org/wikipedia/en/thumb/0/0b/Bigjacksingle.jpeg/220px-Bigjacksingle.jpeg)" ),
("Sweet Child O' Mine", 1987, "Rock",  5.56, "Guns N' Roses", 3, "url(http://4.bp.blogspot.com/-zxaNwo2XSbk/UgaopH_V83I/AAAAAAAADu4/enMAYg5MznY/s1600/guns.jpg)" );


insert into playlist(ordem_execucao, titulo) values
("normal", "Musicas favoritas"),
("normal", "Filmes favoritos"),
("normal", "Series Favoritas");


insert into biblioteca(email_usuario) values 
("arthur_carvalh4@exemplo.com"),
("brucastro2002@exemplo.com"),
("amelosong@exemplo.com");


insert into aux_filme_atores(id_filme, id_ator) values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);


insert into aux_serie_atores(id_serie, id_ator) values
(1, 5),
(2, 3),
(3, 1),
(4, 2),
(5, 4);


insert into aux_playlist_filmes(id_playlist, id_filmes) values 
(2, 1),
(2, 2),
(2, 3),
(2, 4);


insert into aux_playlist_series(id_playlist, id_series) values
(3, 2),
(3, 3),
(3, 4),
(3, 5);


insert into aux_playlist_musicas(id_playlist, id_musicas) values
(1, 1),
(1, 2),
(1, 4),
(1, 5);

insert into aux_biblioteca_playlist(id_biblioteca, id_playlist) values
(1, 1),
(2, 2),
(3, 3);


