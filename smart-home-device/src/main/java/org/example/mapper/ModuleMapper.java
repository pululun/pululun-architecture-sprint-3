package org.example.mapper;

import org.example.dto.Module;
import org.example.entity.ModuleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ModuleMapper {

    Module moduleEntityToModule(ModuleEntity moduleEntity);

    ModuleEntity moduleToModuleEntity(Module module);

    List<Module> moduleEntitiesToModules(List<ModuleEntity> moduleEntities);

    List<ModuleEntity> modulesToModuleEntities(List<Module> modules);

}
