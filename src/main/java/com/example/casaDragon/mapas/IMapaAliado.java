package com.example.casaDragon.mapas;

import com.example.casaDragon.DTO.AliadoDto;
import com.example.casaDragon.DTO.DragonDTO;
import com.example.casaDragon.models.Aliado;
import com.example.casaDragon.models.Dragon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaAliado {

    @Mappings({
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "ubicacion", target = "ubicacion")
    })

    public AliadoDto mapearAliado(Aliado aliado);
    public List<AliadoDto> mapearListaAliados(List<Aliado> listaAliados);
}
