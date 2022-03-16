package ec.edu.uce;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Artista;
import ec.edu.uce.service.IArtistaService;
import ec.edu.uce.service.deberes.ICajeroBancarioService;
import ec.edu.uce.service.deberes.ICuentaBancariaDService;
import ec.edu.uce.service.deberes.ICuentaHabienteService;
import ec.edu.uce.service.deberes.IHistoricoRetirosService;

@SpringBootApplication
public class GrupoExpoJdlApplication implements CommandLineRunner{
	
	@Autowired
	private ICuentaBancariaDService cuentaBancDService;
	@Autowired
	private ICuentaHabienteService cuentaHabienteService;
	@Autowired
	private IHistoricoRetirosService histoRetirosService;
	@Autowired
	private ICajeroBancarioService cajeroBancService;
	@Autowired
	private IArtistaService artistaService;
	

	public static void main(String[] args) {
		SpringApplication.run(GrupoExpoJdlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
///////////////////////////////////////TRANSACCION CAJERO//////////////////////////////////////
		
//CuentaHabiente cuentaHab = new CuentaHabiente();
//cuentaHab.setNombre("GABRIEL");
//cuentaHab.setApellido("MISTRAL");
//cuentaHab.setCedula("1754496463");
//
//List<CuentaBancariaD> cuentaDatos = new ArrayList<>();
//CuentaBancariaD cbd = new CuentaBancariaD();
//cbd.setNumeroCuenta("015446469496");
//cbd.setSaldo(new BigDecimal(3500));
//cbd.setTipo("Ahorros");
//cbd.setCuentaHabienteBanc(cuentaHab);
//
//cuentaDatos.add(cbd);
//
//cuentaHab.setCuentBancD(cuentaDatos);
//this.cuentaHabienteService.insertarCuentaHabiente(cuentaHab);
//
//CuentaHabiente cuentaHab2 = new CuentaHabiente();
//cuentaHab2.setNombre("DANIELA");
//cuentaHab2.setApellido("TROYA");
//cuentaHab2.setCedula("1749694977");
//
//List<CuentaBancariaD> cuentaDatos2 = new ArrayList<>();
//CuentaBancariaD cbd2 = new CuentaBancariaD();
//cbd2.setNumeroCuenta("031495269554");
//cbd2.setSaldo(new BigDecimal(3000));
//cbd2.setTipo("Ahorros");
//cbd2.setCuentaHabienteBanc(cuentaHab2);
//cuentaDatos2.add(cbd2);
//
//cuentaHab2.setCuentBancD(cuentaDatos2);
//this.cuentaHabienteService.insertarCuentaHabiente(cuentaHab2);
////////////////////////FUNCIONALIDAD/////////////////////
//1
//List<CuentaBancariaD> listBanc = this.cajeroBancService.consultarCuenta("1718496944");
////listBanc.stream().forEach(c->LOG.info(c.toString()));
////LOG.info("La cuenta es: ");
//for(CuentaBancariaD f : listBanc) {
//LOG.info("La cuenta es: " + f.toString());
//}
////2
//this.cajeroBancService.retirarDinero("031495269554", new BigDecimal(100));
//this.cajeroBancService.retirarDinero("031495269554", new BigDecimal(50));
//this.cajeroBancService.retirarDinero("031495269554", new BigDecimal(60));
//this.cajeroBancService.retirarDinero("031495269554", new BigDecimal(40));
//this.cajeroBancService.retirarDinero("031495269554", new BigDecimal(200));

//this.cajeroBancService.retirarDinero("172016106130", new BigDecimal(30));
////3

//LOG.info(" "+ this.cajeroBancService.consultarSaldoCuentaBancaria("172016106130"));
		
		
		//////////////////////////////////////////////////
		
		Artista ar = new Artista();
		ar.setNombre("De");
		ar.setApellido("Ortiz");
		
		this.artistaService.guardarArtista(ar);
		ar.setId(1);
		ar.setPrecio(new BigDecimal(1000));
		this.artistaService.modificarArtista(ar);
		
		
		
	}

}
