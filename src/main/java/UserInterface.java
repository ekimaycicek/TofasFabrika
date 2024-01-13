
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class UserInterface extends JFrame {
    private Factory factory;
    private List customers;
    private List orders;

    public UserInterface() {

        factory = new Factory();
        customers = new List();
        orders = new List();

        setTitle("Tofaş Automobile Factory");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(6, 2));





        JLabel modelLabel = new JLabel("Car Model:");
        JTextField modelField = new JTextField();
        JLabel engineTypeLabel = new JLabel("Engine Type:");
        JTextField engineTypeField = new JTextField();
        JLabel fuelTourLabel = new JLabel("Fuel Type:");
        JTextField fuelTourField = new JTextField();
        JLabel horsePowerLabel = new JLabel("Horse power:");
        JTextField horsePowerField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel surnameLabel = new JLabel("Surname:");
        JTextField surnameField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JButton addButton = new JButton("Add Cars");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model = modelField.getText();
                String engineType = engineTypeField.getText();
                String fuelTour = fuelTourField.getText();
                int horsePower = Integer.parseInt(horsePowerField.getText());
                String name = nameField.getText();
                String surname = surnameField.getText();
                String address = addressField.getText();

                Car car = new Car(model, engineType, fuelTour, horsePower);
                factory.addCar(car);

                Customer musteri = new Customer(name, surname, address);
                String customer = null;
                customers.add(customer);

                Order order = new Order(customer, car);
                orders.add(String.valueOf(order));

                System.out.println("Engine Type: " + car.getEngineType());
                System.out.println("Fuel Type: " + car.getFuelTour());
                System.out.println("Horse Power: " + car.getHorsePower());
                System.out.println("Customer name: " + musteri.getName());
                System.out.println("Customer Last Name: " + musteri.getSurname());
                System.out.println("Customer Address: " + musteri.getAddress());
                System.out.println("Order status: " + order.getSituation());

                int reply = JOptionPane.showConfirmDialog(null, "Do you want to add new cars?", "Add Cars", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    modelField.setText("");
                    engineTypeField.setText("");
                    fuelTourField.setText("");
                    horsePowerField.setText("");
                    nameField.setText("");
                    surnameField.setText("");
                    addressField.setText("");
                } else {
                    dispose();
                }
            }
        });

        panel.add(modelLabel);
        panel.add(modelField);
        panel.add(engineTypeLabel);
        panel.add(engineTypeField);
        panel.add(fuelTourLabel);
        panel.add(fuelTourField);
        panel.add(horsePowerLabel);
        panel.add(horsePowerField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(surnameLabel);
        panel.add(surnameField);
        panel.add(addressLabel);
        panel.add(addressField);

        add(panel, BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new UserInterface();
            }
        });


    }


}