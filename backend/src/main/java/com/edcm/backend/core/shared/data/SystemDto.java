package com.edcm.backend.core.shared.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemDto implements Serializable {
    private Long id;
    private String name;
}
