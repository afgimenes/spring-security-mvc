package com.administrador.criador.security.repository.projection;

import com.administrador.criador.security.domain.Especialidade;
import com.administrador.criador.security.domain.Medico;
import com.administrador.criador.security.domain.Paciente;

public interface HistoricoPaciente {

	Long getId();
	
	Paciente getPaciente();
	
	String getDataConsulta();
	
	Medico getMedico();
	
	Especialidade getEspecialidade();
}
