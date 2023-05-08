import javax.swing.*;
import java.util.*;

public class PickAMeal
{
    public static void main(String[] args)
    {
        String[] meals = {"Sopes", "Flautas", "Chorizo con papa", "Alfredo Pasta w Chicken or Shrimp",
            "Korean Fried Chicken w Rice", "Conchas", "Fajita Tacos", "Pork and Rice", "Fideo", "Ramen",
            "Sushi", "Garlic Butter Shrimp pasta", "Huevo con Chorizo", "Quesadillas", "Tortas", 
            "Frozen Chicken and Fries", "Tinga", "Gorditas", "Chicken Rice Veggies", "Barbecue Sliders",
            "Spaghetti w Chicken Parm", "Beef Kabobs"};

        int count = 0;

        Random picker = new Random();
        int randomMeal = picker.nextInt(22);

        JOptionPane.showMessageDialog(null, meals[randomMeal]);


    }
}