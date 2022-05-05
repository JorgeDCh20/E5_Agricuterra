package pe.edu.upc.controllers;

import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceimpls.UsuarioServiceImpl;
import java.io.Serializable;

@Named
@ViewScoped
public class LogInController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioServiceImpl uService;

	private Usuario u;

	@PostConstruct
	public void init() {
		this.u = new Usuario();
	}

	public String authentication() {
		String redirect = null;

		try {
			Optional<Usuario> userFound = this.uService.authentication(u);

			if (userFound.isPresent()) {
				// Almacenar en la sesi�n de JSF
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("u", userFound.get());
				redirect = "/panel?faces-redirect=true";
			} else {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return redirect;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	
}
