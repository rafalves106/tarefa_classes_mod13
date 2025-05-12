/**
 * @author falvesmac
 */

package br.com.falves;

public class PessoaJuridica extends Pessoa {

  private Long cnpj;

  private String dataFundacao;

  public Long getCnpj() {
    return cnpj;
  }

  public void setCnpj(Long cnpj) {
    this.cnpj = cnpj;
  }

  public String getDataFundacao() {
    return dataFundacao;
  }

  public void setDataFundacao(String dataFundacao) {
    this.dataFundacao = dataFundacao;
  }
}