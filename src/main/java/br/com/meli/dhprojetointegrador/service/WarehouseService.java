package br.com.meli.dhprojetointegrador.service;

import org.springframework.stereotype.Service;

import br.com.meli.dhprojetointegrador.entity.Section;
import br.com.meli.dhprojetointegrador.entity.Warehouse;
import br.com.meli.dhprojetointegrador.exception.BusinessValidatorException;
import br.com.meli.dhprojetointegrador.repository.WarehouseRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WarehouseService {

    private WarehouseRepository warehouseRepository;

    public Warehouse findWarehouseIdBySection(Section section) {
        return warehouseRepository.findBySections(section)
                .orElseThrow(() -> new BusinessValidatorException("Warehouse not found, section id invalid"));
    }
}
