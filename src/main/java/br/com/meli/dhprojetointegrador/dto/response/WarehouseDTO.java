package br.com.meli.dhprojetointegrador.dto.response;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseDTO {
    private Long id;
    private String name;
}
