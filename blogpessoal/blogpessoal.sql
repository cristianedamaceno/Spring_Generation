use db_blogpessoal;

insert into tb_postagens(data, texto, titulo) values (current_date(), "Texto da postagem", "Titulo da postagem");

insert into tb_postagens(data, texto, titulo) values (current_date(), "Texto da postagem 01", "Titulo da postagem 01");

select * from tb_postagens;
