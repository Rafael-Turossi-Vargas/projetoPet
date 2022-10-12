package br.ulbra.DAO;

import br.ulbra.entity.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.ulbra.DAO.ConnectionFactory;
import br.ulbra.entity.Usuario;
import javax.swing.JOptionPane;

public class PetDAO {

    Connection con;

    public PetDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public void create(Pet u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbAnimal(racaPet,portePet, descPet, pesoPet, vascPet) VALUES( ?,  ?,  ?,  ?,  ?)");

            stmt.setString(1, u.getRacaPet());
            stmt.setString(2, u.getPortePet());
            stmt.setString(3, u.getDescPet());
            stmt.setDouble(4, u.getPesoPet());
            stmt.setString(5, u.getVascPet());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pet Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Pet u) {

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbAnimal WHERE idPet =  ? ");
            stmt.setInt(1, u.getIdPet());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pet excluído com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:"
                    + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

   public ArrayList<Pet> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Pet> pets = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbAnimal");

            rs = stmt.executeQuery();
            while (rs.next()) {
                Pet p = new Pet();
                p.setIdPet(rs.getInt("idPet"));
                p.setRacaPet(rs.getString("racaPet"));
                p.setPortePet(rs.getString("portePet"));
                p.setDescPet(rs.getString("descPet"));
                p.setPesoPet(rs.getDouble("pesoPet"));
                p.setVascPet(rs.getString("vascPet"));
                
                pets.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pets;
    }


    private void controlarBtn(int i) {
        
    }

    public Iterable<Pet> readForDesc(String RacaPet) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Pet> Pet = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbAnimal WHERE RacaPet LIKE?");
            stmt.setString(1, "%" + RacaPet + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pet pet = new Pet();
                pet.setIdPet(rs.getInt("IdPet"));
                pet.setRacaPet(rs.getString("RacaPet"));
                pet.setPortePet(rs.getString("PortePet"));
                pet.setDescPet(rs.getString("DescPet"));
                pet.setPesoPet(rs.getDouble("PesoPet"));
                pet.setVascPet(rs.getString("VascPet"));
                
                pet.add(Pet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Pet>) Pet;
        
    }

    public void update(Pet p) {
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbAnimal SET racaPet=  ?, portePet =  ?, descPet =  ?, pesoPet =  ?, vascPet = ? WHERE  idPet =  ?");
            
            stmt.setString(1, p.getRacaPet());
            stmt.setString(2, p.getPortePet());
            stmt.setString(3, p.getDescPet());
            stmt.setDouble(4, p.getPesoPet());
            stmt.setString(5, p.getVascPet());
            
            stmt.setInt(6, p.getIdPet());
            

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
    }

    
}
