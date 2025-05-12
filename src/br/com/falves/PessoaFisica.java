/**
 * @author falvesmac
 */

package br.com.falves;

public class PessoaFisica extends Pessoa {

  private Long cpf;

  private String dataNascimento;

  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}