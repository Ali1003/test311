﻿### Полезные настройки:
 Разобраться что делают команды.
 - `git config --global credential.helper store` 
 - `git config --global alias.`
 - `git config --global http.proxy http://login:pas@proxy:8080`
 - `git log --pretty=format:'%h %ad | %s%d [%an]' --graph --date=short`
 - `git log --graph --all --format=format:'%C(bold blue)%h%C(reset) - %C(bold green)(%ar)%C(reset) %C(white)%s%C(reset) %C(bold white)- %an%C(reset)%C(bold yellow)%d%C(reset)' --abbrev-commit --date=relative`
 - [еще немного полезных команд](https://tproger.ru/translations/most-common-git-screwupsquestions-and-solutions/amp/)
 - [ПРОЧИТАТЬ](https://habr.com/post/125999/)
 
## Как начать работать
 
 0. Войти на GitHub
 1. Открыть репозиторий <https://github.com/frozzen256/test311> (основной репозиторий лабораторных)
 2. Создать себе `Fork` этого репозитория
 3. Загрузить созданный форк себе на компьютер
 4. Создать к нему привязку `origin`
 5. Создать привязку `upstream` к оригинальному репозиторию 
 6. Создать новую ветку для доработок `devlp` 
 7. Произвести доработку и выполнить `commit`
 8. Отправить созданную ветку в свой репозиторий 
 9. Зайти в свой репозиторий на GitHub и выполнить запрос (Pull Request) на внесение изменений в основной репозиторий лабораторных в ветку devlp

#### Злые команды:

_Как удалить последний коммит_
 `git reset --soft HEAD^`
_Удалить коммит локально_
 `git reset HEAD~1 --hard`
_и на сервер_
 `git push -f`

#### Группа 0904-311	вариант

Астротенко А.В.	-	15;		
Болетти С.В.	-	1;
Бондаренко В.О.	-	3;
Еговцева Д.С.	-	7;
Иванов М.Е.	-	19;
Картаев Н.Е.	-	5;
Курилова А.А.	-	8;
Лопатин А.В.	-	18;
Овчинников Д.И.	-	6;
Ярикова И.М.	-	9;
Ванкевич Ю.А.	-	10;
Грунский С.А.	-	11;
Зубарев Д.А.	-	12;
Криволуцкий В.В.-	13;
Мальцев В.А.	-	14;
Малявин А.С.	-	17;
Саломатова И.К.	-	16;