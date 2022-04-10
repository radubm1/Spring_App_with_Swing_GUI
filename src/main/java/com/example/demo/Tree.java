package com.example.demo;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.List;

public class Tree {
    JFrame f;

    Tree(List<Livrare> liv) {
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Livrari");
        for(Livrare l : liv) {
            DefaultMutableTreeNode cant = new DefaultMutableTreeNode(l.getCant());
            style.add(cant);
            DefaultMutableTreeNode furnizor = new DefaultMutableTreeNode(l.getFz().getNume());
            DefaultMutableTreeNode compon = new DefaultMutableTreeNode(l.getCmp().getDenum());
            cant.add(compon);
            DefaultMutableTreeNode um = new DefaultMutableTreeNode(l.getCmp().getUm());
            DefaultMutableTreeNode culoare = new DefaultMutableTreeNode(l.getCmp().getCuloare());
            compon.add(um);
            compon.add(culoare);
            cant.add(furnizor);
            DefaultMutableTreeNode oras = new DefaultMutableTreeNode(l.getFz().getOras());
            DefaultMutableTreeNode stare = new DefaultMutableTreeNode(l.getFz().getStare());
            furnizor.add(oras);
            furnizor.add(stare);

        }
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}