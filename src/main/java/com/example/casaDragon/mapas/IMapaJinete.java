package com.example.casaDragon.mapas;


import com.example.casaDragon.DTO.DragonDTO;
import com.example.casaDragon.DTO.JineteDTO;
import com.example.casaDragon.models.Dragon;
import com.example.casaDragon.models.Jinete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaJinete {

    @Mappings({
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "edad", target = "edad")
    })

    public JineteDTO mapearJinete(Jinete jinete);
    public List<JineteDTO> mapearListaJinetes(List<Jinete> listaJinetes);
}
