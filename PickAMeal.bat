@echo off
title Pick A Meal
set meal[0]=Sopes
set meal[1]=Flautas
set meal[2]=Chorizo con papa
set meal[3]=Alfredo Pasta w Chicken or Shrimp
set meal[4]=Korean Fried Chicken w Rice
set meal[5]=Conchas
set meal[6]=Fajita Tacos
set meal[7]=Pork and Rice
set meal[8]=Fideo
set meal[9]=Ramen
set meal[10]=Sushi
set meal[11]=Garlic Butter Shrimp pasta
set meal[12]=Huevo con Chorizo
set meal[13]=Quesadillas
set meal[14]=Tortas
set meal[15]=Frozen Chicken and Fries
set meal[16]=Tinga
set meal[17]=Gorditas
set meal[18]=Chicken Rice Veggies
set meal[19]=Barbecue Sliders
set meal[20]=Spaghetti w Chicken Parm
set meal[21]=Beef Kabobs

set /a num=%random% %%22

call echo %%meal[%num%]%%

pause