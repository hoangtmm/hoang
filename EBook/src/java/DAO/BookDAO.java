/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.BookDtls;
import java.util.List;

/**
 *
 * @author Hoang
 */
public interface BookDAO {

    public boolean addBook(BookDtls b);

    public List<BookDtls> getAllBooks();

    public BookDtls getBookById(int id);

    public boolean updateEditBook(BookDtls b);

    public boolean deleteBook(int id);

    public List<BookDtls> getNewBook();

    public List<BookDtls> getRecentBook();

    public List<BookDtls> getOldBook();

    public List<BookDtls> getAllRecentBook();

    public List<BookDtls> getAllNewBook();

    public List<BookDtls> getAllOldBook();

}
