package com.campusConnect.CampusConnect.api.dto.errors;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) //para que el padre sea el unico que ponga el serial, no genere dos espacios de memoria
@Data
@SuperBuilder //llama el constructor del padre
@AllArgsConstructor
@NoArgsConstructor
public class ErrorsResp extends BaseErrorResponse {
    //private List<String> errors;
    private List<Map<String,String>> errors; //lista de map u objetos de errores
}