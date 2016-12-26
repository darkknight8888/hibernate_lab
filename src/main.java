/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;


public class main {

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
       
        

        /* Creating and displaying form*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                CloDao clo_dao = new CloDao();

        // Adding new CLO
        Clo clo = new Clo();
        clo.setName("CLO 1");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("2");
        clo_dao.addClo(clo);

        clo_dao.updateClo(clo);

        // Delete an existing clo
        //dao.deleteClo(1);

        // Get all clos
        for (Clo iter : clo_dao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clo_dao.getCloById(1));

        
                
            }
        });
    }
    
}
