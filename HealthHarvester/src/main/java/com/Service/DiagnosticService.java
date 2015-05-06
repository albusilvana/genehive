package com.Service;

import com.DAO.DiagnosticDAO;
import com.DAO.EntryDAO;
import com.DTO.EntryDTO;

import java.util.List;

/**
 * Created by silvana.albert on 5/6/15.
 */
public class DiagnosticService {

    private DiagnosticDAO diagnosticDAO = new DiagnosticDAO();

    public List<String> getAllDiagnostics() throws Exception {
        return diagnosticDAO.getAllDiagnostics();
    }

}
