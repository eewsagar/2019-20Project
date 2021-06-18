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
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.print.*;

class PrintPreview extends JFrame implements ActionListener, ItemListener {
    JButton printButton = new JButton("Print");
    Pageable pageable = null;
    double scale = 1.0;
    Page page[] = null;
    JComboBox combobox = new JComboBox();
    CardLayout cardlayout = new CardLayout();
    JPanel previewPanel = new JPanel(cardlayout);
    JButton backButton = new JButton("PREV"), forwardButton = new JButton("NEXT");

    public PrintPreview(final Printable printable, final PageFormat pageFormat) {
        super("Print Preview");        
        pageable = new Pageable() {
            @Override
            public int getNumberOfPages() {
                Graphics graphics = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).getGraphics();                
                int numPages = 0;
                try {
                    while (printable.print(graphics, pageFormat, numPages) == Printable.PAGE_EXISTS) {
                        numPages++;
                    }
                } catch (Exception ex) {
                }
                return numPages;
            }

            @Override
            public PageFormat getPageFormat(int x) {
                return pageFormat;
            }

            @Override
            public Printable getPrintable(int x) {
                return printable;
            }
        };
        createPreview();
    }

    private void createPreview() {
        page = new Page[pageable.getNumberOfPages()];
        PageFormat pageFormat = pageable.getPageFormat(0);
        Dimension size = new Dimension((int) pageFormat.getPaper().getWidth(), (int) pageFormat.getPaper().getHeight());
        if (pageFormat.getOrientation() != PageFormat.PORTRAIT) {
            size = new Dimension(size.height, size.width);
        }
        for (int i = 0; i < page.length; i++) {
            combobox.addItem("" + (i + 1));
            page[i] = new Page(i, size);
            previewPanel.add("" + (i + 1), new JScrollPane(page[i]));
        }
        setTopPanel();
        getContentPane().add(previewPanel, "Center");
        pack();
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    private void setTopPanel() {
        FlowLayout fl = new FlowLayout();
        GridBagLayout gbl = new GridBagLayout();

        JPanel topPanel = new JPanel(gbl), temp = new JPanel(fl);
        backButton.addActionListener(this);
        forwardButton.addActionListener(this);
        backButton.setEnabled(false);
        forwardButton.setEnabled(page.length > 1);

        temp.add(combobox);
        temp.add(backButton);
        temp.add(forwardButton);
        temp.add(printButton);

        topPanel.add(temp);
        printButton.addActionListener(this);
        combobox.addItemListener(this);
        getContentPane().add(topPanel, "North");
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        cardlayout.show(previewPanel, (String) combobox.getSelectedItem());
        backButton.setEnabled(combobox.getSelectedIndex() == 0 ? false : true);
        forwardButton.setEnabled(combobox.getSelectedIndex() == combobox.getItemCount() - 1 ? false : true);
        validate();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o == printButton) {
            try {
                PrinterJob pj = PrinterJob.getPrinterJob();
                pj.defaultPage(pageable.getPageFormat(0));
                pj.setPageable(pageable);
                if (pj.printDialog()) {
                    pj.print();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Error in Printing", 1);
            }
        } else if (o == backButton) {
            combobox.setSelectedIndex(combobox.getSelectedIndex() == 0 ? 0 : combobox.getSelectedIndex() - 1);
            if (combobox.getSelectedIndex() == 0) {
                backButton.setEnabled(false);
            }
        } else if (o == forwardButton) {
            combobox.setSelectedIndex(combobox.getSelectedIndex() == combobox.getItemCount() - 1 ? 0 : combobox.getSelectedIndex() + 1);
            if (combobox.getSelectedIndex() == combobox.getItemCount() - 1) {
                forwardButton.setEnabled(false);
            }
        }
    }

    class Page extends JLabel {
        final int n;
        final PageFormat pageformat;
        BufferedImage bufferimage = null;
        Dimension size = null;

        public Page(int currentpage, Dimension size) {
            this.size = size;
            bufferimage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            n = currentpage;
            pageformat = pageable.getPageFormat(n);
            Graphics g = bufferimage.getGraphics();
            g.setColor(Color.WHITE);                       
            g.fillRect(0, 0, (int) pageformat.getWidth(), (int) pageformat.getHeight());
            try {
                pageable.getPrintable(n).print(g, pageformat, n);
            } catch (Exception ex) {
            }
            setIcon(new ImageIcon(bufferimage));
        }
    }
}
