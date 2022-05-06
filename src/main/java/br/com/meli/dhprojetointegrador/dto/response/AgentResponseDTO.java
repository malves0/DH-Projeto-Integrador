package br.com.meli.dhprojetointegrador.dto.response;

import br.com.meli.dhprojetointegrador.entity.Agent;
import br.com.meli.dhprojetointegrador.entity.Warehouse;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentResponseDTO {
    private Long id;
    private String name;
    private WarehouseDTO warehouse;

    public AgentResponseDTO(Agent agent) {
        this.id = agent.getId();
        this.name = agent.getName();
        this.warehouse = WarehouseDTO
                .builder()
                .id(agent.getWarehouse().getId())
                .name(agent.getWarehouse().getName())
                .build();
    }
}
