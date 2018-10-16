package by.kurus;
import javax.swing.JOptionPane;
public class InputIntVariablesDemo {
    public static void main (String [] args){
        int age,year,birth;
        String result;
        result=JOptionPane.showInputDialog("Какой сейчас год?");
        year=Integer.parseInt(result);
        //Преобразование текста в число
        result=JOptionPane.showInputDialog("Сколько вам лет?");
        age=Integer.parseInt(result);
        birth=year-age;
        JOptionPane.showMessageDialog(null,"Вы родились в "+birth+" году!");
    }
}
