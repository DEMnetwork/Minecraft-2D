/*
 *   Copyright (c) 2024 DEMnetwork
 *   All rights reserved.

 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 
 *   The above copyright notice and this permission notice shall be included in all
 *   copies or substantial portions of the Software.
 
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *   SOFTWARE.
 */

package io.github.demnetwork;

import io.github.demnetwork.Logger.*;
import io.github.demnetwork.util.datatypes.Uint;
import io.github.demnetwork.util.exception.IllegalArgumentException;
import io.github.demnetwork.util.exception.IllegalValueException;
import io.github.demnetwork.util.exit.Exit;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

@SuppressWarnings("unused")
public class Window extends JFrame {
    static Logger_v2 Logger = new Logger_v2();
    private JLabel skindisplay;
    private ImageIcon skin;
    private JPanel game;
    private JLabel content;
    private JButton play;
    private JButton back;
    static final Image icon = Toolkit.getDefaultToolkit().getImage("./assets/favicon.png");

    Window() {
        new File("./logs/latest.log").isFile();
        try {
            FileWriter logWritter = new FileWriter("./logs/latest.log", false);
            logWritter.write("");
            logWritter.close();
        } catch (IOException err) {
            Logger.Log(true, err.getMessage(), err.getStackTrace());
        }
        Logger.Log("INFO", "Starting Minecraft 2D");
        setLayout(new FlowLayout(670));
        content = new JLabel(
                "Minecraft 2D");
        add(content);
        play = new JButton("Play");
        add(play);
        Playgame e = new Playgame();
        play.addActionListener(e);
        back = new JButton("Back");
        BacktoHome Back = new BacktoHome();
        back.addActionListener(Back);
        game = new JPanel(new GridLayout(335, 183));
        skin = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/skin.png"));
        skindisplay = new JLabel(skin);
        game.add(skindisplay);
        game.setBounds(527, 175, 183, 335);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                new Exit();
            }
        });
    }

    public class Playgame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            remove(content);
            remove(play);
            Logger.Log("DEBUG", "Revalidating Window objects...");
            setVisible(false);
            validate();
            add(back);
            add(game);
            game.setBounds(527, 175, 183, 335);
            validate();
            setVisible(true);
            Logger.Log(4, "Revalidation complete");
        }
    }

    public class BacktoHome implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            remove(back);
            game.setBounds(527, 175, 183, 335);
            remove(game);
            Logger.Log("DEBUG", "Revalidating Window objects...");
            setVisible(false);
            validate();
            add(content);
            add(play);
            validate();
            setVisible(true);
            Logger.Log("DEBUG", "Revalidation complete");
        }
    }

    public static void main(String[] args) {
        Window gui = new Window();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(1440, 810);
        gui.setVisible(true);
        gui.setTitle("Minecraft 2D");
        gui.setBackground(new Color(0, 0, 0));
        gui.setResizable(false);
        gui.setIconImage(icon);
        Uint a = new Uint(1, 0);
        System.out.println(a.getDataAsLong());
        boolean[] UintData = a.getDataAsBooleanArray();
        for (int i = 0; i < UintData.length; i++) {
            System.out.println(UintData[i]);
        }
    }
}