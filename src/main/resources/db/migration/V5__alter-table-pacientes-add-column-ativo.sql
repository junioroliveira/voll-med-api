alter table pacientes add ativo tinyint DEFAULT 1;
-- caso a opção DEFAULT 1 não fosse utilizada, srá necessário fazer um update em todos os registros.
-- update pacientes set ativo = 1;