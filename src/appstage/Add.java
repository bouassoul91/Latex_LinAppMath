/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appstage;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Badr
 */
public class Add extends javax.swing.JFrame {

	Connecter conn = new Connecter();
	Statement stm;
	ResultSet Rs;
	DefaultTableModel model = new DefaultTableModel();

}
