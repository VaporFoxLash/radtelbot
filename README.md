# radtelebot
## Consoole bot and Telegram bot
Этот бот принимает команды от пользователя и возвращает ответ
или поиграйте в забавные мелочи, проверяющие ваши знания.
Доска также показывает обратную связь после викторины и показывает таблицу лидеров.
чтобы показать лучших участников игры.
если кто-то чувствует себя не готовым к продолжению, бот предложит возможность выйти из игры

## Index
* [Cloning](#Clone)
* [Dependencies](#Dependencies)
* [Usage](#Usage)
* [Unit Tests](#Testing)
* [References](#References)


## <a name="Clone">Clone the project</a>
```shell
$ git clone https://github.com/VaporFoxLash/radtelbot.com
$ cd /radtelbot.com
```

## <a name="Dependencies">Dependencies</a>
Telegrambots, version 3.5, Junit

## <a name="Usage">Usage</a>
Open the project with intellij IDEA.
Search @radtelbot on telegram and use the commands below to interact with the bot.
* To run ConsoleBot - run ConsoleMainClass inside ConsoleBot package
* To run TelegramBot -run MainClass found isnide TelegramBot package
* Examples:
Bot: Welcome, to get started type /start
User:/start
Bot: (Display how it works)
User: /trivia
Bot: Q1/5: Can constructor be inherited?\n
 true, false ?
User: false
Bot: Wrong! The correct answer is true
 Continue ?
User: Continue
Bot: (Ask Next question until the last question)
Here is your score: 4/5
Play again, exit ?
User: Exit
Bot: Goodbye <Username> 


## Commands
* /start - To get started.
* //trivia - To play a trivia game where the bot asks a series and the user choose the correct answer and get their score after playing.
* /leaderBoard - To get a table of participants with their score rated by the bot.
* /exit - To stop intercting with the bot.
* The trivia game uses InlineKeyBoard to get different variants from the user/Player.


## <a name="Testing">Testing</a>
Откройте проект с помощью intellij IDEA, в src / test / java / radtelbot.java нажмите кнопку Run radtelBotTest.
для тестирования myBotInterface нажмите кнопку Run myBotInterfaceTest в Intellji IDE.
и вы можете увидеть результат на терминале.


## <a name="References">References</a>
# API
*  https://core.telegram.org/bots/api
