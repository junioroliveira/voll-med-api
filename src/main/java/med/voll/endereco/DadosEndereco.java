package med.voll.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(
    
    @NotBlank
    String logradouro, 

    @NotBlank
    String bairro,
    
    @NotBlank
    String cep,

    @NotBlank
    String cidade,
    
    @NotBlank
    String uf,

    @NotBlank
    String numero,
     
    String complemento) {

}
