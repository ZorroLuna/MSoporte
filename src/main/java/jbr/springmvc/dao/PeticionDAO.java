package jbr.springmvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Peticion;

public class PeticionDAO {
  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;
  public void registerPeticion(Peticion peticion) {
    String sql = "insert into Peticion values(default,?,?,?,?,?)";
    jdbcTemplate.update(sql, new Object[] { peticion.getDescripcion(), 0, peticion.getPrioridad(),
    peticion.getEmisor(),peticion.getAsignado()});
    }
    public List<Peticion> devuelvePeticiones() {
    String sql = "select * from Peticion";
    List<Peticion> users = jdbcTemplate.query(sql, new PeticionMapper());
    return users;
    }
  }
  class PeticionMapper implements RowMapper<Peticion> {
  public Peticion mapRow(ResultSet rs, int arg1) throws SQLException {
    Peticion peti = new Peticion();
    peti.setDescripcion(rs.getString("descripcion"));
    peti.setPrioridad(rs.getInt("prioridad"));
    peti.setStatus(rs.getString("estatus"));
    peti.setEmisor(rs.getString("emisor"));
    peti.setAsignado(rs.getString("asignado"));
    return peti;
  }
}