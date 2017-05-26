# Forecast

Após realizar as configurações abaixo é necessário subir a aplicação em um servidor de aplicação e acessá-la via navegador.
A tela inicial irá trazer as cidades já cadastradas no sistema.
No canto superior é possível inserir novas cidades, onde somente será possível cadastrar cidades que na consulta da API trará algum resultado.
Após inserir a cidade desejada é possível clicar no link Forecast, ao lado da cidade desejada e a próxima tela será uma lista com os horário de 3 em 3 horas e algumas informações de como estará o tempo.

Melhorias futura:
Tratar o layout da aplicação que não possui nenhum css em cima.
Exibir mensagem para o usuário informando que não foi possível cadastrar a cidade que a API não encontrou.
Exibir de forma mais intuitiva as informações de forecast da cidade.

Os comando abaixo são necessário para criar a única tabela que é utilizada no sistema.
Obs: no fonte está fixo as seguintes configurações para comunicação com o banco: 
URL:  localhost:5432/Forecast
User: postgres
Pass: root


CREATE DATABASE "Forecast"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;
	   
	   
	   
	   -- Sequence: city_id_seq

-- DROP SEQUENCE city_id_seq;

CREATE SEQUENCE city_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 12
  CACHE 1;
ALTER TABLE city_id_seq
  OWNER TO postgres;

  
  -- Table: city

-- DROP TABLE city;

CREATE TABLE city
(
  id numeric NOT NULL DEFAULT nextval('city_id_seq'::regclass),
  name character varying NOT NULL,
  CONSTRAINT city_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE city
  OWNER TO postgres;


Para este projeto utilizei as seguintes tecnologias:

Tomcat8
Maven 3.3.9
Postgres 9.4
Eclipse
Git

Bibliotecas:
Gson
Hibernate
Servlet
