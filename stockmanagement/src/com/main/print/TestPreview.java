/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.print;

/**
 *
 * @author gunnnu
 */


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.print.*;
import java.text.MessageFormat;
import javax.print.attribute.*;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.Sides;
import javax.swing.JTable.PrintMode;

class TestPreview extends JFrame implements ActionListener {
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    HashPrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
    JTable table = null;

    public TestPreview() {
        super("Test of Print Preview");
        getContentPane().add(createTable());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    private JPanel createTable() {
       String val[][] = {
            {"A", "Test 01", "A", "Test 01"}, 
            {"B", "Test 02", "B", "Test 02"}, 
            {"C", "Test 03", "C", "Test 03"},
            {"D", "Test 04", "D", "Test 04"}, 
            {"E", "Test 05", "E", "Test 05"}, 
            {"F", "Test 06", "F", "Test 06"},
            {"G", "Test 01", "G", "Test 01"}, 
            {"H", "Test 02", "H", "Test 02"}, 
            {"I", "Test 03", "I", "Test 03"},
            {"J", "Test 03", "J", "Test 03"},
            {"K", "Test 04", "K", "Test 04"}, 
            {"L", "Test 05", "L", "Test 05"}, 
            {"M", "Test 06", "M", "Test 06"},
            {"N", "Test 01", "N", "Test 01"}, 
            {"O", "Test 02", "O", "Test 02"}, 
            {"P", "Test 03", "P", "Test 03"},
            {"Q", "Test 04", "Q", "Test 04"}, 
            {"R", "Test 05", "R", "Test 05"}, 
            {"S", "Test 06", "S", "Test 06"},
            {"T", "Test 01", "T", "Test 01"}, 
            {"U", "Test 02", "U", "Test 02"}, 
            {"V", "Test 03", "V", "Test 03"},
            {"W", "Test 04", "W", "Test 04"}, 
            {"X", "Test 05", "X", "Test 05"}, 
            {"Y", "Test 06", "Y", "Test 06"}
            
        };

        String headers[] = {"A", "B", "C", "D"};
        table = new JTable(val, headers);
        JButton previewButton = new JButton("Preview Table");
        previewButton.addActionListener(this);
        JPanel panel = new JPanel(new BorderLayout()), top = new JPanel(new FlowLayout());
        top.add(previewButton);
        panel.add(top, "North"); 
        panel.add(new JScrollPane(table), "Center");
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Preview Table"))
            attributes.add(new MediaPrintableArea(6, 6, 198, 278, MediaPrintableArea.MM)); // A4: 210x297mm
            attributes.add(Sides.DUPLEX);
            attributes.add(OrientationRequested.LANDSCAPE);
            new PrintPreview(
                table.getPrintable(PrintMode.FIT_WIDTH, null, new MessageFormat("Page {0}") ), 
                printerJob.getPageFormat(attributes)
            );
    }

    public static void main(String arg[]) {
        new TestPreview();
    }
}