package com.example.demo;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.List;

public class Tree {
    JFrame f;

    Tree(List<Furnizor> fz) {
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Furnizori");
        for(Furnizor b : fz) {
            DefaultMutableTreeNode nume = new DefaultMutableTreeNode(b.getNume());
            style.add(nume);
            DefaultMutableTreeNode oras = new DefaultMutableTreeNode(b.getOras());
            DefaultMutableTreeNode stare = new DefaultMutableTreeNode(b.getStare());
            nume.add(oras);
            nume.add(stare);
        }
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}