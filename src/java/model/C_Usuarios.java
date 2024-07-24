/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class C_Usuarios {
    private String idUsuario,
            senhaAcesso,
            cadastroFuncionario,
            cadastroUsuario,
            cadastroPaciente,
            cadastroEspecialidade,
            cadastroMedico,
            cadastroConvenio,
            agendamentoConsulta,
            cancelamentoConsulta,
            moduloAdministrativo,
            moduloAgendamento,
            moduloAtendimento;
    private int codigoUsuario;

    public C_Usuarios() {
        this.idUsuario = "";
        this.senhaAcesso = "";
        this.cadastroFuncionario = "";
        this.cadastroUsuario = "";
        this.cadastroPaciente = "";
        this.cadastroEspecialidade = "";
        this.cadastroMedico = "";
        this.cadastroConvenio = "";
        this.agendamentoConsulta = "";
        this.cancelamentoConsulta = "";
        this.moduloAdministrativo = "";
        this.moduloAgendamento = "";
        this.moduloAtendimento = "";
        
    }

    public C_Usuarios(String idUsuario, String senhaAcesso, String cadastroFuncionario, String cadastroUsuario, String cadastroPaciente, String cadastroEspecialidade, String cadastroMedico, String cadastroConvenio, String agendamentoConsulta, String cancelamentoConsulta, String moduloAministrativo, String moduloAgendamento, String moduloAtendimento, int codigoUsuario) {
        this.idUsuario = idUsuario;
        this.senhaAcesso = senhaAcesso;
        this.cadastroFuncionario = cadastroFuncionario;
        this.cadastroUsuario = cadastroUsuario;
        this.cadastroPaciente = cadastroPaciente;
        this.cadastroEspecialidade = cadastroEspecialidade;
        this.cadastroMedico = cadastroMedico;
        this.cadastroConvenio = cadastroConvenio;
        this.agendamentoConsulta = agendamentoConsulta;
        this.cancelamentoConsulta = cancelamentoConsulta;
        this.moduloAdministrativo = moduloAdministrativo;
        this.moduloAgendamento = moduloAgendamento;
        this.moduloAtendimento = moduloAtendimento;
        this.codigoUsuario = codigoUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public String getCadastroUsuario() {
        return cadastroUsuario;
    }

    public String getCadastroPaciente() {
        return cadastroPaciente;
    }

    public String getCadastroEspecialidade() {
        return cadastroEspecialidade;
    }

    public String getCadastroMedico() {
        return cadastroMedico;
    }

    public String getCadastroConvenio() {
        return cadastroConvenio;
    }

    public String getAgendamentoConsulta() {
        return agendamentoConsulta;
    }

    public String getCancelamentoConsulta() {
        return cancelamentoConsulta;
    }

    public String getModuloAdministrativo() {
        return moduloAdministrativo;
    }

    public String getModuloAgendamento() {
        return moduloAgendamento;
    }

    public String getModuloAtendimento() {
        return moduloAtendimento;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public void setCadastroUsuario(String cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }

    public void setCadastroPaciente(String cadastroPaciente) {
        this.cadastroPaciente = cadastroPaciente;
    }

    public void setCadastroEspecialidade(String cadastroEspecialidade) {
        this.cadastroEspecialidade = cadastroEspecialidade;
    }

    public void setCadastroMedico(String cadastroMedico) {
        this.cadastroMedico = cadastroMedico;
    }

    public void setCadastroConvenio(String cadastroConvenio) {
        this.cadastroConvenio = cadastroConvenio;
    }

    public void setAgendamentoConsulta(String agendamentoConsulta) {
        this.agendamentoConsulta = agendamentoConsulta;
    }

    public void setCancelamentoConsulta(String cancelamentoConsulta) {
        this.cancelamentoConsulta = cancelamentoConsulta;
    }

    public void setModuloAministrativo(String moduloAministrativo) {
        this.moduloAdministrativo = moduloAdministrativo;
    }

    public void setModuloAgendamento(String moduloAgendamento) {
        this.moduloAgendamento = moduloAgendamento;
    }

    public void setModuloAtendimento(String moduloAtendimento) {
        this.moduloAtendimento = moduloAtendimento;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
    
    
    
}

