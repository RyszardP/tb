# tb - relegram bot
test task for resliv:
Необходимо создать web приложение по управлению собственным туристическим телеграм ботом.
1) Телеграм бот выдает пользователю справочную информацию о введенном городе. Например, пользователь вводит: 
«Москва», чат-бот отвечает: «Не забудьте посетить Красную Площадь. Ну а в ЦУМ можно и не заходить)))».
2) Данные о городах должны храниться в базе данных.
3) Управлять данными о городах (добавлять новые города и информацию о них, изменять и удалять любую информацию) необходимо 
через REST WebService.

### settings

bot name = gregarious_bot
bot token = 954074327:AAFPFs-IaZ8tQNTP-Vo5Ylyczsr5E4Grv34


### REST WebService.

add item - /TravelBot/add
delete item - /TravelBot/{id delete item}
edit item - /TravelBot/edit
item info - /TravelBot/info(id item}

### mysql info

scripts in resources/db
