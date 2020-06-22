/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dao.Categoria;
/**
 *
 * @author jose-
 */
public class CategoriasDaoTest {
    static CategoriasDao categorias = new CategoriasDao();
    static Categoria categoria = new Categoria(61, "categoria", "descripcion");

    public CategoriasDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class CategoriasDao.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        CategoriasDao instance = new CategoriasDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertNotEquals(expResult, result);
       
    }

    /**
     * Test of read method, of class CategoriasDao.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Integer idCategoria = 62;
        Categoria result = categorias.read(idCategoria);
        assertEquals(result, null);
        idCategoria=1;
        result=categorias.read(idCategoria);
        assertEquals(idCategoria, result.getId());
    }

    /**
     * Test of insert method, of class CategoriasDao.
     */
    @Test
    public void testInsert() {
        System.out.println("create");
        System.out.println("Borrando registro al empezar");
        //Elimino manualmente el registro creado
        categorias.delete(10);

        int result = categorias.insert(categoria);
        assertNotNull(result);
        assertEquals(result, 1);
        
        System.out.println("Borrando registro al finalizar");
        //Elimino manualmente el registro creado
        categorias.delete(10);
    }

    /**
     * Test of update method, of class CategoriasDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Categoria categoria = null;
        CategoriasDao instance = new CategoriasDao();
        Integer expResult = null;
        Integer result = instance.update(categoria);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class CategoriasDao.
     */
    @Test
    public void testDelete() {
        
        System.out.println("delete");

        int result = categorias.delete(categoria.getId());
        assertEquals(result, 0);
        
        result = categorias.delete(10);
        assertEquals(result, 1);
       
    }

    /**
     * Test of listar method, of class CategoriasDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Integer posicion = -1;
        ArrayList<Categoria> result = categorias.listar(posicion);
        assertNotNull(result);
        posicion=0;
        result = categorias.listar(posicion);
        assertNotNull(result);
        
    }
    
}
