import subClasses.subCalculator;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JTextField resultScreen;
    private JPanel panel1;
    private JButton a7Button;
    private JButton CLRButton1;
    private JButton a8Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton comma_button;
    private JButton add_button;
    private JButton cButton;
    private JButton sum_button;
    private JButton a6Button;
    private JButton multip_button;
    private JButton a3Button;
    private JButton result_button;
    private JButton divide_button;

    private class NullFloat {
        float Value = 0;
        Boolean Valid = false;
    }
    public NullFloat setValidTrue (float value) {
        NullFloat s = new NullFloat();
        s.Valid = true;
        s.Value = value;
        return s;
    }
    public NullFloat setValidFalse () {
        NullFloat s = new NullFloat();
        s.Valid = false;
        s.Value = 0;
        return s;
    }

    private class operations {
        NullFloat FirstNumber = new NullFloat();
        float FirstNumberDigit = 1;
        NullFloat SecondNumber = new NullFloat();
        float SecondNumberDigit = 1;
        String Operation = "";
        boolean IsCommaClicked = false;
        NullFloat Result = new NullFloat();
    }
    operations ops = new operations();

    public calculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a0Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a0Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a1Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a1Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a2Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a2Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a3Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a3Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a4Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a4Button.getText()) + ops.FirstNumber.Value * ops.FirstNumberDigit);

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a5Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a5Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a6Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.SecondNumberDigit /=10;
                    } else {
                        ops.SecondNumberDigit *= 10;
                    }

                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a6Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));

                    if (ops.IsCommaClicked) {
                        ops.FirstNumberDigit /=10;
                    } else {
                        ops.FirstNumberDigit *= 10;
                    }

                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a7Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));
                    ops.SecondNumberDigit *= 10;
                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a7Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));
                    ops.FirstNumberDigit *= 10;
                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a8Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));
                    ops.SecondNumberDigit *= 10;
                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a8Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));
                    ops.FirstNumberDigit *= 10;
                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ops.Operation != "") {
                    ops.SecondNumber = setValidTrue(Float.valueOf(a9Button.getText()) + (ops.SecondNumber.Value * ops.SecondNumberDigit));
                    ops.SecondNumberDigit *= 10;
                    String subResult = String.format("%.2f%s%.2f", ops.FirstNumber.Value, ops.Operation, ops.SecondNumber.Value);
                    resultScreen.setText(subResult);
                } else {
                    ops.FirstNumber = setValidTrue(Float.valueOf(a9Button.getText()) + (ops.FirstNumber.Value * ops.FirstNumberDigit));
                    ops.FirstNumberDigit *= 10;
                    resultScreen.setText(String.valueOf(ops.FirstNumber.Value));
                }
            }
        });

        add_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ops.Operation = add_button.getText();
                String subResult = String.valueOf(ops.FirstNumber.Value) + ops.Operation;
                resultScreen.setText(subResult);
                ops.FirstNumberDigit = 1;
                ops.SecondNumberDigit = 1;
                ops.IsCommaClicked = false;
            }
        });
        sum_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ops.Operation = sum_button.getText();
                String subResult = String.valueOf(ops.FirstNumber.Value) + ops.Operation;
                resultScreen.setText(subResult);
                ops.FirstNumberDigit = 1;
                ops.SecondNumberDigit = 1;
                ops.IsCommaClicked = false;
            }
        });
        multip_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ops.Operation = multip_button.getText();
                String subResult = String.valueOf(ops.FirstNumber.Value) + ops.Operation;
                resultScreen.setText(subResult);
                ops.FirstNumberDigit = 1;
                ops.SecondNumberDigit = 1;
                ops.IsCommaClicked = false;
            }
        });
        divide_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ops.Operation = divide_button.getText();
                String subResult = String.valueOf(ops.FirstNumber.Value) + ops.Operation;
                resultScreen.setText(subResult);
                ops.FirstNumberDigit = 1;
                ops.SecondNumberDigit = 1;
                ops.IsCommaClicked = false;
            }
        });

        comma_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ops.IsCommaClicked = true;
                ops.FirstNumberDigit = 1/10;
                ops.SecondNumberDigit = 1/10;
            }
        });

        result_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (ops.Operation) {
                    case "+":
                        ops.Result = setValidTrue(ops.FirstNumber.Value + ops.SecondNumber.Value);
                        break;
                    case "-":
                        ops.Result = setValidTrue(ops.FirstNumber.Value - ops.SecondNumber.Value);
                        break;
                    case "*":
                        ops.Result = setValidTrue(ops.FirstNumber.Value * ops.SecondNumber.Value);
                        break;
                    case "/":
                        ops.Result = setValidTrue(ops.FirstNumber.Value / ops.SecondNumber.Value);
                        break;
                }

                ops.FirstNumber = setValidTrue(ops.Result.Value);
                ops.SecondNumber = setValidFalse();
                ops.FirstNumberDigit = 1;
                ops.SecondNumberDigit = 1;
                ops.Operation = "";
                ops.IsCommaClicked = false;
                resultScreen.setText(String.valueOf(ops.Result.Value));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
