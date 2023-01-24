-- создать обычного пользователя taco:
CREATE USER tacouser PASSWORD 'taco85user';

-- *******************  authentication *************************
-- Создайте БД authentication:
CREATE DATABASE taco_db WITH OWNER = tacouser ENCODING = 'UTF8';


GRANT ALL PRIVILEGES ON DATABASE "taco_db" to tacouser;


Или (если не сработает) так мы добавим все права на использование всех таблиц в базе database1 учетной записи dmosk:

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA sh_lema TO "eazybytes";

-- переключиться на DB "authentication" (в консоли можно следующей командой, в админке вручную):
\c taco_db
-- в последней версии необходимо зайти под пользователем tacouser

--Создайте схемы в БД authentication и дайте все права на нее пользователю tacouser:

CREATE SCHEMA IF NOT EXISTS taco_sh;
GRANT ALL ON SCHEMA taco_sh TO tacouser;


*****************************************************************************************************


-- создать обычного пользователя taco:
CREATE USER tacoauthuser PASSWORD 'tacoauth23user';

-- *******************  authentication *************************
-- Создайте БД authentication:
CREATE DATABASE taco_auth_db WITH OWNER = tacoauthuser ENCODING = 'UTF8';


GRANT ALL PRIVILEGES ON DATABASE "taco_auth_db" to tacouser;


Или (если не сработает) так мы добавим все права на использование всех таблиц в базе database1 учетной записи dmosk:

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA sh_lema TO "eazybytes";

-- переключиться на DB "authentication" (в консоли можно следующей командой, в админке вручную):
\c taco_auth_db
-- в последней версии необходимо зайти под пользователем tacouser

--Создайте схемы в БД authentication и дайте все права на нее пользователю tacouser:

CREATE SCHEMA IF NOT EXISTS taco_auth_sh;
GRANT ALL ON SCHEMA taco_auth_sh TO tacoauthuser;

