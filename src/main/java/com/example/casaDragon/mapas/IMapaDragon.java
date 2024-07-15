package com.example.casaDragon.mapas;

import com.example.casaDragon.DTO.DragonDTO;
import com.example.casaDragon.models.Dragon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaDragon {

    @Mappings({
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "edad", target = "edad")
    })

    public DragonDTO mapearDragon(Dragon dragon);
    public List<DragonDTO> mapearListaDragones(List<Dragon> listaDragones);
}
