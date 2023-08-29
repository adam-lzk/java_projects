package com.proj19;

import javax.swing.*;  // импорт класса JFrame и его методов + классы JLabel, JTextArea, JTextField и тд
import java.awt.*;  // импорт класса Container и его методов - для создания кнопок, радиокнопок, полей, надписей
import java.awt.event.*;  // импорт класса ActionListener

public  class GraphicalApplication extends JFrame {

    private JTextField username_field, password_field;
    private JRadioButton maleButton, femaleButton;
    private JCheckBox checkGender;

    public GraphicalApplication() {
    // создание окна вывода
        super("my first graphical application");  // название в шапек окна
        super.setBounds(200, 100, 500, 300);  // расположение и размеры окна
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // действия программы при закрытии окна: JFrame.EXIT_ON_CLOSE - остановка программы

        Container container = super.getContentPane();  // Container container - что-то на подобии папки, куда мы будем помещать различные элементы и объекты
                                                       // getContentPane() возвращает необходимый нам объект
        container.setLayout(new GridLayout(4, 2, 2, 10));  // .setLayout() - для выбора системы расположения элементов и объектов

    // создание объектов и помещение их в окно
        JLabel username = new JLabel("enter your username");  // объкт для создания текстовой надписи
        username_field = new JTextField("", 1);   // объкт для создания поля для ввода

        JLabel password = new JLabel("enter the password");
        password_field = new JTextField("password", 1);

        container.add(username);  // добавляем созданные объекты в окно
        container.add(username_field);
        container.add(password);
        container.add(password_field);

        maleButton = new JRadioButton("Male");  // создание радиокнопки - кнопка с точкой
        femaleButton = new JRadioButton("Female");
        checkGender = new JCheckBox("Agree?", false);  // создание кнопки с галочкой. false - изначально галочка не стоит, true - стоит
        JButton continueButton = new JButton("Continue");  // создание кнопки с надписью

        maleButton.setSelected(true);  // true - изначально на кнопке точка стоит, false - не стоит
        container.add(maleButton);  // добавляем созданные кнопки в окно
        container.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();  // объеденение радиокнопок в одну группу (чтобы можно было включать только одну кнопку - если включена одна, то вторая выключена)
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        container.add(checkGender);  // добавляем созданные кнопки в окно
        container.add(continueButton);

    // добвыление функционала в кнопку Continue
        continueButton.addActionListener(new ButtonEventManager());
    }

    // создание класса для обработки кнопки Continue
    class ButtonEventManager implements ActionListener {

        @Override  // реализация необходимого метода actionPerformed. Он будет вызываться каждый раз при нажатии на кнопку
        public void actionPerformed(ActionEvent e) {
            String reseivedUsername = username_field.getText();
            String receivedPassword = password_field.getText();

            String gender = "Male";
            if (!maleButton.isSelected()) {
                gender = "Female";
            }

            boolean checkBox = checkGender.isSelected();  // checkBox == true если галочка поставлены, иначе - false

    // создание всплывающего окна. .showMessageDialog() - добавление текста в это окно
            JOptionPane.showMessageDialog(null, // parentComponent: null - нет родительского компанента/объекта, к которому мы привязываем это окно
                                          "Your username is " + reseivedUsername + 
                                          "\nYour password is " + receivedPassword + 
                                          "\nGender is " + gender + 
                                          "\nYou agree: " + checkBox, // выводимый текст
                                          "Hello", // текст в шапке окна
                                          JOptionPane.PLAIN_MESSAGE); // JOptionPane - для указания типа всплывающего окна. .PLAIN_MESSAGE - обычное пустое окно
        }

    }

}
